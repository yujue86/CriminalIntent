package com.example.mengxl.criminalintent;

import java.util.UUID;

/**
 * Created by mengxl on 15/11/4.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
