package com.example.knowledgehub

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
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
import com.example.knowledgehub.databinding.ActivityMain5Binding
import com.example.knowledgehub.ui.theme.KnowledgeHubTheme

class MainActivity5 : ComponentActivity() {

    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain5Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txCircle1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Any idea about Python ?")
            builder.setPositiveButton("Want to learn", DialogInterface.OnClickListener { dialogInterface, i ->
                val intent = Intent(this,PythonActivity::class.java)
                startActivity(intent)
            })
            builder.setNegativeButton("Don't want to learn",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.show()
        }
        binding.txCircle2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do you know what is networking ?")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
        binding.txCircle3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Can you perform digital forensics ?")
            builder.setPositiveButton("Yes,I'm",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Nope",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
        binding.txCircle4.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Have u ever heard of INFOSEC ?")
            builder.setPositiveButton("I guess",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No idea", DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
        binding.txCircle5.setOnClickListener {
            val builder =AlertDialog.Builder(this)
            val hacking = arrayOf("White hat","Gray hat","Black hat")
            builder.setTitle("Which type of hacking do you perform ?")
            builder.setMultiChoiceItems(hacking,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You selected ${hacking[which]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
        binding.txCircle6.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Have knowledge of Linux OS ?")
            builder.setPositiveButton("I have",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
    }
}
