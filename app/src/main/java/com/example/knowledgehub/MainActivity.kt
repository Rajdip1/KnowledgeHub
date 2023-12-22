package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLetgo = findViewById<Button>(R.id.btnLetgo)
        val cardContanct = findViewById<CardView>(R.id.cardContact)

        btnLetgo.setOnClickListener {
            //by clicking on it going to second screen
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

        cardContanct.setOnClickListener {
            //redirects to our instagram page
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com")
            startActivity(intent)
        }
    }
}

