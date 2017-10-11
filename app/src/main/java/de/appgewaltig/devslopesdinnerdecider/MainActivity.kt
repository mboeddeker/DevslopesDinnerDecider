package de.appgewaltig.devslopesdinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","Mc Donald's", "Tacco Bell")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            var randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            if (!newFood.isEmpty()){
                foodList.add(newFood)
                println(foodList)
                addFoodTxt.text.clear()
            } else {
                Toast.makeText(this, "Bitte auch etwas eingeben", Toast.LENGTH_SHORT).show()
                addFoodTxt.text.clear()
            }
        }

    }




}
