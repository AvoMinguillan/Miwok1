package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ALVARO on 06/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorID) {

        super(context, 0, words);

        mColorID = colorID;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultText);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokText);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.listImage);

        if (currentWord.getImageResourceID() == -1) {

            imageView.setVisibility(View.GONE);
        } else {
            imageView.setVisibility(View.VISIBLE);

            imageView.setImageResource(currentWord.getImageResourceID());
        }

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linearLayout);
        int color = ContextCompat.getColor(getContext(),mColorID);
        linearLayout.setBackgroundColor(color);

        ImageView imageView2 = (ImageView) listItemView.findViewById(R.id.playIcon);
        int colorImage = ContextCompat.getColor(getContext(),mColorID);
        imageView2.setBackgroundColor(colorImage);






        return listItemView;

    }
}
