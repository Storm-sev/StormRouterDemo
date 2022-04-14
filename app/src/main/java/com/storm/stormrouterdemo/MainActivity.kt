package com.storm.stormrouterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.storm.stormrouterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpListener();
    }

    private fun setUpListener() {
        mBinding.tvStart.setOnClickListener {
            ARouter.getInstance().build("/storm/RouterDemoAct").navigation();
        }
    }
}