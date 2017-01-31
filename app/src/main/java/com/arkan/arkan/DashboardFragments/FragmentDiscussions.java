package com.arkan.arkan.DashboardFragments;

import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.arkan.arkan.DashboardFragments.DiscussionFragments.FragmentAuditCommittee;
import com.arkan.arkan.DashboardFragments.DiscussionFragments.FragmentBoardMembers;
import com.arkan.arkan.DashboardFragments.DiscussionFragments.FragmentMyTasks;
import com.arkan.arkan.DashboardFragments.DiscussionFragments.FragmentRemunerationCommittee;
import com.arkan.arkan.DashboardFragments.DiscussionFragments.FragmentTopManagement;
import com.arkan.arkan.R;


/**
 * Created by mbp on 26/01/2017.
 */

public class FragmentDiscussions extends Fragment {
    View view;
    ImageButton myTasksBtn, topManagementBtn, boardMembersBtn, remunerationBtn, auditBtn;
    private String currentTab, previousTab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_discussions, container, false);

        initializations();
        onClickListeners();
        loadMyTasksFragment();
        previousTab = "my tasks";
        return view;
    }

    private void onClickListeners() {
        myTasksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTab = "my tasks";
                myTasksBtn.setBackground(getResources().getDrawable(R.drawable.all_tasks_h));
                setIcons();
                loadMyTasksFragment();
                previousTab = currentTab;
            }
        });

        topManagementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTab = "top management";
                topManagementBtn.setBackground(getResources().getDrawable(R.drawable.top_management_selected));
                setIcons();
                loadTopManagementFragment();
                previousTab = currentTab;
            }
        });

        boardMembersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTab = "board members";
                boardMembersBtn.setBackground(getResources().getDrawable(R.drawable.board_members_selected));
                setIcons();
                loadBoardMembersFragment();
                previousTab = currentTab;
            }
        });

        remunerationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTab = "remuneration";
                remunerationBtn.setBackground(getResources().getDrawable(R.drawable.remuneration_committee_selected));
                setIcons();
                loadRemunerationFragment();
                previousTab = currentTab;
            }
        });

        auditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTab = "audit";
                auditBtn.setBackground(getResources().getDrawable(R.drawable.audit_commitee_selected));
                setIcons();
                loadAuditFragment();
                previousTab = currentTab;
            }
        });
    }

    private void loadAuditFragment() {
        Fragment fragment = new FragmentAuditCommittee();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.discussions_frame_layout, fragment, "audit_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadRemunerationFragment() {
        Fragment fragment = new FragmentRemunerationCommittee();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.discussions_frame_layout, fragment, "remuneration_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadBoardMembersFragment() {
        Fragment fragment = new FragmentBoardMembers();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.discussions_frame_layout, fragment, "board_members_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadTopManagementFragment() {
        Fragment fragment = new FragmentTopManagement();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.discussions_frame_layout, fragment, "top_management_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void loadMyTasksFragment() {
        Fragment fragment = new FragmentMyTasks();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
        }
        FragmentTransaction transaction = this.getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.discussions_frame_layout, fragment, "my_tasks_fragment");
        transaction.addToBackStack(null).commit();
    }

    private void setIcons() {
        switch (previousTab){
            case "my tasks":
                myTasksBtn.setBackground(getResources().getDrawable(R.drawable.all_tasks_n));
                break;
            case "top management":
                topManagementBtn.setBackground(getResources().getDrawable(R.drawable.top_management));
                break;
            case "board members":
                boardMembersBtn.setBackground(getResources().getDrawable(R.drawable.board_members));
                break;
            case "remuneration":
                remunerationBtn.setBackground(getResources().getDrawable(R.drawable.remuneration_committee));
                break;
            case "audit":
                auditBtn.setBackground(getResources().getDrawable(R.drawable.audit_commitee));
                break;
        }
    }

    private void initializations() {
        myTasksBtn = (ImageButton) view
                .findViewById(R.id.top_my_tasks_btn);
        topManagementBtn = (ImageButton) view
                .findViewById(R.id.top_management_btn);
        boardMembersBtn = (ImageButton) view
                .findViewById(R.id.top_board_members_btn);
        remunerationBtn = (ImageButton) view
                .findViewById(R.id.top_remuneration_btn);
        auditBtn = (ImageButton) view
                .findViewById(R.id.audit_committee_btn);

        currentTab = "";
        previousTab = "";
    }
}
