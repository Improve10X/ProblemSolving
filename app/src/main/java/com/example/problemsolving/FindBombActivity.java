package com.example.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.problemsolving.databinding.ActivityFindBombBinding;

public class FindBombActivity extends AppCompatActivity {
    private ActivityFindBombBinding bombBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bombBinding = ActivityFindBombBinding.inflate(getLayoutInflater());
        setContentView(bombBinding.getRoot());
    }
}