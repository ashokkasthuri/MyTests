
package com.map.ustinnovation.testcall;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Util {

  public static ArrayList<Repository> retrieveRepositoriesFromResponse(String response) throws
          JSONException {
    if (null == response) {
      return new ArrayList<>();
    }
    JSONObject jsonObject = new JSONObject(response);
//    JSONArray jsonArray = new JSONArray(response);
    ArrayList<Repository> repositories = new ArrayList<>();
    Repository repository = new Repository();
    if (jsonObject.has("title")) {
      repository.setName(jsonObject.getString("title"));
    }
    repositories.add(repository);

//    for (int i = 0; i < jsonArray.length(); i++) {
//      JSONObject jsonObject = jsonArray.getJSONObject(i);
//      if (null != jsonObject) {
//        Repository repository = new Repository();
////        if (jsonObject.has("owner")) {
////          JSONObject owner = jsonObject.getJSONObject("owner");
////          if (owner.has("login")) {
////            String ownerName = owner.getString("login");
////            repository.setOwner(repository.new Owner(ownerName));
////          }
////        }
//        if (jsonObject.has("name")) {
//          repository.setName(jsonObject.getString("name"));
//        }
//        repositories.add(repository);
//      }
//    }
    return repositories;
  }
}
