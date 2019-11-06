package com.example.android.miwok;

/**
 * Created by Dryzzle on 6/19/17.
 */

public class Word
{
    private String mDefualtTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation ,String mMiwokTranslation, int mAudioTranslation)
    {
        this.mDefualtTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioTranslation = mAudioTranslation;
    }

    public Word(String mDefaultTranslation ,String mMiwokTranslation, int mImageResourceID, int mAudioTranslation)
    {
        this.mDefualtTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioTranslation = mAudioTranslation;
    }

    public String getDefualtTranslation() {
        return mDefualtTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getAudioTranslation() {
        return mAudioTranslation;
    }

    public boolean hasImage()
    {
        return getImageResourceID() != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefualtTranslation='" + mDefualtTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioTranslation=" + mAudioTranslation +
                '}';
    }
}
