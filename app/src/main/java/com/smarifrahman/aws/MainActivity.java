package com.smarifrahman.aws;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarifrahman.aws.databinding.ActivityMainBinding;
import com.smarifrahman.aws.ui.fragment.ShowQuestionsFragment;
import com.smarifrahman.aws.ui.fragment.TakeAssessmentFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    TakeAssessmentFragment takeAssessmentFragment;
    ShowQuestionsFragment showQuestionsFragment;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        takeAssessmentFragment = new TakeAssessmentFragment();
        showQuestionsFragment = new ShowQuestionsFragment();

        replaceFragment(takeAssessmentFragment);

        mainBinding.bottomNavigation.setOnNavigationItemSelectedListener(this);
    }


    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.take_assessment_id) {
            replaceFragment(takeAssessmentFragment);
            return true;
        } else if (id == R.id.show_question_id) {
            replaceFragment(showQuestionsFragment);
            return true;
        }
        return false;
    }
}
