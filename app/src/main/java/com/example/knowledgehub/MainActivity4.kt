package com.example.knowledgehub

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowledgehub.databinding.ActivityMain4Binding
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity4 : ComponentActivity() {

    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain4Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txCircle1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Wanna learn about Swift ?")
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, SwiftActivity::class.java)
                startActivity(intent)
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.show()
        }

        binding.txCircle2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Have you familiar with Flutter ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Wanna know about",DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, FlutterActivity::class.java)
                startActivity(intent)
            })
            builder.show()
        }

        binding.txCircle3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are u aware of framworks in iOS ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle4.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do u know how to use APIs in ur project ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle5.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do you know what UX/UI is ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
    }
}

