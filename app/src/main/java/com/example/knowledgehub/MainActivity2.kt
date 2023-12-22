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
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val layout = findViewById<LinearLayout>(R.id.LinearLayout)
        val layout1 = findViewById<LinearLayout>(R.id.LinearLayout1)
        val layout2 = findViewById<LinearLayout>(R.id.LinearLayout2)
        val cardAndroid = findViewById<CardView>(R.id.cardAndroid)
        val cardIos = findViewById<CardView>(R.id.cardIos)
        val cardCybers = findViewById<CardView>(R.id.cardCybers)
        val cardWeb = findViewById<CardView>(R.id.cardWeb)
        val cardMl = findViewById<CardView>(R.id.cardMl)
        val cardDatas = findViewById<CardView>(R.id.cardDatas)

        cardAndroid.setOnClickListener {

            Toast.makeText(applicationContext, "Android skills", Toast.LENGTH_SHORT).show()

            //redirects to android skills guide
            val intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

        cardIos.setOnClickListener {

            Toast.makeText(applicationContext,"iOS skills", Toast.LENGTH_SHORT).show()

            //redirects to ios skills guide
            val intent = Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)
        }

        cardCybers.setOnClickListener {

            Toast.makeText(applicationContext, "Cyber Security skills", Toast.LENGTH_SHORT ).show()

            //redirects to cyber security skills guide
            val intent = Intent(applicationContext, MainActivity5::class.java)
            startActivity(intent)
        }

        cardWeb.setOnClickListener {

            Toast.makeText(applicationContext, "Web Dev Skills", Toast.LENGTH_SHORT).show()

            //redirects to web dev skills guide
            val intent = Intent(applicationContext, MainActivity6::class.java)
            startActivity(intent)
        }

        cardMl.setOnClickListener {

            Toast.makeText(applicationContext,"ML skills",Toast.LENGTH_SHORT).show()

            //redirects to machine learning guide
            val intent = Intent(applicationContext, MainActivity7::class.java)
            startActivity(intent)
        }

        cardDatas.setOnClickListener {

            Toast.makeText(applicationContext,"Data Science skills", Toast.LENGTH_SHORT).show()

            //redirects to data science skills guide
            val intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(intent)
        }

    }
}

