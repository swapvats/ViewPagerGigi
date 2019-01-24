package com.example.viewpagergigi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

public class WallpaperActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private ArrayList<Chitra> photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        photos = new ArrayList<>();
        init();
        hideNavAndStatus();

        mRecyclerView = findViewById(R.id.myRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(WallpaperActivity.this));
        mRecyclerView.setAdapter(new MyRecyclerAdapter(photos,WallpaperActivity.this));
    }

    private void hideNavAndStatus() {
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
    private void init() {
        photos.add(new Chitra(R.drawable.gigi_6,"My Absolute Love"));
        photos.add(new Chitra(R.drawable.gigi_7,"My Eternal Love"));
        photos.add(new Chitra(R.drawable.gigi_8,"My Forever Love"));
        photos.add(new Chitra(R.drawable.gigi_9,"My First Love"));
        photos.add(new Chitra(R.drawable.gigi_10,"My Dear Love"));
        photos.add(new Chitra(R.drawable.gigi_11,"My Love"));
    }
}
