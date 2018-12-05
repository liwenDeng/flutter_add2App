package com.example.dengliwen.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView fab = findViewById(R.id.fab);
        // MyApp/app/src/main/java/some/package/MainActivity.java
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View flutterView = Flutter.createView(
                        MainActivity.this,
                        getLifecycle(),
                        null
                );
                FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
                layout.leftMargin = 100;
                layout.topMargin = 200;
                addContentView(flutterView, layout);
            }
        });
    }
}
