package com.sample.quizup;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.sample.quizup.R.string.r1;

public class second extends AppCompatActivity {
    Button btn;
    RadioGroup rg;
    RadioButton rb;
    int count=0;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg=(RadioGroup)findViewById(R.id.RadioGroup);
                int radiobuttonid=rg.getCheckedRadioButtonId();
                if(radiobuttonid==R.id.radioButton1)
                {
                    Intent i=new Intent(second.this,third.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(radiobuttonid==R.id.radioButton2)
                {
                    Intent i=new Intent(second.this,third.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(radiobuttonid==R.id.radioButton3)
                {  ++count;
                    Intent i=new Intent(second.this,third.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(radiobuttonid==R.id.radioButton4)
                {
                    Intent i=new Intent(second.this,third.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else
                    Toast.makeText(getApplicationContext(),"Please Select An Option",Toast.LENGTH_LONG).show();

    }});
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
        },3000);}}