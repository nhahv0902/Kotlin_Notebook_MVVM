package com.nhahv0902.notebook.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.nhahv0902.notebook.ui.BaseActivity

/**
 * Created by nhahv0902 on 7/25/17.
 * <>
 */
class Navigator(val activity: Activity) {
    fun startActivity(intent: Intent) {
        activity.startActivity(intent)
    }

    inline fun <reified T : BaseActivity> startActivity() {
        activity.startActivity(Intent(activity.applicationContext, T::class.java))
    }

    fun startActivityForResult(intent: Intent, requestCode: Int) {
        activity.startActivityForResult(intent, requestCode)
    }

    fun getcontext(): Context = activity.applicationContext
}
