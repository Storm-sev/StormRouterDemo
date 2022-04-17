package com.storm.stormrouterdemo

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
import com.storm.stormrouterdemo.common.ConfigParams

/**
 * 路由跳转登录拦截器
 */
@Interceptor(priority = 8, name = "login_interceptor")
class RouterLoginInterceptor : IInterceptor {

    lateinit var mContext: Context
    override fun init(context: Context?) {
       context?.let {
           mContext = it
       }

    }

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {

        if (ConfigParams.NOINTERCEPTOR == postcard!!.extras.getString(ConfigParams.NOINTERCEPTOR)){
           callback!!.onContinue(postcard)
        }else{
            //过滤某部分路由不需要拦截
//            when
            callback!!.onContinue(postcard)


        }

    }
}