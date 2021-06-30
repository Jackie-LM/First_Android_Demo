package com.example.firstdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ItemAdapter2 extends RecyclerView.Adapter<ItemAdapter2.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_img_2);
            text = (TextView) itemView.findViewById(R.id.item_text_2);
        }
    }

    private List<Item2> mitemList;
    private Activity activity;

    public ItemAdapter2(List<Item2> itemList, Activity act) {
        mitemList = itemList;
        activity = act;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_item_2, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item2 item = mitemList.get(position);

        Glide.with(activity)
                .load(item.getImgId())
                .into(holder.img);
        holder.text.setText(item.getText());
    }

    @Override
    public int getItemCount() {
        return mitemList.size();
    }
}
