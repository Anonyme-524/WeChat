package com.example.wechat

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wechat.Fruit
import com.example.wechat.R
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
//    private val data = listOf("苹果","香蕉","榴莲","橙子","草莓","芒果","哈密瓜","提子","龙眼","荔枝","西瓜","猕猴桃","橘子","番石榴","人参果","黑加仑")
    private val fruitList=ArrayList<Fruit>()

    private fun intiFruits(){
        repeat(2)
        {
            fruitList.add(Fruit("子鼠","中秋国庆快乐[动态表情]",R.drawable.animal_0))
            fruitList.add(Fruit("丑牛","中秋国庆快乐",R.drawable.animal_1))
            fruitList.add(Fruit("寅虎","中秋国庆快乐",R.drawable.animal_2))
            fruitList.add(Fruit("卯兔","中秋国庆快乐",R.drawable.animal_3))
            fruitList.add(Fruit("辰龙","中秋国庆快乐",R.drawable.animal_4))
            fruitList.add(Fruit("巳蛇","中秋国庆快乐",R.drawable.animal_5))
            fruitList.add(Fruit("午马","中秋国庆快乐",R.drawable.animal_6))
            fruitList.add(Fruit("未羊","中秋国庆快乐",R.drawable.animal_7))
            fruitList.add(Fruit("申猴","中秋国庆快乐",R.drawable.animal_8))
            fruitList.add(Fruit("酉鸡","中秋国庆快乐",R.drawable.animal_9))
            fruitList.add(Fruit("戌狗","中秋国庆快乐",R.drawable.animal_10))
            fruitList.add(Fruit("亥猪","中秋国庆快乐",R.drawable.animal_11))
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intiFruits()

        //上下文,列表子视图,数据源
//        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,data)
        val fruitAdapter = FruitAdapter(this,R.layout.fruit_item,fruitList)
        //绑定到控件
//        listViewTest.adapter = adapter
        listViewTest.adapter = fruitAdapter

        listViewTest.setOnItemClickListener { _,_,i,_->
            val fruit=fruitList[i]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }

    }

}