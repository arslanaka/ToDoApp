package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.todo.databinding.ActivityLoginBinding;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity {

    Context context;
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this, R.layout.activity_login);


       actionViews();
    }

    private void actionViews() {

        binding.LoginButton.setOnClickListener(v -> {
            if (validation()){
                validation();
            }else{
                Toast.makeText(context, "error",Toast.LENGTH_SHORT).show();
            }


        });
    }

    private Boolean validation() {
        if (Objects.requireNonNull(binding.emailEt.getText()).toString().trim().length() > 0) {
            if (Objects.requireNonNull(binding.PasswordEt.getText()).toString().trim().length() > 0) {
                return true;

            } else {
                binding.PasswordEt.setError(getString(R.string.error_empty));
            }
        } else {
            binding.PasswordEt.setError(getString(R.string.error_empty));
        }

        return false;

    }
}