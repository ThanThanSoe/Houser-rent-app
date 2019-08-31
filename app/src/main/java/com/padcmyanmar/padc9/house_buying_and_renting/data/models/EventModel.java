package com.padcmyanmar.padc9.house_buying_and_renting.data.models;

import com.padcmyanmar.padc9.house_buying_and_renting.data.vos.HotelVO;
import com.padcmyanmar.padc9.house_buying_and_renting.network.dataagents.EventsDataAgent;

import java.util.List;

public interface EventModel {
    void getEvents(EventsDataAgent.GetEventsFromNetworkDelegate delegate);

    interface GetEventsFromNetworkDelegate{
        void onSuccess(List<HotelVO> events);
        void onFailure(String errorMessage);
    }
}
