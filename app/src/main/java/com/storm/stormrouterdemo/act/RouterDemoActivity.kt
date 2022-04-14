package com.storm.stormrouterdemo.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.storm.stormrouterdemo.R

@Route(path = "/storm/RouterDemoAct")
class RouterDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_router_demo)
    }
}