package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Harel.
     */
    ConstraintLayout harel;
    /**
     * The Btn 1.
     */
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        harel = findViewById(R.id.CL);
        btn1 = findViewById(R.id.btn1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Red"))
        {
            harel.setBackgroundColor(Color.RED);
        }
        if(st.equals("Blue"))
        {
            harel.setBackgroundColor(Color.BLUE);
        }
        if(st.equals("Black"))
        {
            harel.setBackgroundColor(Color.BLACK);
        }
        return true;
    }

    /**
     * Dorel.
     *
     * @param view the view
     */
    public void dorel(View view) {
        Intent si = new Intent(this, SecndActivity.class);

        startActivity(si);
    }


}
