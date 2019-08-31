package com.padcmyanmar.padc9.house_buying_and_renting.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.house_buying_and_renting.View.holders.BaseViewHolder;

import java.util.List;

public abstract class BaseRecyclerAdapter<T extends BaseViewHolder<W>,W> extends RecyclerView.Adapter<T> {
    private List<W> mData;

    @Override
    public void onBindViewHolder(@NonNull T viewHolder, int position) {
        viewHolder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setNewCount(List<W> data){
        mData = data;
        notifyDataSetChanged();

    }
}
