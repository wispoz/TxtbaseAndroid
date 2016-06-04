package com.wispoz.txtbase.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wispoz.txtbase.BR;

/**
 * Created by wispoz on 03.06.16.
 */
public class PlaceCalculator extends BaseObservable {
    private  String place;
    private  String from;
    @Bindable
    public String getPlace() {
        return this.place;
    }
    @Bindable
    public String getFrom() {
        return this.from;
    }
    public void setPlace(String place) {
        this.place = place;
        notifyPropertyChanged(BR.place);
    }
    public void setFrom(String from) {
        this.from = from;
        notifyPropertyChanged(BR.from);
    }
    public PlaceCalculator(String place, String from) {
        this.place = place;
        this.from = from;
    }
}
