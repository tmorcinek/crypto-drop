package com.cryptomap.note

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cryptomap.R
import com.cryptomap.common.utils.component
import com.morcinek.androidutils.utils.startActivity
import kotlinx.android.synthetic.main.home.*
import org.jetbrains.anko.onClick

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        component.inject(this)

        setSupportActionBar(toolbar)

        fab.onClick { startActivity<NoteActivity>() }
    }
}