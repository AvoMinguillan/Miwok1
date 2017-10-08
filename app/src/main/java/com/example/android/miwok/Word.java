package com.example.android.miwok;

/**
 * Created by ALVARO on 06/10/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = -1;
        mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }



    public int getAudioResourceID() {
        return mAudioResourceID;
    }
}