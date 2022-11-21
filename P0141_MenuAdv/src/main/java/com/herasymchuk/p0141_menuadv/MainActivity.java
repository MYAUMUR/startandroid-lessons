package com.herasymchuk.p0141_menuadv;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    CheckBox checkBox;
    CheckBox mineCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        checkBox = findViewById(R.id.chbExtMenu);
        mineCheckBox = findViewById(R.id.mine_checkbox);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
/*        menu.add(0, 7, 0, "first");
        menu.add(0, 1, 0, "add");
        menu.add(0, 2, 0, "edit");
        menu.add(0, 3, 3, "delete");
        menu.add(1, 4, 1, "copy");
        menu.add(1, 5, 2, "paste");
        menu.add(1, 6, 4, "exit");
        menu.add(3, 8, 5, "My own menu");*/

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(R.id.group_1, checkBox.isChecked());
        menu.setGroupVisible(R.id.group_2, mineCheckBox.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        String sb = "Item Menu" +
                "\r\n groupId: " + item.getGroupId() +
                "\r\n itemId: " + item.getItemId() +
                "\r\n order: " + item.getOrder() +
                "\r\n title: " + item.getTitle();
        textView.setText(sb);

        return super.onOptionsItemSelected(item);
    }
}