package com.example.macbookair.linechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart lineChart = (LineChart) findViewById(R.id.lineChart);

        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(4.0f,1));
        entries.add(new Entry(25.0f,2));
        entries.add(new Entry(6.0f,3));
        entries.add(new Entry(490.0f,4));
        entries.add(new Entry(8.0f,5));

        LineDataSet lineDataSet = new LineDataSet(entries,"Line Data Chart");

        ArrayList<String> labels = new ArrayList<>();

        labels.add("januarry");
        labels.add("februarry");
        labels.add("march");
        labels.add("appril");
        labels.add("may");

        LineData data = new LineData(labels,lineDataSet);

        lineChart.setData(data);

        lineChart.animateX(5000);
    }
}
