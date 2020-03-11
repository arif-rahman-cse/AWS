package com.smarifrahman.aws.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarifrahman.aws.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowQuestionsFragment extends Fragment {

    public ShowQuestionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_questions, container, false);
    }
}
