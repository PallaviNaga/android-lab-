package com.example.areacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SquareActivity extends AppCompatActivity {

    EditText etSide;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        etSide = findViewById(R.id.etSide);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double side = Double.parseDouble(etSide.getText().toString());

                Intent intent = new Intent(SquareActivity.this, ResultActivity.class);
                intent.putExtra("shape", "Square");
                intent.putExtra("side", side);
                startActivity(intent);
            }
        });
    }
}
