package com.storm.test1module.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.storm.test1module.R
import com.storm.test1module.databinding.ActivityModuleOneTestBinding


@Route(path="/storm/module_one/act")
class ModuleOneTestActivity : AppCompatActivity() {

    lateinit var  mBinding: ActivityModuleOneTestBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityModuleOneTestBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }
}