package com.nhahv0902.notebook.ui

import android.databinding.BaseObservable

/**
 * Created by nhahv0902 on 7/25/17.
 * BaseViewModel
 */
abstract class BaseViewModel : BaseObservable() {
    abstract fun onStart()
    abstract fun onStop()
}
