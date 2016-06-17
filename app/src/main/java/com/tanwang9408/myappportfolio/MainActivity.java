package com.tanwang9408.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void button1_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button1_text));

    }

    public void button2_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button2_text));

    }

    public void button3_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button3_text));

    }

    public void button4_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button4_text));

    }

    public void button5_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button5_text));

    }

    public void button6_click(View view) {
        // Do something in response to button click
        showToastMessage(getString(R.string.button6_text));

    }

    private void showToastMessage(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
