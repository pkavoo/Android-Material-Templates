package com.mediatechindo.wahyu.materialuikit.template.GalleryCategory.Style7;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mediatechindo.wahyu.materialuikit.BuildConfig;
import com.mediatechindo.wahyu.materialuikit.R;

import java.util.ArrayList;

/**
 * Created by Wahyu on 06/08/2015.
 */
public class GalleryStyle7LastAdapter extends RecyclerView.Adapter<GalleryStyle7LastAdapter.ItemViewHolder> {
    private static ArrayList<GalleryStyle7LastModel> dataList;
    private LayoutInflater mInflater;
    private Context context;

    public GalleryStyle7LastAdapter(Context ctx, ArrayList<GalleryStyle7LastModel> data) {
        context = ctx;
        dataList = data;
        mInflater = LayoutInflater.from(context);
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private LinearLayout lastItemCover;
        private RelativeLayout itemCheckIndicator;

        public ItemViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.imageMain);
            lastItemCover = (LinearLayout) itemView.findViewById(R.id.lastItemCover);
            itemCheckIndicator = (RelativeLayout) itemView.findViewById(R.id.itemCheckIndicator);
        }

    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_gallery7, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder,final int position) {
        Glide.with(context)
                .load(BuildConfig.IMAGE_URL + dataList.get(position).getImageUrl())
                .thumbnail(0.01f)
                .centerCrop()
                .into(holder.image);

        if ((position+1) == dataList.size()){
            holder.lastItemCover.setVisibility(View.VISIBLE);
        }else{
            holder.lastItemCover.setVisibility(View.GONE);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((position+1) < dataList.size()) {
                    int pos = position + 1;
                    Toast.makeText(context, "Item "+ pos+" clicked!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context, "More clicked!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
