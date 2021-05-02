package com.example.cryptolist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button button;
    EditText input_username, input_password;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_PASS = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        input_username = findViewById(R.id.inpput_username);
        input_password = findViewById(R.id.input_password);
        button = findViewById(R.id.button);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME, null);

        if (name != null){
            Intent intent = new Intent(com.example.cryptolist.LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME,input_username.getText().toString());
                editor.putString(KEY_PASS,input_password.getText().toString());
                editor.apply();

                Intent intent = new Intent(com.example.cryptolist.LoginActivity.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(com.example.cryptolist.LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}