package com.example.knowledgehub

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
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

    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txCircle1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Want to learn kotlin?")
            builder1.setMessage("proceed further ?")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, KotlinWebView::class.java)
                startActivity(intent)
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.show()
        }
        binding.txCircle2.setOnClickListener {
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Do you know about XML ?")
            builder2.setMessage("EXIT ?")
            builder2.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder2.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            })
            builder2.show()
        }
        binding.txCircle5.setOnClickListener {
            val builder5 =AlertDialog.Builder(this)
            builder5.setTitle("Wanna learn Java ?")
            builder5.setMessage("Proceed further ?")
            builder5.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, JavaWebViewActivity::class.java)
                startActivity(intent)
            })
            builder5.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder5.show()
        }
        binding.txCircle8.setOnClickListener {
            val builder8 = AlertDialog.Builder(this)
            builder8.setTitle("Do you want to know what is Git/GitHub ?")
            builder8.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this, GitHubActivity::class.java)
                startActivity(intent)
            })
            builder8.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder8.show()
        }
        binding.txCircle3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are u familiar with Android Studio ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            })
            builder.show()
        }
        binding.txCircle6.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do you know how to use APIs in your projects ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle7.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do you know how to intigrate database or manage database into project ?")
            builder.setPositiveButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle4.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val tools = arrayOf("Figma", "Adobe XD","Sketch","InVision Studio")
            builder.setTitle("Are u aware of on this design tools ?")
            builder.setMultiChoiceItems(tools,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You have seleceted ${tools[which]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

    }
}

