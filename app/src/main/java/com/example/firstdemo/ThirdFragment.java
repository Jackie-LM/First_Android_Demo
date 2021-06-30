package com.example.firstdemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    private List<Item2> itemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);
        TextView play = (TextView) view.findViewById(R.id.play_3);
        ImageView img = (ImageView) view.findViewById(R.id.noplan_title);
        Typeface iconfont = Typeface.createFromAsset(getActivity().getAssets(), "iconfont.ttf");
        play.setTypeface(iconfont);

        Glide.with(getActivity())
                .load(R.drawable.noplan_title_l)
                .into(img);
        return view;
    }
}
