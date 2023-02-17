package com.example.problemsolving.findbomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityFindBombBinding;

public class FindBombActivity extends AppCompatActivity implements FindBombView{
    private ActivityFindBombBinding bombBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bombBinding = ActivityFindBombBinding.inflate(getLayoutInflater());
        setContentView(bombBinding.getRoot());
        getSupportActionBar().setTitle("Find Bomb");
        handleFindBomb();
    }

    @Override
    public void handleFindBomb() {
        bombBinding.bombBtn.setOnClickListener(v -> {
            String inputText = bombBinding.findBombInputTxt.getText().toString();
            try {
                String output = new FindBombImpl().findBomb(inputText);
                bombBinding.bombOutputTxt.setText(output);
            } catch (Exception ex) {
                ex.printStackTrace();
                bombBinding.bombOutputTxt.setText("Invalid Input");
            }
        });
    }
}