package com.example.schendel21.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void toggleText(View v){
        if(textView.getVisibility()==View.INVISIBLE) {
            textView.setTextSize(60);
            textView.setText("Hello, my name is Alex!");
            textView.setVisibility(View.VISIBLE);
        }
        else
            textView.setVisibility(View.INVISIBLE);
    }
}
