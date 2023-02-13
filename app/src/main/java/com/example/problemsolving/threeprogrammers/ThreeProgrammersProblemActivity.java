package com.example.problemsolving.threeprogrammers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityThreeProgrammersProblemBinding;

public class ThreeProgrammersProblemActivity extends AppCompatActivity implements ProgrammersView {

    private ActivityThreeProgrammersProblemBinding threeProgrammersProblemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        threeProgrammersProblemBinding = ActivityThreeProgrammersProblemBinding.
                inflate(getLayoutInflater());
        setContentView(threeProgrammersProblemBinding.getRoot());
        getSupportActionBar().setTitle("Three Programmers Problem");
        handleDiffBtn();
    }

    @Override
    public void handleDiffBtn() {
        threeProgrammersProblemBinding.diffBtn.setOnClickListener(v -> {
            String programmer1 = threeProgrammersProblemBinding.programmerOneSalary
                    .getText().toString();
            String programmer2 = threeProgrammersProblemBinding.programmerTwoSalary
                    .getText().toString();
            String programmer3 = threeProgrammersProblemBinding.programmerThreeSalary
                    .getText().toString();
            int diff = new ThreeProgrammersImpl()
                    .getMaxAndMin(programmer1, programmer2, programmer3);
            threeProgrammersProblemBinding.differenceTxt.setText("The difference is " + diff);
        });
    }
}