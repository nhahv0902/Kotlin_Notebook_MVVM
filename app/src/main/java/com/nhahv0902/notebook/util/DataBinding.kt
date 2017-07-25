package com.nhahv0902.notebook.util

import android.databinding.BindingAdapter
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import com.nhahv0902.notebook.R
import com.nhahv0902.notebook.ui.main.MainViewModel

/**
 * Created by nhahv0902 on 7/25/17.
 * <>
 */


@BindingAdapter("view_pager", "view_model")
fun bottomView(view: BottomNavigationView, viewPager: ViewPager, viewModel: MainViewModel) {
    view.setOnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_notebook -> {
                viewPager.currentItem = 0
                viewModel.currentItem = 0
            }
            R.id.nav_new_notebook -> {
                viewModel.onStartNewNotebook()
            }
            R.id.nav_setting -> {
                viewPager.currentItem = 1
                viewModel.currentItem = 1
            }
            else -> return@setOnNavigationItemSelectedListener false
        }
        return@setOnNavigationItemSelectedListener true
    }

    viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {

        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        }

        override fun onPageSelected(position: Int) {
            view.selectedItemId = if (position == 0) R.id.nav_notebook else R.id.nav_setting
        }
    })
}

@BindingAdapter("current_item")
fun currentItemBottomView(view: BottomNavigationView, currentItem: Int) {
    view.selectedItemId = if (currentItem == 0) R.id.nav_notebook else R.id.nav_setting
}
