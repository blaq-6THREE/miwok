package com.example.android.miwok;

import android.content.Context;
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
 * Created by Dryzzle on 6/19/17.
 */

public class WordAdaptor extends ArrayAdapter<Word>
{

    private int numbers_category;
    public WordAdaptor(Context context, ArrayList<Word> words, int numbers_category)
    {
        super(context, 0, words);
        this.numbers_category = numbers_category;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent)
    {
        View listViewItem = convertView;
        if (listViewItem == null)
        {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwok = listViewItem.findViewById(R.id.miwok_text_view);
        miwok.setText(currentWord.getMiwokTranslation());

        TextView english = listViewItem.findViewById(R.id.default_text_view);
        english.setText(currentWord.getDefualtTranslation());

        ImageView image = listViewItem.findViewById(R.id.image);

        if (currentWord.hasImage())
        {
            image.setImageResource(currentWord.getImageResourceID());
            image.setVisibility(View.VISIBLE);
        }
        else
        {
            image.setVisibility(View.GONE);
        }

        //This sets the different background colors of the various categories
        View textContainer = listViewItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), numbers_category);
        textContainer.setBackgroundColor(color);

        return listViewItem;
    }
}
