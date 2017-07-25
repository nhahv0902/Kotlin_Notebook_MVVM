package com.nhahv0902.notebook.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.nhahv0902.notebook.R
import com.nhahv0902.notebook.databinding.ActivityMainBinding
import com.nhahv0902.notebook.ui.BaseActivity

/**
 * Main UI.
 */
class MainActivity : BaseActivity() {

    private var mViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = MainViewModel()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mViewModel
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }
}
