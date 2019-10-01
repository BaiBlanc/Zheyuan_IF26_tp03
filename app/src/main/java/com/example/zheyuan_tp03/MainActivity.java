package com.example.zheyuan_tp03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/** TITIT TIIIT  **/


public class MainActivity extends AppCompatActivity {


/**
     * C'est un jolie projet MARC
     * @author = "bai"
     * @deprecated = false
 **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /** TOTO TOTO **/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById (R.id.textview);
        String message = "Bonjour IF26.";

        tx.setText(this.getResources().getString(R.string.message));
        Button bt = (Button) findViewById(R.id.myButton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            } });
    }
}
