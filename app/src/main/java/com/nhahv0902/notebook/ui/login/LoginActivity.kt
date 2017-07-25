package com.nhahv0902.notebook.ui.login

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.nhahv0902.notebook.R
import com.nhahv0902.notebook.databinding.ActivityLoginBinding
import com.nhahv0902.notebook.ui.BaseActivity
import com.nhahv0902.notebook.util.Navigator

/**
 * Login UI.
 */
class LoginActivity : BaseActivity() {

    private var mViewModel: LoginViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel = LoginViewModel(Navigator(this))
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
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
