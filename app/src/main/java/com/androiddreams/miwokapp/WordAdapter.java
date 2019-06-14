package com.androiddreams.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    private int mColorResource;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_list_item, null);
        }

        Word word = (Word) getItem(position);
        ((TextView) convertView.findViewById(R.id.tv_English)).setText(word.getEnglishWord());
        ((TextView) convertView.findViewById(R.id.tv_Miwok)).setText(word.getMiwokWord());

        convertView.setBackgroundResource(mColorResource);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        if (word.hasImage())
            imageView.setImageResource(word.getImageResourceId());
        else
            imageView.setVisibility(View.GONE);
        return convertView;
    }
}
