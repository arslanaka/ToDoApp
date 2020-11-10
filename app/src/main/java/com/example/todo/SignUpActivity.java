package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Toast;

import com.example.todo.databinding.ActivityLoginBinding;
import com.example.todo.databinding.ActivitySignUpBinding;

import java.util.Objects;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);

      actionViews();
    }

    private void actionViews() {

        binding.SignUpButton.setOnClickListener(v -> {
            if (validations()){
                startActivity(new Intent(context, MainActivity.class));
            }else{
                Toast.makeText(context,"general error",Toast.LENGTH_SHORT).show();
            }

        });
    }

    private Boolean validations() {
        if (Objects.requireNonNull(binding.emailEt.getText()).toString().trim().length() > 0) {
            if (Objects.requireNonNull(binding.passwordEt.getText()).toString().trim().length() > 0) {
                return true;

            } else {
                binding.passwordEt.setError(getString(R.string.error_empty));
            }
        } else {
            binding.passwordEt.setError(getString(R.string.error_empty));
        }

        return false;
    }

}