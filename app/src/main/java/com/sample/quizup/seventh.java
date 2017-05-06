package com.sample.quizup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class seventh extends AppCompatActivity {
    Button btn;
    TextView textView7;
    RatingBar ratingBar;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        btn = (Button) findViewById(R.id.btn);
        textView7 = (TextView) findViewById(R.id.textView7);
        Intent j = getIntent();
        int count = j.getIntExtra("count", 0);
        textView7.setText("Score=" + count + "/5");
    }

    public void onClick(View v) {
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float ratingvalue = ratingBar.getRating();
        Toast.makeText(getApplicationContext(), "Rating is :" + ratingvalue, Toast.LENGTH_LONG).show();
    }

    boolean twice = false;

    @Override
    public void onBackPressed() {
        if (twice == true) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            if(android.os.Build.VERSION.SDK_INT >= 21)
            super.finishAndRemoveTask();
            else
            super.finish();
            System.exit(0);
        }
        twice = true;
        Toast.makeText(getApplicationContext(), "Press again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                twice = false;
            }
        }, 3000);
    }
}

