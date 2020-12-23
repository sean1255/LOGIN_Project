package com.example.sns_project.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.sns_project.R;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder> {
    private String mDataset;

    public static class GalleryViewHolder extends RecyclerView.ViewHolder {

        public TextView;
        public GalleryViewHolder(TextView) {
            super(v);

        }
    }

    public GalleryAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public GalleryAdapter.GalleryViewHolder oncreateViewHolder(ViewGroup parent,
                                                               int viewType) {

        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        GalleryViewHolder vh = new GalleryViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(GalleryViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length();
    }

}
