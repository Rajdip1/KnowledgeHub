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

class FlutterActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flutter_activity_main)

        val flutterWebView = findViewById<WebView>(R.id.flutterWebView)

        flutterWebSetUp(flutterWebView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun flutterWebSetUp(flutterWebView: WebView?) {

        flutterWebView?.webViewClient = WebViewClient()

        flutterWebView?.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true

            loadUrl("https://flutter.dev/")
        }
    }
}

