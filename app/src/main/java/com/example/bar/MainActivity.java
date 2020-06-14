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
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;
    ImageView imageView, imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomAppBar = findViewById(R.id.bar);
        floatingActionButton = findViewById(R.id.flot);
        imageView = findViewById( R.id.laundry );
        imageView1 = findViewById( R.id.stationary );
        
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Laundry", Toast.LENGTH_SHORT ).show();
            }
        } );

        imageView1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Stationary", Toast.LENGTH_SHORT ).show();
            }
        } );



        setSupportActionBar(bottomAppBar);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Fab is clicked", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", null).show();
            }
        });

        floatingActionButton.setOnLongClickListener( new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent( getApplicationContext(), Main2Activity.class );
                startActivity( intent );
                return false;
            }
        } );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.bottoomv, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.search:
//                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                    startActivity(intent);
//                    finish();
//
//                return true;
//            case R.id.share:
//                Intent intent1 = new Intent(Intent.ACTION_SEND);
//                intent1.setType("text/plain");
//                String shareBody = "Your body here";
//                String shareSub = "Your Subject here";
//                intent1.putExtra(Intent.EXTRA_SUBJECT, shareSub);
//                intent1.putExtra(Intent.EXTRA_TEXT, shareBody);
//                startActivity(Intent.createChooser(intent1, "Share Using"));
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//
//        }
//    }
    
}

