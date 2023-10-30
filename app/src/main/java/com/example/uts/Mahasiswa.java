package com.example.uts;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {
    private String name;
    private String nim;
    private Integer photo;
    private String alamat;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.nim);
        dest.writeInt(this.photo);
        dest.writeString(this.alamat);
        dest.writeString(this.email);
    }
    Mahasiswa() {
    }
    private Mahasiswa(Parcel in) {
        this.name = in.readString();
        this.nim = in.readString();
        this.photo = in.readInt();
        this.alamat = in.readString();
        this.email = in.readString();
    }
    public static final Creator<Mahasiswa> CREATOR = new Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel source) {
            return new Mahasiswa(source);
        }
        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }

}
