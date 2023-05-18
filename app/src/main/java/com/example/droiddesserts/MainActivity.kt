package com.example.droiddesserts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @DrawableRes
    private var imageId: Int =0
    private var imageName: String = ""

    companion object{
        const val KEY_IMAGE = "KEY_IMAGE"
        const val KEY_NAME = "KEY_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivDonuts:ImageView = findViewById(R.id.ivDonuts)
        val ivIcecream:ImageView = findViewById(R.id.ivIceCream)
        val ivFroyo:ImageView = findViewById(R.id.ivFroyo)


        ivDonuts.setOnClickListener{

            imageId = R.drawable.donut_circle
            imageName = getString(R.string.ivDonuts)


        }

        ivIcecream.setOnClickListener {
            imageId = R.drawable.icecream_circle
            imageName = getString(R.string.ivIcecream)
            Toast.makeText(this,"Icem cream sanduwiches have chocolate and vanila filling",Toast.LENGTH_LONG).show()
        }

        ivFroyo.setOnClickListener {
            imageId = R.drawable.froyo_circle
            imageName = getString(R.string.ivFrozen)

            Toast.makeText(this, "FroYo is premium serve frozenyogurt", Toast.LENGTH_LONG).show()
        }

        val floatongBotton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        floatongBotton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)


            intent.putExtra(KEY_IMAGE,imageId)
            intent.putExtra(KEY_NAME,imageName)

            startActivity(intent)
        }





    }
}