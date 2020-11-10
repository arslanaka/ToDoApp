package com.example.todo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

public class User implements Parcelable {

    public int id ;
    public String firstName;
    public String Email;
    public String Password;
//    public String date;
    public Date date;


    public User(){

    }


    protected User(Parcel in) {
        id = in.readInt();
        firstName = in.readString();
        Email = in.readString();
        Password = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(firstName);
        dest.writeString(Email);
        dest.writeString(Password);
    }
}
