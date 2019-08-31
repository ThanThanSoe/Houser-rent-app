package com.padcmyanmar.padc9.house_buying_and_renting.View.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.house_buying_and_renting.data.vos.HotelVO;
import com.padcmyanmar.padc9.house_buying_and_renting.delegates.EventItemDelegate;

public class EventItemViewHolder extends BaseViewHolder<HotelVO> {

private EventItemDelegate mEventItemDelegate;

public EventItemViewHolder(@NonNull View itemView, EventItemDelegate delegate) {
        super(itemView);
        this.mEventItemDelegate = delegate;
        itemView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        mEventItemDelegate.onTapEventItem();
        }
        });
        }

        @Override
        public void bindData(HotelVO data) {

        }
}
