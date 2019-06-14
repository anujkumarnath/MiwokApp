package com.androiddreams.miwokapp;

class Word {
    private String mMiwokWord;
    private String mEnglishWord;
    private int mSoundResourceId;
    //private final int NO_IMAGE_PROVIDED = -1;
    //private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mImageResourceId = -1;

    Word(String englishWord, String miwokWord, int soundResourceId) {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mSoundResourceId = soundResourceId;
    }

    Word(String englishWord, String miwokWord, int imageResourceId, int soundResourceId) {
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    String getMiwokWord() {
        return mMiwokWord;
    }

    String getEnglishWord() {
        return mEnglishWord;
    }

    int getSoundResourceId() {
        return mSoundResourceId;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    boolean hasImage() {
        //return mImageResourceId != NO_IMAGE_PROVIDED;
        return mImageResourceId != -1;
    }
}
