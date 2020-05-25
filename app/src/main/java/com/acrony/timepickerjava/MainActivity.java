package com.acrony.timepickerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
Button btnChoose;
TextView tvTime;
TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTime=(TextView)findViewById(R.id.textView);
        btnChoose=(Button) findViewById(R.id.btnDate);
        timePicker=(TimePicker) findViewById(R.id.timePicker);

        timePicker.setIs24HourView(true);
        tvTime.setText(CurrentTime());

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTime.setText(CurrentTime());
            }
        });


    }

    public String CurrentTime()
    {
        String currentTime=
                "Current Time:"+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}
