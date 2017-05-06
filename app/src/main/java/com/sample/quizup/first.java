package com.sample.quizup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class first extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ImageView image = (ImageView) findViewById(R.id.idImageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
        image.startAnimation(animation);
    }

    public void onImageClick(View v) {
        Intent i = new Intent(this, second.class);
        startActivity(i);
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
       twice=true;
       Toast.makeText(getApplicationContext(),"Press again to exit",Toast.LENGTH_SHORT).show();
       new Handler().postDelayed(new Runnable()
        {@Override
            public void run(){
            twice=false;}
        },3000);}
}