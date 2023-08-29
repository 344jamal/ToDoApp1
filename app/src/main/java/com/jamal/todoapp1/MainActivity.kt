package com.jamal.todoapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<FoodModule>()
        list.add(FoodModule(R.drawable.dairyfood, "Sandwich", "Break", " A sandwich is a popular and versatile food item made by placing various fillings between two slices of bread. Sandwiches are enjoyed by people all over the world and can be customized to suit a wide range of tastes and dietary preferences.", FoodStatus.Pending))
        list.add(FoodModule(R.drawable.chickentigh, "Thigh", "Lunch", " Chicken thighs are a popular cut of meat from the chicken, known for their rich flavor and tender texture. They are widely used in cooking and are favored by many for their versatility and ability to work well in various dishes.", FoodStatus.Failed))
        list.add(FoodModule(R.drawable.chips, "Chips", "Evening Meal", " Chips can refer to different types of food, depending on where you are and the context. In some places, chips commonly refer to what Americans might call fries (French fries), while in other places, chips refer to what Americans call potato chips.", FoodStatus.Completed))
        list.add(FoodModule(R.drawable.delfinofood, "Delfino", "Dinner", " \"Posho\" is a term that is commonly used in East Africa to refer to a type of maize porridge that is a staple food in the region. It's also known by different names in various countries, such as \"ugali\" in Kenya and Tanzania, \"sadza\" in Zimbabwe, and \"nsima\" in Malawi. This dish is a significant part of the diet in many East African countries and is typically served as a base for various types of stews, sauces, and meats, such as chicken.", FoodStatus.Postponed))
        list.add(FoodModule(R.drawable.rawchicken, "Raw", "Super", " Raw chicken refers to chicken meat that has not been cooked or heat-treated in any way. It's important to handle raw chicken properly to ensure food safety and prevent the risk of foodborne illnesses caused by harmful bacteria like Salmonella and Campylobacter,", FoodStatus.Pending))
        list.add(FoodModule(R.drawable.roastedchicken, "Roasted", "Dinner", " Roasted chicken is a classic and delicious dish that involves cooking a whole chicken in an oven, resulting in crispy skin, tender meat, and a flavorful aroma. It's a versatile dish that can be prepared with various seasonings and served as a centerpiece for meals or used as an ingredient in other recipes", FoodStatus.Completed))
        list.add(FoodModule(R.drawable.veges, "Veges", "Evening Tea", " Vegetables are edible parts of plants that are commonly consumed for their nutritional value, flavors, and versatility in cooking. They play a crucial role in a balanced diet, providing essential vitamins, minerals, fiber, and various other health benefits", FoodStatus.Failed))

        val foodAdapter = FoodAdapter(this, list)
        val myrecylerView = findViewById<RecyclerView>(R.id.recyclerView)
        myrecylerView.adapter = foodAdapter
        myrecylerView.layoutManager = GridLayoutManager(this, 2)

        val fab = findViewById<FloatingActionButton>(R.id.fab_button)
        fab.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }

    }
}