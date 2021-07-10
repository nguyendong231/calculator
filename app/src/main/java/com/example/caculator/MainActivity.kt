package com.example.caculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tim nut bam bang id
        var manhinh = findViewById<TextView>(R.id.manhinh)
        // biến màn hình
        // lấy giá trị trong biến màn hình , chuyển qua kiểu string
        val nine = findViewById<Button>(R.id.nine)
        val eight = findViewById<Button>(R.id.eight)
        val seven = findViewById<Button>(R.id.seven)
        val six = findViewById<Button>(R.id.six)
        val five = findViewById<Button>(R.id.five)
        val four = findViewById<Button>(R.id.four)
        val three = findViewById<Button>(R.id.three)
        val two = findViewById<Button>(R.id.two)
        val one = findViewById<Button>(R.id.one)
        val zero = findViewById<Button>(R.id.zero)
        val cham = findViewById<Button>(R.id.cham)
        val bang = findViewById<Button>(R.id.bang)
        val xoa = findViewById<Button>(R.id.xoa)
        val nhan = findViewById<Button>(R.id.nhan)
        val chia = findViewById<Button>(R.id.chia)
        val cong = findViewById<Button>(R.id.cong)
        val tru = findViewById<Button>(R.id.tru)
        val ce = findViewById<Button>(R.id.ce)

        // khi kích dô nút số chín thì test hiện lên màn hình
        //
        nine.setOnClickListener {
            val a= manhinh.text.toString() + "9"
            // 67
            // 679
            //set text để  cho hén đẩy kết quả lên
            manhinh.setText(a)

        }
        eight.setOnClickListener {
            val a= manhinh.text.toString() + "8"
            manhinh.setText(a)
        }
        seven.setOnClickListener {
            val a= manhinh.text.toString() + "7"
            manhinh.setText(a)
        }
        six.setOnClickListener {
            val a= manhinh.text.toString() + "6"
            manhinh.setText(a)
        }
        five.setOnClickListener {
            val a= manhinh.text.toString() + "5"
            manhinh.setText(a)
        }
        four.setOnClickListener {
            val a= manhinh.text.toString() + "4"
            manhinh.setText(a)
        }
        three.setOnClickListener {
            val a= manhinh.text.toString() + "3"
            manhinh.setText(a)
        }
        two.setOnClickListener {
            val a= manhinh.text.toString() + "2"
            manhinh.setText(a)
        }
        one.setOnClickListener {
            val a= manhinh.text.toString() + "1"
            manhinh.setText(a)
        }
        zero.setOnClickListener {
            val a= manhinh.text.toString() + "0"
            manhinh.setText(a)
        }
        cham.setOnClickListener {
            val a= manhinh.text.toString() + "."
            manhinh.setText(a)
        }
        xoa.setOnClickListener {

            manhinh.setText("")
        }
        nhan.setOnClickListener {
            val a= manhinh.text.toString() + "*"
            manhinh.setText(a)
        }
        cong.setOnClickListener {
            val a= manhinh.text.toString() + "+"
            manhinh.setText(a)
        }
        tru.setOnClickListener {
            val a= manhinh.text.toString() + "-"
            manhinh.setText(a)
        }
        chia.setOnClickListener {
            val a= manhinh.text.toString() + "/"
            manhinh.setText(a)
        }
        ce.setOnClickListener {
            var str : String = manhinh.text.toString()
            if(!str.equals("")){
                str = str.substring(0,str.length-1)
                manhinh.text = str
            }
        }

        // cài thêm 1 cái pakege hổ trợ đứa ra kết quả từ chuổi
        // "5667+565+234*5445" => kêt quả



        bang.setOnClickListener {

            try {

                val input = ExpressionBuilder(manhinh.text.toString()).build() // lấy giá trị
                val output = input.evaluate() // tính
                val longOutput = output.toLong()// to long
                Log.e("aaa", longOutput.toString())
                if (output == longOutput.toDouble()){
                    manhinh.setText( longOutput.toString())
                }else{
                    manhinh.setText ( output.toString())
                }

            }catch (e:Exception){
                Toast.makeText(this@MainActivity,e.message,Toast.LENGTH_LONG).show()
            }
        }





    }




}