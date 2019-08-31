package com.padcmyanmar.padc9.house_buying_and_renting.network.dataagents;

import com.padcmyanmar.padc9.house_buying_and_renting.data.vos.HotelVO;

import java.util.List;

public interface EventsDataAgent {

    void getEvents(GetEventsFromNetworkDelegate delegate);

    interface GetEventsFromNetworkDelegate{
        void onSuccess(List<HotelVO> events);
        void onFailure(String errorMessage);
    }
}
