package com.thatta.espejitoespejito.views

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.thatta.espejitoespejito.databinding.ActivityMainBinding
import com.thatta.espejitoespejito.viewModels.MainActivityViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainActivityViewModel>()
    private val sharedPreferences by lazy { getSharedPreferences("API_KEY", MODE_PRIVATE) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
        initObservers()
        openDialog()
    }

    private fun initObservers() {
        viewModel.apiKey.observe(this) {
            Toast.makeText(this, "Se guardó api key", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openDialog() {
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Introduce tu api key de OpenAI")
        val editText = EditText(this)
        dialog.setView(editText)
        dialog.setCancelable(false)
        dialog.setPositiveButton("OK") { _, _ ->
            viewModel.apiKey.value = editText.text.toString()
            sharedPreferences.edit().putString("API_KEY", editText.text.toString()).apply()
        }
        dialog.setNegativeButton("Cancelar") { view, _ ->
            view.dismiss()
        }
        dialog.show()


    }

}