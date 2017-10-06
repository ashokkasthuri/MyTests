/**
 * Created by ustinnovation on 01/10/2017.
         */


         package com.map.ustinnovation.testcall;


import android.os.Parcel;
import android.os.Parcelable;

public class Repository implements Parcelable {

  private String name;

  private int id1;
  private int id2;


  public Repository() {

  }

  public Repository(String name) {
    setName(name);

  }

  public Repository(Parcel in) {
    String[] data = new String[2];
    in.readStringArray(data);
    this.name = data[0];


  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeStringArray(new String[]{this.name});
  }

  public static final Creator CREATOR = new Creator() {
    public Repository createFromParcel(Parcel in) {
      return new Repository(in);
    }

    public Repository[] newArray(int size) {
      return new Repository[size];
    }
  };

  public class Owner {

    public Owner() {

    }

    public Owner(String login) {
      setLogin(login);
    }

    private String login;

    public String getLogin() {
      return login;
    }

    public void setLogin(String login) {
      this.login = login;
    }

  }
}

