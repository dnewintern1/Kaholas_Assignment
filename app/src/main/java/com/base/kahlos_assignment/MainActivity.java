package com.base.kahlos_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View log_custom_toolbar = findViewById(R.id.log_custom_toolbar);
        ImageView id_setting = findViewById(R.id.id_setting);

        id_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"setting option Selected!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView id_refresh = findViewById(R.id.id_refresh);

        id_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Refresh option Selected!", Toast.LENGTH_SHORT).show();
            }
        });

        View cardView = findViewById(R.id.cardView);
        ImageView id_play = findViewById(R.id.id_play);


        id_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Play option Selected!", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_Upload = findViewById(R.id.btn_Upload);
        btn_Upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Upload option selected!!!", Toast.LENGTH_SHORT).show();

            }
        });






    }
}