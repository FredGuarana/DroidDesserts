package com.example.droiddesserts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivDonuts:ImageView = findViewById(R.id.ivDonuts)
        val ivIcecream:ImageView = findViewById(R.id.ivIceCream)
        val ivFroyo:ImageView = findViewById(R.id.ivFroyo)

        ivDonuts.setOnClickListener{
            Toast.makeText(this, "Donuts are glazed and sprintkled with candy.", Toast.LENGTH_LONG).show()

        }

        ivIcecream.setOnClickListener {
            Toast.makeText(this,"Icem cream sanduwiches have chocolate and vanila filling",Toast.LENGTH_LONG).show()
        }

        ivFroyo.setOnClickListener {
            Toast.makeText(this, "FroYo is premium serve frozenyogurt", Toast.LENGTH_LONG).show()
        }


    }
}