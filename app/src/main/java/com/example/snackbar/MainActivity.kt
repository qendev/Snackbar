package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        title = "Snackbar"

        btnSnackBar.setOnClickListener {
            val snackBar = Snackbar.make(it, "I am displaying a snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
            snackBar.setActionTextColor(Color.BLUE)
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(Color.BLACK)
            val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
            textView.setTextColor(Color.WHITE)
            snackBar.show()
        }
    }
}