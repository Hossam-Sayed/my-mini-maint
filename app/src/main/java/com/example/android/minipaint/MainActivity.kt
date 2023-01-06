package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this)
//        Allows this view (custom view) to fill the whole screen
        myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
//        Just a content description for the view
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}