package com.map.ustinnovation.testcall;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by ustinnovation on 01/10/2017.
 */

public interface RetrofitAPI {
  @GET("/repositories")
  Call<ArrayList<Repository>> retrieveRepositories();

  @POST("/repositories")
  Call<ResponseBody> loginWithCredentials(@Body Post data);


}
