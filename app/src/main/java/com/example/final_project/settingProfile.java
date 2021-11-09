package com.example.final_project;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class settingProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile);

        ArrayList<String> settingList = new ArrayList<>();
        settingList.add("Age                                                                24");
        settingList.add("Sex                                                                male");
        settingList.add("Weight                                                          78kg");
        settingList.add("Height                                                      171.0cm");
        settingList.add("Body Mass Index(BMI)                              26.7");
        settingList.add("Body Fat                                                       20%");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, settingList);
        ListView listView = (ListView) findViewById(R.id.settingList1);
        listView.setAdapter(adapter);
    }

    public void clickFunction(View view){
        Intent intent = new Intent(this, MainSetting.class);
        startActivity(intent);
    }
}