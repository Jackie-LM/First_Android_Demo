package com.example.firstdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView viewNum;
        TextView description;
        TextView title;
        TextView duration;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_img);
            viewNum = (TextView) itemView.findViewById(R.id.view_number_text);
            description = (TextView) itemView.findViewById(R.id.description_text);
            title = (TextView) itemView.findViewById(R.id.item_info_text);
            duration = (TextView) itemView.findViewById(R.id.time_duration_text);
        }
    }

    private List<Item> mitemList;

    public ItemAdapter(List<Item> itemList) {
        mitemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = mitemList.get(position);
        holder.img.setImageResource(item.getImgId());
        holder.duration.setText(item.getDuration());
        holder.title.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.viewNum.setText(item.getViews());
    }

    @Override
    public int getItemCount() {
        return mitemList.size();
    }
}
