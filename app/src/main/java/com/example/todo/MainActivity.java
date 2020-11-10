package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.todo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Context context;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        actionViews();
    }

    private void actionViews() {

        binding.BackOptTv.setOnClickListener(v -> {
            Toast.makeText(context,"back",Toast.LENGTH_SHORT).show();
        });

        binding.TaskEt.setOnClickListener(v -> {


        });


    }


}