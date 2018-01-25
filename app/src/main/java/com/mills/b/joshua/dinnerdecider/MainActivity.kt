package com.mills.b.joshua.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese","Hamburger", "Pizza", "Indian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtnClicked()
        addBtnClicked()
    }

    fun addBtnClicked(){
        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            if(isGoodData(newFood))
                foodList.add(newFood)
            addFoodTxt.text.clear()
        }
    }

    fun decideBtnClicked(){
        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
    }

    fun isGoodData(item: String): Boolean{
        return !item.isNullOrBlank() && !foodList.contains(item)
    }
}
