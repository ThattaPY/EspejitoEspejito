package com.thatta.espejitoespejito.views

import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.thatta.espejitoespejito.databinding.ActivityMainBinding
import com.thatta.espejitoespejito.viewModels.MainActivityViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainActivityViewModel>()

    // Languages included
    val languages = listOf(
        "English", "Tamil", "Hindi", "Spanish", "French",
        "Arabic", "Chinese", "Japanese", "German"
    )

    // Language codes
    val lCodes = listOf(
        "en-US", "ta-IN", "hi-IN", "es-CL", "fr-FR",
        "ar-SA", "zh-TW", "jp-JP", "de-DE"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
        viewModel

    }

    // activity result launcher to start intent
    var activityResultLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback { result ->
            // if result is not empty
            if (result.resultCode == RESULT_OK && result.data != null) {
                // get data and append it to editText
                val d = result.data!!.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
                etText.setText(etText.getText() + " " + d[0])
            }
        })
}