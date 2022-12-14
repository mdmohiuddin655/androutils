package com.picon.utils.callbacks;

import com.google.android.material.tabs.TabLayout;

public interface OnTabEventListener extends TabLayout.OnTabSelectedListener {

    @Override
    void onTabSelected(TabLayout.Tab tab);

    @Override
    default void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    default void onTabReselected(TabLayout.Tab tab) {
    }
}
