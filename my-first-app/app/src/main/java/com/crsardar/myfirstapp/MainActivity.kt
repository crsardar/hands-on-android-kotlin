package com.crsardar.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyframe1)
    }

    fun onClick(view: View){

        // A simple animation
        val constraintLayout: ConstraintLayout = findViewById(R.id.constraint_layout)
        val constraintSet = ConstraintSet()
        constraintSet.load(this, R.layout.keyframe2)
        TransitionManager.beginDelayedTransition(constraintLayout)
        constraintSet.applyTo(constraintLayout)
    }
}