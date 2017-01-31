package com.arkan.arkan.Activities;


import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

import com.arkan.arkan.DashboardFragments.FragmentAnnouncements;
import com.arkan.arkan.DashboardFragments.FragmentAssets;
import com.arkan.arkan.DashboardFragments.FragmentDiscussions;
import com.arkan.arkan.DashboardFragments.FragmentMeetings;
import com.arkan.arkan.DashboardFragments.FragmentTasks;
import com.arkan.arkan.R;

public class DashboardActivity extends AppCompatActivity {

    ImageButton meetingsBtn, announcementsBtn, discussionsBtn, myTasksBtn, digitalAssetsBtn;
    private String previousSelectedTab, currentSelectedTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initializations();
        onClickListeners();
    }

    private void onClickListeners() {
        meetingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                meetingsBtn.setBackground(getResources().getDrawable(R.drawable.meeting_selected));
                currentSelectedTab = "meetings";
                setTabImages();
                previousSelectedTab = currentSelectedTab;
                loadMeetingsFragment();
            }
        });

        announcementsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                announcementsBtn.setBackground(getResources().getDrawable(R.drawable.announcement_selected));
                currentSelectedTab = "announcements";
                setTabImages();
                previousSelectedTab = currentSelectedTab;
                loadAnnouncementsFragment();
            }
        });

        discussionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                discussionsBtn.setBackground(getResources().getDrawable(R.drawable.discussion_forum_selected));
                currentSelectedTab = "discussions";
                setTabImages();
                previousSelectedTab = currentSelectedTab;
                loadDiscussionsFragment();
            }
        });

        myTasksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTasksBtn.setBackground(getResources().getDrawable(R.drawable.my_task_selected));
                currentSelectedTab = "tasks";
                setTabImages();
                previousSelectedTab = currentSelectedTab;
                loadTasksFragment();
            }
        });

        digitalAssetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                digitalAssetsBtn.setBackground(getResources().getDrawable(R.drawable.digital_asset_selected));
                currentSelectedTab = "assets";
                setTabImages();
                previousSelectedTab = currentSelectedTab;
                loadAssetsFragment();
            }
        });
    }

    private void loadAssetsFragment() {
        Fragment fragment = new FragmentAssets();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, fragment, "assets_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadTasksFragment() {
        Fragment fragment = new FragmentTasks();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, fragment, "fragment_tasks");
        transaction.addToBackStack(null).commit();
    }

    private void loadDiscussionsFragment() {
        Fragment fragment = new FragmentDiscussions();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, fragment, "fragment_discussions");
        transaction.addToBackStack(null).commit();
    }

    private void loadAnnouncementsFragment() {
        Fragment fragment = new FragmentAnnouncements();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, fragment, "announcements_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadMeetingsFragment() {
        Fragment fragment = new FragmentMeetings();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, fragment, "meetings_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void setTabImages() {
        switch (previousSelectedTab){
            case "meetings":
                meetingsBtn.setBackground(getResources().getDrawable(R.drawable.meeting));
                break;
            case "announcements":
                announcementsBtn.setBackground(getResources().getDrawable(R.drawable.announcement));
                break;
            case "discussions":
                discussionsBtn.setBackground(getResources().getDrawable(R.drawable.discussion_forum));
                break;
            case "tasks":
                myTasksBtn.setBackground(getResources().getDrawable(R.drawable.my_task));
                break;
            case "assets":
                digitalAssetsBtn.setBackground(getResources().getDrawable(R.drawable.digital_asset));
                break;
            default:
                break;
        }
    }

    private void initializations() {
        meetingsBtn = (ImageButton) findViewById(R.id.meetings_tab_btn);
        announcementsBtn = (ImageButton) findViewById(R.id.announcement_tab_btn);
        discussionsBtn = (ImageButton) findViewById(R.id.discussion_tab_btn);
        myTasksBtn = (ImageButton) findViewById(R.id.my_tasks_tab_btn);
        digitalAssetsBtn = (ImageButton) findViewById(R.id.digital_assets_tab_btn);

        previousSelectedTab = "";
        currentSelectedTab = "";
    }
}
