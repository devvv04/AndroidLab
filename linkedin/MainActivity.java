package com.example.linkedin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button openBtn, addBtn, enhanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBtn = findViewById(R.id.openBtn);
        addBtn = findViewById(R.id.addBtn);
        enhanceBtn = findViewById(R.id.enhanceBtn);

        openBtn.setOnClickListener(v ->
                Toast.makeText(this, "Open to clicked", Toast.LENGTH_SHORT).show());

        addBtn.setOnClickListener(v ->
                Toast.makeText(this, "Add Section clicked", Toast.LENGTH_SHORT).show());

        enhanceBtn.setOnClickListener(v ->
                Toast.makeText(this, "Enhance Profile clicked", Toast.LENGTH_SHORT).show());
    }
}
