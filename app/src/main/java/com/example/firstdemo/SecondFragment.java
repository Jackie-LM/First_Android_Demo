package com.example.firstdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private List<Item2> itemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);

        Glide.with(this)
                .load(R.drawable.item2_l)
                .into((ImageView) view.findViewById(R.id.image_fra_2));

        Glide.with(this)
                .load(R.drawable.banner_2)
                .into((ImageView)view.findViewById(R.id.banner_fra_2));

        Glide.with(this)
                .load(R.drawable.page_bnr)
                .into((ImageView)view.findViewById(R.id.background_fra_2));

        initItems();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view_2);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter2 adapter = new ItemAdapter2(itemList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initItems(){
        Item2 item1 = new Item2("Peaceful Moments\n from the Witcher", R.drawable.item1);
        itemList.add(item1);
        Item2 item2 = new Item2("Aimer\n Romeo et Juliette", R.drawable.item2);
        itemList.add(item2);
        Item2 item3 = new Item2("Welcome to the Rock", R.drawable.item3);
        itemList.add(item3);
        Item2 item4 = new Item2("Wenn ich tanzen will", R.drawable.item4);
        itemList.add(item4);
        Item2 item5 = new Item2("Popular", R.drawable.item5);
        itemList.add(item5);
        Item2 item6 = new Item2("La gloire a mes genoux", R.drawable.item6);
        itemList.add(item6);
        Item2 item7 = new Item2("Satisfied", R.drawable.item7);
        itemList.add(item7);
    }

}
