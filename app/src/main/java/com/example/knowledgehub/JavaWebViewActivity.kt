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

class JavaWebViewActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.java_webview_main)

        val javaWebView = findViewById<WebView>(R.id.javaWabView)
        webViewSetUp(javaWebView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(javaWebView: WebView?) {

        javaWebView?.webViewClient = WebViewClient()

        javaWebView?.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.javatpoint.com")
        }
    }
}

