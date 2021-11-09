package com.example.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class settingPrivate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_private);
        ArrayList<String> settingList = new ArrayList<>();
        settingList.add("Account                                                    11111");
        settingList.add("Email                                                 1111@wisc.edu");
        settingList.add("Change Password");
        settingList.add("Message Setting");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, settingList);
        ListView listView = (ListView) findViewById(R.id.settingList1);
        listView.setAdapter(adapter);
    }

    public void clickFunction(View view){
        Intent intent = new Intent(this, MainSetting.class);
        startActivity(intent);
    }
}

