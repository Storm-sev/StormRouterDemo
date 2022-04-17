package com.storm.test1module.act

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.storm.test1module.R
import com.storm.test1module.databinding.ActivityModuleOneTestBinding


@Route(path="/storm/module/act")
class ModuleOneTestActivity : AppCompatActivity() {

    companion object{

        val TAG = "ModuleOneTestActivity"
    }
    @Autowired
    @kotlin.jvm.JvmField
    var  storm: String? = null; ;
    lateinit var  mBinding: ActivityModuleOneTestBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityModuleOneTestBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        ARouter.getInstance().inject(this)
        Log.d(TAG, "获取到的参数-> $storm")


        setUpListener();
    }

    private fun setUpListener() {
        mBinding.tvBack.setOnClickListener {
            //
            var intent = Intent()
            intent.putExtra("fuck","回传的值 ok")
            setResult(RESULT_OK, intent)
            finish();

        }
    }
}