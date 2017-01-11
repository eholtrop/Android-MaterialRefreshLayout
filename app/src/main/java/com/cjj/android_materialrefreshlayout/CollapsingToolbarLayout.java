package com.cjj.android_materialrefreshlayout;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cjj.MaterialRefreshLayout;

public class CollapsingToolbarLayout extends AppCompatActivity {

    MaterialRefreshLayout refresh;
    AppBarLayout appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        refresh = (MaterialRefreshLayout) findViewById(R.id.refresh);
        appBar = (AppBarLayout) findViewById(R.id.app_bar);

        refresh.setAppBarLayout(appBar);
    }

}
