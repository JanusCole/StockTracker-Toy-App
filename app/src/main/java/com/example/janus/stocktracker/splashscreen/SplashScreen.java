package com.example.janus.stocktracker.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.janus.stocktracker.BaseActivity;
import com.example.janus.stocktracker.R;
import com.example.janus.stocktracker.portfolio.PortfolioActivity;
import com.example.janus.stocktracker.stocksearch.StockSearchActivity;
import com.example.janus.stocktracker.util.BottomNavigationMap;

// This is a simple splash screen that displays a stock chart image

public class SplashScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
