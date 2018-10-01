package ru.zaharova.oxana.septemberworkout.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import ru.zaharova.oxana.septemberworkout.R;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Button changeTextDirectionButton;
    Button randomTextColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hello_world_text_view);
        button = findViewById(R.id.change_color_button);
        changeTextDirectionButton = findViewById(R.id.change_text_direction);
        randomTextColorButton = findViewById(R.id.random_text_color_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getCurrentTextColor() == getResources().getColor(R.color.colorRed)) {
                    textView.setTextColor(getResources().getColor(R.color.colorBlue));
                } else {
                    textView.setTextColor(getResources().getColor(R.color.colorRed));
                }
            }
        });

        randomTextColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                textView.setTextColor(Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
            }
        });

        changeTextDirectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(new StringBuilder(textView.getText().toString()).reverse().toString());
            }
        });
    }
}
