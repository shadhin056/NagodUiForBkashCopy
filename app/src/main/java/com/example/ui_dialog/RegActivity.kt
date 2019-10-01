package com.example.ui_dialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.widget.ScrollView
import android.widget.TextView

class RegActivity : AppCompatActivity() {
    internal lateinit var svCheck: ScrollView
    internal lateinit var txtAccept: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
       // svCheck = findViewById(R.id.svCheck)
       // txtAccept = findViewById(R.id.txtAccept)
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
}
