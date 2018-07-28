package com.example.android.sunshine;

public class WeatherSnapshot {
    private int weatherId;
    private int weatherImageId;
    private int viewType;

    private long dateInMillis;

    private String description;
    private String descriptionA11y;

    private double highInCelsius;
    private String highAlly;

    private double lowInCelsius;
    private String lowAlly;


    public WeatherSnapshot(int weatherId, int weatherImageId,
                           int viewType, long dateInMillis,
                           String description, String descriptionA11y,
                           double highInCelsius, String highAlly,
                           double lowInCelsius, String lowAlly) {
        this.weatherId = weatherId;
        this.weatherImageId = weatherImageId;
        this.viewType = viewType;
        this.dateInMillis = dateInMillis;
        this.description = description;
        this.descriptionA11y = descriptionA11y;
        this.highInCelsius = highInCelsius;
        this.highAlly = highAlly;
        this.lowInCelsius = lowInCelsius;
        this.lowAlly = lowAlly;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public int getWeatherImageId() {
        return weatherImageId;
    }

    public int getViewType() {
        return viewType;
    }

    public long getDateInMillis() {
        return dateInMillis;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionA11y() {
        return descriptionA11y;
    }

    public double getHighInCelsius() {
        return highInCelsius;
    }

    public String getHighAlly() {
        return highAlly;
    }

    public double getLowInCelsius() {
        return lowInCelsius;
    }

    public String getLowAlly() {
        return lowAlly;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public void setWeatherImageId(int weatherImageId) {
        this.weatherImageId = weatherImageId;
    }
}
