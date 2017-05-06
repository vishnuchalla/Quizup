package com.sample.quizup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {
    Button btn;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        checkBox1=(CheckBox)findViewById(R.id.checkBox1);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox4=(CheckBox)findViewById(R.id.checkBox4);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent j=getIntent();
                int count=j.getIntExtra("count",0);
                if(checkBox1.isChecked()&&checkBox2.isChecked()&&checkBox3.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox2.isChecked()&&checkBox3.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox2.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox3.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox2.isChecked()&&checkBox3.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox2.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox3.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox2.isChecked()&&checkBox3.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox2.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox3.isChecked()&&checkBox4.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox1.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox2.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox3.isChecked())
                {Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else if(checkBox4.isChecked())
                {++count;
                    Intent i=new Intent(third.this,fourth.class);
                    i.putExtra("count",count);
                    startActivity(i);}
                else
                {
                    Toast.makeText(getApplicationContext(),"Please Select An Option",Toast.LENGTH_LONG).show();}
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
