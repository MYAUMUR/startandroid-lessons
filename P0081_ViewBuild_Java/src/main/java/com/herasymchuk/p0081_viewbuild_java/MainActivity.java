package com.herasymchuk.p0081_viewbuild_java;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = findViewById(R.id.myText);
        myTextView.setText(R.string.new_text_in_textview);
        Button myButton = findViewById(R.id.myButton);
        myButton.setText("My button");
        myButton.setEnabled(false);
        CheckBox myCheckBox = findViewById(R.id.my_chbx);
        myCheckBox.setChecked(true);
    }
}