package com.example.areacalculator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = findViewById(R.id.tvResult);

        String shape = getIntent().getStringExtra("shape");

        if (shape.equals("Square")) {
            double side = getIntent().getDoubleExtra("side", 0);
            double area = side * side;

            tvResult.setText(
                    "Shape: Square\n" +
                            "Side: " + side + "\n" +
                            "Area: " + area
            );
        }
    }
}
