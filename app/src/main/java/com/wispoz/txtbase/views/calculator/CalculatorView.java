package com.wispoz.txtbase.views.calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wispoz.txtbase.R;
import com.wispoz.txtbase.databinding.CalculatorBinding;
import com.wispoz.txtbase.models.PlaceCalculator;

/**
 * Created by wispoz on 03.06.16.
 */
public class CalculatorView extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator, container, false);
        CalculatorBinding binding = DataBindingUtil.inflate(inflater, R.layout.calculator, container, false);
       // View view = binding.getRoot();
        PlaceCalculator place = new PlaceCalculator("13","15");
        binding.setCalculator(place);
        return binding.getRoot();
    }
}