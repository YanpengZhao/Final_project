package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {

    private NavigationBarView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnItemSelectedListener(bottomnavFunction);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }
    private NavigationBarView.OnItemSelectedListener bottomnavFunction=new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment=null;
            switch (item.getItemId()){
                case R.id.home:
                    fragment=new HomeFragment();
                    break;
                case R.id.food:
                    fragment=new FoodFragment();
                    break;
                case R.id.add:
                    fragment=new AddFragment();
                    break;
                case R.id.graph:
                    fragment=new GraphFragment();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            return true;
        }
    };
    public void create_food(View view){
        goToActivity2();
    }
    public void suggestion(View view){
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void food_cal(View view){
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);
    }

    public void  goToActivity2(){
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}