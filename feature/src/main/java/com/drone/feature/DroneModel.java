package com.drone.feature;

public enum DroneModel {
    FIRST_SCREEN(R.string.drone_1, R.layout.drone_1),
    SECOND_SCREEN(R.string.drone_2, R.layout.drone_2);

    private int mTitleResourceId;
    private int mLayoutResourceId;

    DroneModel(int titleResId, int layoutResId) {
        mTitleResourceId = titleResId;
        mLayoutResourceId = layoutResId;
    }

    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    public int getLayoutResourceId() {
        return mLayoutResourceId;
    }
}
