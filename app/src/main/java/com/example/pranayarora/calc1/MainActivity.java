package com.example.pranayarora.calc1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    Button b1, b2, b3, b4, b5, b6;
        EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        et1 = (EditText) findViewById(R.id.editText4);
        et2 = (EditText) findViewById(R.id.editText5);
        et3 = (EditText) findViewById(R.id.editText6);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
     if(v.getId()==b1.getId())
     {
         int a,b,s;
            a = Integer.parseInt(et1.getText().toString());
            b = Integer.parseInt(et2.getText().toString());
            s = a+b;
         et3.setText(""+s);
     }
        if(v.getId() == b2.getId())
        {
            int a,b,s;
         a = Integer.parseInt(et1.getText().toString());
         b = Integer.parseInt(et2.getText().toString());
            s = a-b;
            et3.setText(""+s);
        }
     if(v.getId()== b3.getId())
     {
         int a,b,s;
       a = Integer.parseInt(et1.getText().toString());
       b = Integer.parseInt(et2.getText().toString());
         s = a/b;
         et3.setText(""+s);
     }
     if(v.getId()==b4.getId())
        {
            int a, b, s;
            a = Integer.parseInt(et1.getText().toString());
            b = Integer.parseInt(et2.getText().toString());
            s = a*b;
            et3.setText("" + s);
        }
        if(v.getId()==b5.getId())
        {
            et1.setText("");
            et2.setText("");
            et3.setText("");
        }
      if(v.getId() == b6.getId())
      {
          finish();
      }
    }
}