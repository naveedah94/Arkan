package com.arkan.arkan.DashboardFragments.DiscussionFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arkan.arkan.R;


/**
 * Created by mbp on 26/01/2017.
 */

public class FragmentBoardMembers extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_board_members, container, false);

        return view;
    }
}
