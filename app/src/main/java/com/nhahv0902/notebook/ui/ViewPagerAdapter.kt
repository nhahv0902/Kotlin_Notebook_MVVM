package com.nhahv0902.notebook.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by nhahv0902 on 7/25/17.
 * <.
 */

class ViewPagerAdapter(val fragments: ArrayList<Fragment>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var currentItem: Int = 0
    override fun getItem(position: Int): Fragment {
        currentItem = position
        return fragments[position]
    }

    override fun getCount(): Int = fragments.size
}
