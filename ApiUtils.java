package com.map.ustinnovation.testcall;

/**
 * Created by ustinnovation on 01/10/2017.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://52.41.242.254/phpmyadmin/";

    public static RetrofitAPI getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(RetrofitAPI.class);
    }
}