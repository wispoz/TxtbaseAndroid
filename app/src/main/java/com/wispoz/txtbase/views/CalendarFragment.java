package com.wispoz.txtbase.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wispoz.txtbase.R;

/**
 * Created by wispoz on 26.05.16.
 */
public class CalendarFragment extends Fragment {
    private static final String KEY_TITLE = "title";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calendar, container, false);
        return view;
    }
}
