package com.padcmyanmar.padc9.house_buying_and_renting.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.house_buying_and_renting.activities.ItemListDetailFragmentOneActivity;
import com.padcmyanmar.padc9.house_buying_and_renting.R;
import com.padcmyanmar.padc9.house_buying_and_renting.adapter.EventListAdapter;
import com.padcmyanmar.padc9.house_buying_and_renting.delegates.EventItemDelegate;
import com.padcmyanmar.padc9.house_buying_and_renting.delegates.FragmentDelegates;

public class FragmentTwo extends Fragment implements EventItemDelegate {


    private FragmentDelegates fragmentDelegates;
    public static FragmentTwo newInstance() {

        Bundle args = new Bundle();

        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentDelegates = (FragmentDelegates)context;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvEvents = view.findViewById(R.id.rvEvents);
        rvEvents.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        EventListAdapter adapter = new EventListAdapter(this);
        rvEvents.setAdapter(adapter);
    }

    @Override
    public void onTapEventItem() {
        startActivity(new Intent(this.getContext(), ItemListDetailFragmentOneActivity.class));
    }
}
