package com.b1707b.cours.ucad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "oauis ca marche", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "salutca marche", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "oauis ca va alhamdoulilah", Toast.LENGTH_SHORT).show();
    }
}