package com.ist440.mitchell.yay;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Technology extends AppCompatActivity {
    private ImageSwitcher sw;
    private ImageButton nB, yB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sw = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        nB = (ImageButton) findViewById(R.id.nayButton);
        yB = (ImageButton) findViewById(R.id.yayButton);

        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView(){
                ImageView imageView = new ImageView(getApplicationContext());

                return imageView;
            }
        });

        yB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.mipmap.thumb_up_blue);
            }
        });

        nB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.mipmap.thumbs_down_red);
            }
        });
    }

}
