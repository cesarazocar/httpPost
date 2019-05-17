package com.example.httppost.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface INodeJS {
/*
    @POST("registerproduct")//nombre del metodo post
    @FormUrlEncoded
    Observable<String> registrarProducto(@Field("barcode") String barcode,
                                         @Field("productname") String productname);*/

    @POST("datos/")//nombre del metodo post
    @FormUrlEncoded
    Observable<String> registrarProducto(@Field("temperatura") String temperatura,
                                         @Field("humedad") String humedad);



}
