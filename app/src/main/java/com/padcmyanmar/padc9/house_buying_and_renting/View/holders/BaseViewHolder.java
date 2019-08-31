package com.padcmyanmar.padc9.house_buying_and_renting.View.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    private T mData;
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindData(T data);
}
