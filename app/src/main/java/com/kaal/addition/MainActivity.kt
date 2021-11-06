package com.kaal.addition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val i = Intent(this, ResultActivity::class.java)
            val result = etNum1.text.toString().toInt() + etNum2.text.toString().toInt()
            i.putExtra("result", result)
            startActivity(i)
        }
    }
}