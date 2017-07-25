package com.nhahv0902.notebook.ui.main

import android.databinding.Bindable
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.nhahv0902.notebook.BR
import com.nhahv0902.notebook.ui.BaseViewModel
import com.nhahv0902.notebook.ui.ViewPagerAdapter
import com.nhahv0902.notebook.ui.newnotebook.NewNotebookActivity
import com.nhahv0902.notebook.ui.notebook.NotebookFragment
import com.nhahv0902.notebook.ui.setting.SettingFragment
import com.nhahv0902.notebook.util.Navigator


/**
 * Exposes the data to be used in the Main screen.
 */

class MainViewModel(val navigator: Navigator, supportFragmentManager: FragmentManager) : BaseViewModel() {
    val fragments: ArrayList<Fragment> = ArrayList()

    var adapter: ViewPagerAdapter
    @get: Bindable
    var currentItem: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.currentItem)
        }

    init {
        fragments.add(NotebookFragment.newInstance())
        fragments.add(SettingFragment.newInstance())
        adapter = ViewPagerAdapter(fragments, supportFragmentManager)
    }



    fun onStartNewNotebook() {
        navigator.startActivity<NewNotebookActivity>()
    }
}
