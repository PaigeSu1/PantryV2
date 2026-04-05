package com.seproject.plantry;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.google.android.material.navigation.NavigationView;
import com.seproject.plantry.database.PantryDatabase;
import com.seproject.plantry.database.PantryItem;
import com.seproject.plantry.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private PantryDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this.db = PantryDatabase.getInstance(getApplicationContext()); // make sure you have a singleton getter in AppDatabase

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        BottomNavigationView navbar = findViewById(R.id.nav_toolbar);
        NavigationUI.setupWithNavController(navbar, navController);
    }
}