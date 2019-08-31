package com.padcmyanmar.padc9.house_buying_and_renting.data.models;

import com.padcmyanmar.padc9.house_buying_and_renting.network.dataagents.EventsDataAgent;
import com.padcmyanmar.padc9.house_buying_and_renting.network.dataagents.HttpUrlConnectionDataAgentImpl;

public abstract class BaseModel {
    protected EventsDataAgent mDataAgent;

    BaseModel(){
        mDataAgent = HttpUrlConnectionDataAgentImpl.getObjInstance();
    }
}
