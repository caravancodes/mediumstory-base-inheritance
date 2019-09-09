package com.frogobox.baseinheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
