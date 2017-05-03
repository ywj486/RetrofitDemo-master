package com.szl.retrofitdemo;

import android.util.Log;

import com.orhanobut.logger.Logger;

import okhttp3.FormBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @ explain:
 * @ author：xujun on 2016-8-25 15:17
 * @ email：gdutxiaoxu@163.com
 */
public class NewsModel {

    public static void postLive() {
        APi api = Network.getInstance().getApi();
        FormBody body = new FormBody.Builder().add("type","1").add("page","1").build();
        Call<LiveBean> call = api.getLive(body);

        call.enqueue(new Callback<LiveBean>() {
            @Override
            public void onResponse(Call<LiveBean> call, Response<LiveBean> response) {
                Log.i("TAG","-----------------"+response.body().getResult().getList().get(0).getData().getLive_name());
            }

            @Override
            public void onFailure(Call<LiveBean> call, Throwable t) {
                Logger.i("onResponse:   ="+t.getMessage());

            }
        });

    }
}
