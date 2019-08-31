package com.padcmyanmar.padc9.house_buying_and_renting.data.models;

import com.padcmyanmar.padc9.house_buying_and_renting.data.vos.HotelVO;
import com.padcmyanmar.padc9.house_buying_and_renting.network.dataagents.EventsDataAgent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventModelImpl extends BaseModel implements EventModel {

    private Map<Integer, HotelVO> eventsDataRespository;

    private static EventModelImpl objInstance;

    private EventModelImpl(){
        eventsDataRespository = new HashMap<>();
    }

    private static EventModelImpl getObjInstance(){
        if (objInstance == null){
            objInstance = new EventModelImpl();
        }
        return objInstance;
    }

    public List<HotelVO> getAllEvents(){
        return null;
    }
    @Override
    public void getEvents(final EventsDataAgent.GetEventsFromNetworkDelegate delegate) {
        mDataAgent.getEvents(new EventsDataAgent.GetEventsFromNetworkDelegate() {
            @Override
            public void onSuccess(List<HotelVO> events) {
                delegate.onSuccess(events);
            }

            @Override
            public void onFailure(String errorMessage) {
                delegate.onFailure(errorMessage);
            }
        });
    }
}
