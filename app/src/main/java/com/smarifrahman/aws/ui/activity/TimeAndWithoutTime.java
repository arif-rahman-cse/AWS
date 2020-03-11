package com.smarifrahman.aws.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.smarifrahman.aws.R;
import com.smarifrahman.aws.databinding.ActivityTimeAndWithoutTimeBinding;

public class TimeAndWithoutTime extends AppCompatActivity implements View.OnClickListener {
    ActivityTimeAndWithoutTimeBinding timeAndWithoutTimeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_and_without_time);
        timeAndWithoutTimeBinding = DataBindingUtil.setContentView(this, R.layout.activity_time_and_without_time);

        timeAndWithoutTimeBinding.timeBased.setOnClickListener(this);
        timeAndWithoutTimeBinding.withoutTimeBased.setOnClickListener(this);

    }

    @Override 
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.time_based:
                timeAndWithoutTimeBinding.timeBased.setCardBackgroundColor(getResources().getColor(R.color.light_blue));
                timeAndWithoutTimeBinding.withoutTimeBased.setCardBackgroundColor(getResources().getColor(R.color.white));
                timeAndWithoutTimeBinding.getStaredBtn.setVisibility(View.VISIBLE);
                break;

            case R.id.without_time_based:
                timeAndWithoutTimeBinding.withoutTimeBased.setCardBackgroundColor(getResources().getColor(R.color.light_blue));
                timeAndWithoutTimeBinding.timeBased.setCardBackgroundColor(getResources().getColor(R.color.white));
                timeAndWithoutTimeBinding.getStaredBtn.setVisibility(View.VISIBLE);
                break;
        }
    }
}
