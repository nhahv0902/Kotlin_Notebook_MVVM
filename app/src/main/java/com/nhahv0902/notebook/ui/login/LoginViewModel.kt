package com.nhahv0902.notebook.ui.login

import com.nhahv0902.notebook.ui.BaseViewModel
import com.nhahv0902.notebook.ui.main.MainActivity
import com.nhahv0902.notebook.util.Navigator


/**
 * Exposes the data to be used in the Login screen.
 */

class LoginViewModel(val navigator: Navigator) : BaseViewModel() {


    fun onFacebookLogin() {
        navigator.startActivity<MainActivity>()
    }

    fun onGoogleLogin() {
        navigator.startActivity<MainActivity>()
    }
}
