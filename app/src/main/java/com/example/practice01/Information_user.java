package com.example.practice01;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Information_user implements Parcelable {

    String name,age, school_name;

    public Information_user(String name, String age, String school_name) {
        this.name = name;
        this.age = age;
        this.school_name = school_name;
    }


    protected Information_user(Parcel in) {
        name = in.readString();
        age = in.readString();
        school_name = in.readString();
    }

    public static final Creator<Information_user> CREATOR = new Creator<Information_user>() {
        @Override
        public Information_user createFromParcel(Parcel in) {
            return new Information_user(in);
        }

        @Override
        public Information_user[] newArray(int size) {
            return new Information_user[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(age);
        parcel.writeString(school_name);
    }
}
