package com.example.knowledgehub

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class PythonActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.python_activity_main)

        val pythonWebView = findViewById<WebView>(R.id.pythonWebView)
        pythonWebViewSetUp(pythonWebView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun pythonWebViewSetUp(pythonWebView: WebView?) {

        pythonWebView?.webViewClient = WebViewClient()

        pythonWebView?.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

            loadUrl("https://www.geeksforgeeks.org/python-programming-language/")
        }
    }
}

