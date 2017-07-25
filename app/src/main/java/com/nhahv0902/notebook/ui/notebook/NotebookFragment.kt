package com.nhahv0902.notebook.ui.notebook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nhahv0902.notebook.databinding.FragmentNotebookBinding
import com.nhahv0902.notebook.ui.BaseFragment

/**
 * Notebook Screen.
 */
class NotebookFragment : BaseFragment() {

    private var mViewModel: NotebookViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = NotebookViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentNotebookBinding.inflate(inflater, container, false)
        binding.viewModel = mViewModel
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        mViewModel?.onStart()
    }

    override fun onStop() {
        mViewModel?.onStop()
        super.onStop()
    }

    companion object {
        fun newInstance(): NotebookFragment {
            return NotebookFragment()
        }
    }
}
