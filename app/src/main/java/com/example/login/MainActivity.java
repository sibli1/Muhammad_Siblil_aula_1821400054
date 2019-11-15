package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    EditText user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btn_login);
        user = findViewById(R.id.ed_user);
        password = findViewById(R.id.ed_password);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = login.getText().toString();
        String pw = password.getText().toString();
        switch (v.getId()) {
            case R.id.btn_login:
                if (TextUtils.isEmpty(username) | TextUtils.isEmpty(pw)) {
                    Toast.makeText(this, "Mohon di isi yaaa", Toast.LENGTH_SHORT).show();
                } else {
                    Intent Intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(Intent);
                    break;
                }
        }
    }
}
