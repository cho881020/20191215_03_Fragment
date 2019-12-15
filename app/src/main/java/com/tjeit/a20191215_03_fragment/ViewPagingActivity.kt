package com.tjeit.a20191215_03_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjeit.a20191215_03_fragment.adapters.MainViewPagerAdapater
import kotlinx.android.synthetic.main.activity_view_paging.*

class ViewPagingActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_paging)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mainViewPager.adapter = MainViewPagerAdapater(supportFragmentManager)

        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}
