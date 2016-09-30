package com.cryptomap.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cryptomap.R
import com.cryptomap.common.utils.component
import kotlinx.android.synthetic.main.home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        component.inject(this)

        setSupportActionBar(toolbar)
    }
}
