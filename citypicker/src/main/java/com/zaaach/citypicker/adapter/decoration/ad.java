package com.zaaach.citypicker.adapter.decoration;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.zaaach.citypicker.adapter.GridListAdapter;

/**
 * Created by C-yl on 2018/6/15.
 */

public class ad extends RecyclerView.Adapter<ad.VierHolder> {
    @NonNull
    @Override
    public VierHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VierHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }

    public class VierHolder extends RecyclerView.ViewHolder {
        public VierHolder(View itemView) {
            super(itemView);
        }
    }
}
