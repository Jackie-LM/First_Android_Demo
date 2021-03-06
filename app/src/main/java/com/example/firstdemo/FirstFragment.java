package com.example.firstdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private List<Item> itemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Glide.with(this)
                .load(R.drawable.title_img)
                .into((ImageView)view.findViewById(R.id.title_img));

        initItems();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter adapter = new ItemAdapter(itemList,getContext().getAssets(),getActivity());
        recyclerView.setAdapter(adapter);
        return view;
    }

    private int randomInt(){
        return 1 + (int)(Math.random() * (100));
    }

    private void initItems(){
        Item item1 = new Item("Peaceful Moments from the Witcher",randomInt(),randomInt(),randomInt(),
                "Adam Skorupa",R.drawable.item1_l);
        itemList.add(item1);
        Item item2 = new Item("Aimer - Romeo et Juliette",randomInt(),randomInt(),randomInt(),
                "Gerard Presgurvic",R.drawable.item2_l);
        itemList.add(item2);
        Item item3 = new Item("Welcome to the Rock",randomInt(),randomInt(),randomInt(),
                "Broadway Cast",R.drawable.item3_l);
        itemList.add(item3);
        Item item4 = new Item("Wenn ich tanzen will",randomInt(),randomInt(),randomInt(),
                "Mia",R.drawable.item4_l);
        itemList.add(item4);
        Item item5 = new Item("Popular",randomInt(),randomInt(),randomInt(),
                "Kristin Chenoweth",R.drawable.item5_l);
        itemList.add(item5);
        Item item6 = new Item("La gloire a mes genoux",randomInt(),randomInt(),randomInt(),
                "Come",R.drawable.item6_l);
        itemList.add(item6);
        Item item7 = new Item("Satisfied",randomInt(),randomInt(),randomInt(),
                "Renee",R.drawable.item7_l);
        itemList.add(item7);
    }
}
