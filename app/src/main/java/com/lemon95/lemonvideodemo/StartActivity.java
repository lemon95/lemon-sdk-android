package com.lemon95.lemonvideodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private Button start_but;
    private EditText user_et;
    private EditText password_et;
    private String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        user_et = (EditText) findViewById(R.id.et_mobile);
        password_et = (EditText) findViewById(R.id.et_password);
        start_but = (Button) findViewById(R.id.start_but);
        start_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = user_et.getText().toString().trim();
                String password = password_et.getText().toString().trim();
                Intent intent = new Intent(StartActivity.this, com.lemon95.lemonvideolib.MainActivity.class);
                intent.putExtra("Mobile", user);  //手机号码 [用户名]
                intent.putExtra("Password",password); //登录密码
                startActivity(intent);
            }
        });

    }
}
