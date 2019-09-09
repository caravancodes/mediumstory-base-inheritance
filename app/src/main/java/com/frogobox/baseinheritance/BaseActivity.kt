package com.frogobox.baseinheritance

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * BaseInheritance
 * Copyright (C) 09/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.baseinheritance
 *
 */
abstract class BaseActivity : AppCompatActivity() {

    lateinit var mActivity: AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this

    }

    protected inline fun <reified ClassActivity> baseStartActivity(context: Context) {
        context.startActivity(Intent(context, ClassActivity::class.java))
    }

}