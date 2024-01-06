package com.example.knowledgehub

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.knowledgehub.databinding.ActivityMain6Binding

class MainActivity6 : ComponentActivity() {

    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain6Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txCircle1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you fluent in HTML/CSS ?")
            builder.setPositiveButton("Yes,I'm",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Not",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val experience = arrayOf("0-1","2","3","4")
            builder.setTitle("How many of work experience do u have on JS ?")
            builder.setSingleChoiceItems(experience,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You selected ${experience[i]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }

        binding.txCircle3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Aware of responsive design ?")
            builder.setPositiveButton("yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("no",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.show()
        }
    }
}

