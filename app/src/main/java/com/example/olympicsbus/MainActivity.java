package com.example.olympicsbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.olympicsbus.ui.booking.BookingFragment;
import com.example.olympicsbus.ui.home.HomeFragment;
import com.example.olympicsbus.ui.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializw and assign variable
        BottomNavigationView navView = findViewById(R.id.nav_view);
        /*พดเติม
        //set home selected
        navView.setSelectedItemId(R.id.navigation_home);
        //perform item selected listener
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()){
                    case R.id.navigation_home: selectedFragment = new HomeFragment(); break;
                    case  R.id.navigation_booking: selectedFragment = new BookingFragment(); break;
                    case R.id.navigation_profile:selectedFragment = new ProfileFragment();break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_container ,selectedFragment).commit();

                return  true;
            }
        });*/
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_booking, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);



    }


}
