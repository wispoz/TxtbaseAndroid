package com.wispoz.txtbase.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wispoz on 26.05.16.
 */
public class Competition {
    public int id;
    public String name;
    public String date;
    public  int daysLeft;
    public  Competition(int id, String name, String date,int daysLeft) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.daysLeft = daysLeft;
    }

}


