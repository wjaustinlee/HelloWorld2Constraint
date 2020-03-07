package com.example.helloworld2b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.main_text_showCount);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.main_toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if (mCount == 1) {
                View zero = findViewById(R.id.button_zero);
                zero.setBackgroundColor(Color.MAGENTA);
            }
            if (mCount % 2 == 0) {
                view.setBackgroundColor(Color.GREEN);
            } else {
                view.setBackgroundColor(Color.BLUE);
            }
        }
    }

    public void resetToZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        view.setBackgroundColor(Color.GRAY);
    }
}
