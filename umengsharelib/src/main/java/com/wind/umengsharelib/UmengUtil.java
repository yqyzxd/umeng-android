package com.wind.umengsharelib;

import android.content.Context;
import android.content.Intent;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by wind on 2018/3/29.
 */

public class UmengUtil {
    public static final String WEIXIN_APPKEY = "wxd213c13b6b856ecb";
    public static final String WEIXIN_SECRET = "d4624c36b6795d1d99dcf0547af5443d";

    public static final String QZONE_APPKEY = "1104928476";
    public static final String QZONE_SECRET = "yt4oADXMwqQdLMie";

    /**
     * QQ与新浪不需要添加Activity，但需要在使用QQ分享或者授权的Activity中，
     * 注意onActivityResult不可在fragment中实现，如果在fragment中调用登录或分享，需要在fragment依赖的Activity中实现
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public static void onActivityResult(Context context, int requestCode, int resultCode, Intent data) {
        UMShareAPI.get(context).onActivityResult(requestCode, resultCode, data);
    }

    public static void initUmeng(Context context) {
        try {

            /**
             * 初始化common库
             * 参数1:上下文，不能为空
             * 参数2:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
             * 参数3:Push推送业务的secret
             */
            //u-app初始化
            //UMConfigure.init(context,"5abb4772f43e48568d000111","umeng", UMConfigure.DEVICE_TYPE_PHONE, "");
            UMConfigure.init(context, UMConfigure.DEVICE_TYPE_PHONE, "");

            //u-share初始化
            initUMShareAPI(context);

            PlatformConfig.setWeixin(WEIXIN_APPKEY, WEIXIN_SECRET);
            PlatformConfig.setQQZone(QZONE_APPKEY, QZONE_SECRET);

            PlatformConfig.setWXFileProvider("com.marryu");//微信分享图片必须设置
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void preInitUmeng(Context context) {
        UMConfigure.preInit(context, "", "");
    }

    /**
     * 这个初始化最好放在application的程序入口中，防止意外发生：
     *
     * @param context
     */
    public static void initUMShareAPI(Context context) {
        UMShareAPI.get(context);
    }


    public static void onEvent(Context context, String eventId) {
        MobclickAgent.onEvent(context, eventId);

    }


}
