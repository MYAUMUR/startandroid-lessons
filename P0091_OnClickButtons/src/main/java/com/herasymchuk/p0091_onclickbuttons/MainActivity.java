package com.herasymchuk.p0091_onclickbuttons;

import static android.view.View.OnClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        OnClickListener oclBtn = new OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = v.getId();
                if (id == R.id.btnOk) {
                    tvOut.setText("Нажата кнопка ОК");
                } else if (id == R.id.btnCancel) {
                    tvOut.setText("Нажата кнопка Cancel");
                }
            }
        };


        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }

}