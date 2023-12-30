package com.example.knowledgehub

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
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
import com.example.knowledgehub.databinding.ActivityMain2Binding
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity2 : ComponentActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cardAndroid.setOnClickListener {
            Toast.makeText(applicationContext, "Android skills", Toast.LENGTH_SHORT).show()

            //redirects to android skills guide
            val intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

        binding.cardIos.setOnClickListener {
            Toast.makeText(applicationContext,"iOS skills", Toast.LENGTH_SHORT).show()

            //redirects to ios skills guide
            val intent = Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.cardCybers.setOnClickListener {
            Toast.makeText(applicationContext, "Cyber Security skills", Toast.LENGTH_SHORT ).show()

            //redirects to cyber security skills guide
            val intent = Intent(applicationContext, MainActivity5::class.java)
            startActivity(intent)
        }

        binding.cardWeb.setOnClickListener {
            Toast.makeText(applicationContext, "Web Dev Skills", Toast.LENGTH_SHORT).show()

            //redirects to web dev skills guide
            val intent = Intent(applicationContext, MainActivity6::class.java)
            startActivity(intent)
        }

        binding.cardMl.setOnClickListener {
            Toast.makeText(applicationContext,"ML skills",Toast.LENGTH_SHORT).show()

            //redirects to machine learning guide
            val intent = Intent(applicationContext, MainActivity7::class.java)
            startActivity(intent)
        }

        binding.cardDatas.setOnClickListener {
            Toast.makeText(applicationContext,"Data Science skills", Toast.LENGTH_SHORT).show()

            //redirects to data science skills guide
            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
        }

    }
}

