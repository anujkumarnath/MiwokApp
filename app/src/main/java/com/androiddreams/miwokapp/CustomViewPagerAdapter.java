package com.androiddreams.miwokapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    CustomViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new ColorsFragment();
            case 2:
                return new FamilyFragment();
            case 3:
                return new PhraseFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
               return mContext.getString(R.string.category_numbers);
            case 1:
                return mContext.getString(R.string.category_colors);
            case 2:
                return mContext.getString(R.string.category_family);
            case 3:
                return mContext.getString(R.string.category_phrases);
        }
        return null;
    }
}
