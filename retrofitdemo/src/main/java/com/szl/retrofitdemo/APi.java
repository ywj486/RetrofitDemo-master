package com.szl.retrofitdemo;

import okhttp3.FormBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @ explain:
 * @ author：xujun on 2016-8-25 15:06
 * @ email：gdutxiaoxu@163.com
 */
public interface APi {
//请求直播列表
//    @FormUrlEncoded
    @POST("live/find.json")
    Call<LiveBean> getLive(@Body FormBody body);
}
