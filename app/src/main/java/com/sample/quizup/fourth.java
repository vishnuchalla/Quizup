package com.sample.quizup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class fourth extends AppCompatActivity {
    ImageButton imageView1,imageView2,imageView3,imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        imageView1=(ImageButton)findViewById(R.id.imageButton1);
        imageView2=(ImageButton)findViewById(R.id.imageButton2);
        imageView3=(ImageButton)findViewById(R.id.imageButton3);
        imageView4=(ImageButton)findViewById(R.id.imageButton4);
    }
    public void onImageClick1(View v)
    {  Intent j=getIntent();
        int count=j.getIntExtra("count",0);
        Intent i=new Intent(fourth.this,fifth.class);
        i.putExtra("count",count);
        startActivity(i);}
    public void onImageClick2(View v)
    {  Intent j=getIntent();
        int count=j.getIntExtra("count",0);
        ++count;
        Intent i=new Intent(fourth.this,fifth.class);
        i.putExtra("count",count);
        startActivity(i);}
    public void onImageClick3(View v)
    {  Intent j=getIntent();
        int count=j.getIntExtra("count",0);
        Intent i=new Intent(fourth.this,fifth.class);
        i.putExtra("count",count);
        startActivity(i);}
    public void onImageClick4(View v)
    {  Intent j=getIntent();
        int count=j.getIntExtra("count",0);
        Intent i=new Intent(fourth.this,fifth.class);
        i.putExtra("count",count);
        startActivity(i);}
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
