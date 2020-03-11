package com.smarifrahman.aws.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarifrahman.aws.R;
import com.smarifrahman.aws.databinding.FragmentTakeAssessmentBinding;
import com.smarifrahman.aws.ui.activity.TimeAndWithoutTime;

/**
 * A simple {@link Fragment} subclass.
 */
public class TakeAssessmentFragment extends Fragment implements View.OnClickListener {
    FragmentTakeAssessmentBinding takeAssessmentBinding;
    Context mContext;

    public TakeAssessmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mContext = getActivity();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_take_assessment, container, false);
        takeAssessmentBinding = DataBindingUtil.setContentView((Activity) mContext, R.layout.fragment_take_assessment);

        takeAssessmentBinding.randomCv.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.random_cv:
                startActivity(new Intent(mContext, TimeAndWithoutTime.class));
                break;
        }
    }
}
