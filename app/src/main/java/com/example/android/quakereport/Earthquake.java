package com.example.android.quakereport;

public class Earthquake {
    private final Double magnitude;
    private final String place;
    private final long mTimeInMilliseconds;
    private final String url;

    public Earthquake(Double earthquakeMagnitude, String earthquakeLocation, long timeInMilliseconds, String websiteUrl){
        magnitude = earthquakeMagnitude;
        place = earthquakeLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        url = websiteUrl;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getPlace() {
        return place;
    }

    public String getUrl(){
        return url;
    }

}
