package com.arkan.arkan.Webservices.Retrofit;


import com.arkan.arkan.Webservices.ArkanAPI.ArkanAPI;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by mbp on 30/01/2017.
 */

public class RetrofitClient {
    public static Retrofit retrofit;
    public static ArkanAPI service;
    public static Call<ResponseBody> call;
    public static RequestBody requestBody;

    public static String baseURL = "";

    public static void createRetrofitInstance(){
        retrofit = new retrofit2.Retrofit.Builder().baseUrl(baseURL).build();
        service = retrofit.create(ArkanAPI.class);
    }

    public static void setRequestBody(String body){
        requestBody = RequestBody.create(MediaType.parse("text/plain"), body);
    }

    public static Call<ResponseBody> getCallObject(String serviceType){
        switch(serviceType){
            case "login":
//                return service.login(requestBody);
                return null;
            default:
                return null;
        }
    }
}
