package com.triosng2024.timmiesrunandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.triosng2024.timmiesrunandroid.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}