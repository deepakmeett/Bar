package com.example.bar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomAppBar = findViewById(R.id.bar);
        floatingActionButton = findViewById(R.id.flot);
        setSupportActionBar(bottomAppBar);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                
                Snackbar.make(view, "Fab is clicked", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    finish();

                return true;
            case R.id.share:
                Intent intent1 = new Intent(Intent.ACTION_SEND);
                intent1.setType("text/plain");
                String shareBody = "Your body here";
                String shareSub = "Your Subject here";
                intent1.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                intent1.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent1, "Share Using"));
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    
}

