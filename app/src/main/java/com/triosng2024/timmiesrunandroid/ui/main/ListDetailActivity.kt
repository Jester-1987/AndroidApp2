package com.triosng2024.timmiesrunandroid.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.triosng2024.timmiesrunandroid.MainActivity
import com.triosng2024.timmiesrunandroid.R
import com.triosng2024.timmiesrunandroid.ui.main.ui.main.ListDetailFragment
import models.TaskList

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_activity)

        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)!!

        title = list.name

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}