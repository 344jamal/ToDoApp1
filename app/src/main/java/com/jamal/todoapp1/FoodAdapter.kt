package com.jamal.todoapp1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FoodAdapter(val context: Context, val FoodList:ArrayList<FoodModule>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
class FoodViewHolder(itemView: View): ViewHolder(itemView){
    val image = itemView.findViewById<ImageView>(R.id.imageV)
    val name = itemView.findViewById<TextView>(R.id.textName)
    val mealtype = itemView.findViewById<TextView>(R.id.textMeal)

    val card = itemView.findViewById<CardView>(R.id.cardView)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.food_list, null, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return FoodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.image.setImageResource(FoodList[position].image)
        holder.name.text = FoodList[position].name
        holder.mealtype.text = FoodList[position].mealtype

        holder.card.setOnClickListener {
            val intent = Intent(context, FoodDetail::class.java)
            intent.putExtra("image", FoodList[position].image)
            intent.putExtra("name", FoodList[position].name)
            intent.putExtra("mealtype", FoodList[position].mealtype)
            intent.putExtra("description", FoodList[position].description)
            intent.putExtra("status", FoodList[position].foodStatus)
            context.startActivity(intent)
        }
    }
}