package edu.lambton.roomify.landlord.view.questionnaire.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class QuestionnairePagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragments;

    public QuestionnairePagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
