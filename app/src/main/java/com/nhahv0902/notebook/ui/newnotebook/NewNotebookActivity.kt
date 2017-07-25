package com.nhahv0902.notebook.ui.newnotebook

import android.databinding.DataBindingUtil
import android.os.Bundle

import com.nhahv0902.notebook.R
import com.nhahv0902.notebook.databinding.ActivityNewNotebookBinding
import com.nhahv0902.notebook.ui.BaseActivity

/**
 * NewNotebook UI.
 */
class NewNotebookActivity : BaseActivity() {

    var mViewModel: NewNotebookViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel = NewNotebookViewModel()
        val binding: ActivityNewNotebookBinding = DataBindingUtil.setContentView(this, R.layout.activity_new_notebook)
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
