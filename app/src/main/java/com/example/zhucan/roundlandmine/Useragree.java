package com.example.zhucan.roundlandmine;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhucan on 2016/12/14.
 */

public class Useragree extends Activity {
    private int year;
    private int month;
    private int day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useragreement);
        DatePicker datePicker=(DatePicker)findViewById(R.id.date);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker arg0, int year, int month, int day) {
                Useragree.this.year = year;
                Useragree.this.month = month;
                Useragree.this.day = day;
                showDate(year, month, day);
            }
        });






    }
    private void showDate(int year,int month,int day){
        TextView textView=(TextView)findViewById(R.id.text);

       textView.setText("您的出生年月是:"+year+"年"+(month+1)+"月"+day
               +"日");
    }
}
