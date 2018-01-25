package com.mills.b.joshua.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese","Hamburger", "Pizza", "Indian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            selectedFoodTxt.text = foodlist[randomFood]
        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()

            if(!newFood.isNullOrBlank() && !foodlist.contains(newFood))
                    foodlist.add(newFood)
            addFoodTxt.text.clear()
        }
    }
}
