package com.m.samplelibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.m.calculation.Sum

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = Sum.add(2, 3)
        Toast.makeText(this, "myValue $value", Toast.LENGTH_SHORT).show()
    }
}
