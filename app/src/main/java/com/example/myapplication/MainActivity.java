package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference views matching your XML IDs
        TextView textView = findViewById(R.id.text);
        Button btnChangeText = findViewById(R.id.button1);
        Button btnChangeColor = findViewById(R.id.button2);
        Button btnChangeBgColor = findViewById(R.id.button3);

        // Button 1: "Keisti teksta" (Changes text string)
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Tekstas pakeistas!");
            }
        });

        // Button 2: "Keisti spalva" (Changes text color to Red)
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.RED);

                // Alternatively, use any hex color:
                // textView.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        //comment for revert
        // Button 3: "Keisti fono spalva" (Changes text background color)
        btnChangeBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}