package com.example.ui_dialog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ScrollView
import android.widget.TextView


class RegActivity : AppCompatActivity() {
    internal lateinit var svCheck: ScrollView
    internal lateinit var txtAccept: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)


       // svCheck = findViewById(R.id.svCheck)
        txtAccept = findViewById(R.id.txtAccept)
        val RightSwipe = AnimationUtils.loadAnimation(this, R.anim.right_swipe)
        txtAccept.startAnimation(RightSwipe)
       // val writer = Typewriter(this)
        //setContentView(writer)

        //Add a character every 150ms
        //writer.setCharacterDelay(150)
        //txtAccept.text= writer.animateText(txtAccept.text.toString()).toString()


        //txtAccept.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        //txtAccept.clearAnimation();
      // RunAnimation()
       /* svCheck.getViewTreeObserver()
                .addOnScrollChangedListener(ViewTreeObserver.OnScrollChangedListener {
                    if (svCheck.getChildAt(0).getBottom() <= svCheck.getHeight() + svCheck.getScrollY()) {
                        //scroll view is at bottom
                        txtAccept.visibility=View.VISIBLE
                    } else {
                        //scroll view is not at bottom
                        txtAccept.visibility=View.GONE
                    }
                })*/
    }
    private fun RunAnimation() {
        val a = AnimationUtils.loadAnimation(this, R.anim.scale)
        a.reset()

        txtAccept.clearAnimation()
        txtAccept.startAnimation(a)
    }

}
