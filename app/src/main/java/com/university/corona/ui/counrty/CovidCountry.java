package com.university.corona.ui.counrty;

public class CovidCountry {
    String mCovidCountry, mCases , mDeaths , mTodayDeaths , mRecoverd;

    public CovidCountry (String mCovidCountry , String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecoverd = mRecoverd;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }
}
