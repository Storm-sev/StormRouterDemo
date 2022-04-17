package com.storm.stormrouterdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient.FileChooserParams.parseResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.contract.ActivityResultContracts.*
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.storm.stormrouterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity";
    }

    lateinit var mBinding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpListener();
    }

    private fun setUpListener() {
        mBinding.tvStart.setOnClickListener {
            ARouter.getInstance().build("/storm/module/act")
                .withString("storm", "传递过来的数值").navigation(this, 1001)

        }
    }

//
//
//        registerForActivityResult(
//            ActivityResultContracts.StartActivityForResult()
//        ) { result ->
//            val data = result.data
//            val resultCode = result.resultCode
//            val extra = data?.getStringExtra("fuck")
//            Log.d(TAG, "获取到回传的值 --> $extra")
//
//        }


//        registerForActivityResult(object: ActivityResultContracts(){
//
//        }){
//            result ->
//            val extra = result?.data?.getStringExtra("fuck")
//            Log.d(TAG, "获取到回传的值 哈哈 --> $extra")
//        }


//    }


//
//    var onActivityResult = object : ActivityResultCallback<ActivityResult> {
//        override fun onActivityResult(result: ActivityResult?) {
//            val extra = result?.data?.getStringExtra("fuck")
//            Log.d(TAG, "获取到回传的值 哈哈 --> $extra")
//
//        }
//    }

//    var launcher: ActivityResultLauncher<Intent> =
//        registerForActivityResult(ActivityResultContracts.StartActivityForResult()
//        ) { result ->
//            val extra = result?.data?.getStringExtra("fuck")
//            Log.d(TAG, "获取到回传的值 哈哈 --> $extra")
//        }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val extra = data?.getStringExtra("fuck")
        Log.d(TAG, "获取到回传的值 --> $extra")

    }
}