package com.wispoz.txtbase.views.competitions;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wispoz.txtbase.R;

/**
 * Created by wispoz on 27.05.16.
 */
public class CompetitionsViewActivity extends Activity {

    TextView name;
    TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
        setContentView(R.layout.competition_item);
        	        name = (TextView)findViewById(R.id.name);
        	        date = (TextView)findViewById(R.id.date);
       }
}
