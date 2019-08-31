package com.padcmyanmar.padc9.house_buying_and_renting.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.padcmyanmar.padc9.house_buying_and_renting.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ItemListDetailFragmentOneActivity extends AppCompatActivity {

    /*@BindView(R.id.img_human) ImageView imageView;*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_detail_fragment_one);

        /*ButterKnife.bind(imageView);*/
        ImageView imageOne = findViewById(R.id.img_human);

    }
}