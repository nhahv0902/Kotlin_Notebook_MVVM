package com.nhahv0902.notebook.ui

import android.databinding.BaseObservable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by nhahv0902 on 7/25/17.
 * BaseViewModel
 */
abstract class BaseViewModel : BaseObservable() {

    private val mDisposable: CompositeDisposable = CompositeDisposable()


    fun onStart() {

    }

    fun onStop() {
        stopSubscriptions()
    }

    fun startSubscriber(disposable: Disposable) {
        mDisposable.add(disposable)
    }

    fun stopSubscriptions() {
        if (mDisposable.isDisposed) mDisposable.dispose()
    }
}
