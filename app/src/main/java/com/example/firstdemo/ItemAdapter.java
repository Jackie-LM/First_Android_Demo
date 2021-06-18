package com.example.firstdemo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder{


        View itemView;
        ImageView img;
        TextView viewNum;
        TextView description;
        TextView title;
        TextView duration;
        TextView play;
        TextView more;


        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            img = (ImageView) itemView.findViewById(R.id.item_img);
            viewNum = (TextView) itemView.findViewById(R.id.view_number_text);
            description = (TextView) itemView.findViewById(R.id.description_text);
            title = (TextView) itemView.findViewById(R.id.item_info_text);
            duration = (TextView) itemView.findViewById(R.id.time_duration_text);
            play = (TextView) itemView.findViewById(R.id.icon_play);
            more = (TextView) itemView.findViewById(R.id.icon_more);

        }
    }

    private List<Item> mitemList;
    private Typeface iconfont;
    Activity activity;

    public ItemAdapter(List<Item> itemList, AssetManager assetManager, Activity act) {
        activity = act;
        mitemList = itemList;
        iconfont = Typeface.createFromAsset(assetManager,"iconfont.ttf");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Item item = mitemList.get(position);

                //second activity
                Intent intent = new Intent(activity,InfoActivity.class);
                intent.putExtra("img",item.getImgId());
                intent.putExtra("name",item.getName());
                intent.putExtra("author",item.getDescription());
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        activity,holder.img, ViewCompat.getTransitionName(holder.img));
                activity.startActivity(intent,compat.toBundle());
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = mitemList.get(position);
        holder.play.setTypeface(iconfont);
        holder.more.setTypeface(iconfont);
        Glide.with(activity)
                .load(item.getImgId())
                .into(holder.img);
//        holder.img.setImageResource(item.getImgId());
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
