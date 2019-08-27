package com.example.fragmentviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Chats(), "CHATS")
        adapter.addFragment(Status(), "STATUS")
        adapter.addFragment(Calls(), "CALLS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
