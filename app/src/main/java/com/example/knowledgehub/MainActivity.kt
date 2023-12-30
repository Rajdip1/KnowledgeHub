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
import com.example.knowledgehub.databinding.ActivityMainBinding
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLetgo.setOnClickListener {
            //by clicking on it going to second screen
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
        binding.cardContact.setOnClickListener {
            //redirects to our instagram page
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com")
            startActivity(intent)
        }
    }
}

