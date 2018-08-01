package com.example.android.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.start, R.string.stop);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Log.v("MainAcivity", "Id: " + id);
        if (id == R.id.nav_home) {
            Toast.makeText(this, "Home Page", Toast.LENGTH_LONG).show();
            Log.v("MainAcivity", "Id: " + id);
        }
        if (id == R.id.nav_ptv) {
            Toast.makeText(this, "Places To Visit Page", Toast.LENGTH_SHORT).show();
            Log.v("MainAcivity", "Id: " + id);
        }
        if (id == R.id.nav_events) {
            Toast.makeText(this, "Events in Delhi Page", Toast.LENGTH_SHORT).show();
            Log.v("MainAcivity", "Id: " + id);
        }
        if (id == R.id.nav_gallery) {
            Toast.makeText(this, "Gallery Page", Toast.LENGTH_SHORT).show();
            Log.v("MainAcivity", "Id: " + id);
        }
        if (id == R.id.nav_exit) {
            Toast.makeText(MainActivity.this, "Exit the app", Toast.LENGTH_SHORT).show();
            Log.v("MainAcivity", "Id:" + id);
        }

        return false;
    }
}


