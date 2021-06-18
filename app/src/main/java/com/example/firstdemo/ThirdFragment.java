package com.example.firstdemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    private List<Item2> itemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);
        TextView play = (TextView) view.findViewById(R.id.play_3);
        Typeface iconfont = Typeface.createFromAsset(getActivity().getAssets(), "iconfont.ttf");
        play.setTypeface(iconfont);
        return view;
    }
}
