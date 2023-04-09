package com.example.appsnurul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.nav_beranda:
                    f = new FragmentHome();
                    break;
                case R.id.nav_email:
                    f = new FragmentEmail();
                    break;
                case R.id.nav_live:
                    f = new FragmentLive();
                    break;
                case R.id.nav_saya:
                    f = new FragmentPerson();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.navigation_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}