package com.wispoz.txtbase.controllers;

import android.os.Debug;
import android.util.Log;
import android.widget.SeekBar;

import com.wispoz.txtbase.models.PlaceCalculator;

import java.util.Random;

/**
 * Created by wispoz on 03.06.16.
 */
public class PlaceCalculatorHandler implements SeekBar.OnSeekBarChangeListener {
    public PlaceCalculator place = null;
    public PlaceCalculatorHandler(PlaceCalculator place) {
        this.place  = place;
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
     //   this.place.place = Integer.toString(seekBar.getProgress());
        this.place.setPlace(Integer.toString(seekBar.getProgress()));
       // this.place = Integer.toString(100 + new Random().nextInt());
        Log.w("ProgressSeek", Integer.toString(seekBar.getProgress()));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
