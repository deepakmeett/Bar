package com.example.bar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomAppBar = findViewById(R.id.bar);
        floatingActionButton = findViewById(R.id.flot);
        setSupportActionBar(bottomAppBar);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bartwo,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mail:
                Toast.makeText(getApplicationContext(),"Clicked on Mail",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.cloud:
                Toast.makeText(getApplicationContext(),"Clicked on Cloud", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(getApplicationContext(),"Clicked on Delete", Toast.LENGTH_SHORT).show();
                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
//        deepak
    }
}