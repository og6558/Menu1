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
 * The type Secnd activity.
 */
public class SecndActivity extends AppCompatActivity {
    /**
     * The Btn 2.
     */
    Button btn2;
    /**
     * The Rl.
     */
    ConstraintLayout RL;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnd);
        RL = findViewById(R.id.RL);
        btn2 = findViewById(R.id.btn2);
    }

    /**
     * The Gi.
     */
    Intent gi = getIntent();
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0,0,400,"Green");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Red"))
        {
            RL.setBackgroundColor(Color.RED);
        }
        if(st.equals("Blue"))
        {
            RL.setBackgroundColor(Color.BLUE);
        }
        if(st.equals("Black"))
        {
            RL.setBackgroundColor(Color.BLACK);
        }
        if(st.equals("Green"))
        {
            RL.setBackgroundColor(Color.GREEN);
        }
        return true;
    }

    /**
     * Dorel 2.
     *
     * @param view the view
     */
    public void dorel2(View view) {
        finish();
    }
}