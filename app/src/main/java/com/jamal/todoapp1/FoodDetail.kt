package com.jamal.todoapp1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

class FoodDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val image = intent.getIntExtra("image",1)
        val name = intent.getStringExtra("name")
        val mealtype = intent.getStringExtra("mealtype")
        val des = intent.getStringExtra("description")
        //val status = intent.getParcelableExtra("status", FoodStatus::class.java)
        val status = intent.getSerializableExtra("status")
        Log.d("status", "$status")

        val icon = findViewById<ImageView>(R.id.imageDetail)
        icon.setImageResource(image)
        val detailname = findViewById<TextView>(R.id.detailName)
        detailname.setText(name)
        val detailmeal = findViewById<TextView>(R.id.detailMealtype)
        detailmeal.setText(mealtype)
        val detailDes = findViewById<TextView>(R.id.detailDes)
        detailDes.setText(des)
        val button = findViewById<Button>(R.id.detailButton)
        button.setOnClickListener {
            button.text = status.toString()
        }

    }
}