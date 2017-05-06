package com.sample.quizup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import static com.sample.quizup.R.id.checkBox2;

public class fifth extends AppCompatActivity {
    Button btn;
    Switch switch1,switch2,switch3,switch4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        switch1=(Switch)findViewById(R.id.switch1);
        switch2=(Switch)findViewById(R.id.switch2);
        switch3=(Switch)findViewById(R.id.switch3);
        switch4=(Switch)findViewById(R.id.switch4);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=getIntent();
                int count=j.getIntExtra("count",0);
                if(switch1.isChecked()&&switch2.isChecked()&&switch3.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch2.isChecked()&&switch3.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch2.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch3.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch2.isChecked()&&switch3.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch2.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch3.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch2.isChecked()&&switch3.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch2.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch3.isChecked()&&switch4.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch1.isChecked())
                {   ++count;
                    Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch2.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch3.isChecked())
                {Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(switch4.isChecked())
                {
                    Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else
                {
                    Toast.makeText(getApplicationContext(),"Please Select An Option",Toast.LENGTH_LONG).show();}

            }
    });
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
