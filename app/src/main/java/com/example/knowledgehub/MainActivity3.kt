package com.example.knowledgehub

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowledgehub.databinding.ActivityMain3Binding
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity3 : ComponentActivity() {

    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txCircle1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Did u like it?")
            builder1.setMessage("wanna sure to exit?")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }
        binding.txCircle2.setOnClickListener {
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Did u like it ?")
            builder2.setMessage("EXIT ?")
            builder2.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder2.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }

    }
}

