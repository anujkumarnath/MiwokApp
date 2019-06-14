package com.androiddreams.miwokapp;

public class Word {
    private String mMiwokWord;
    private String mEnglishWord;
    private int mSoundResourceId;
    //private final int NO_IMAGE_PROVIDED = -1;
    //private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mImageResourceId = -1;

    public Word(String englishWord, String miwokWord, int soundResourceId) {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mSoundResourceId = soundResourceId;
    }

    public Word(String englishWord, String miwokWord, int imageResourceId, int soundResourceId) {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getEnglishWord() {
        return mEnglishWord;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        //return mImageResourceId != NO_IMAGE_PROVIDED;
        return mImageResourceId != -1;
    }
}
