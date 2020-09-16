package com.example.liguoli44;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 请输入密码
     */
    private EditText mEdTextPwd;
    /**
     * 请输入用户名
     */
    private EditText mEdTextName;
    /**
     * 登录
     */
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mEdTextPwd = (EditText) findViewById(R.id.edTextPwd);
        mEdTextName = (EditText) findViewById(R.id.edTextName);
        mBtnLogin = (Button) findViewById(R.id.btnLogin);
        mBtnLogin.setOnClickListener(this);
    }

    private void toLogin(){
        String name = mEdTextName.getText().toString();
        String pwd = mEdTextPwd.getText().toString();
        if (TextUtils.isEmpty(name)){
            Toast.makeText(this, "用户名不能为空...", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pwd)){
            Toast.makeText(this, "密码不能为空...", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnLogin:
                toLogin();
                break;
        }
    }
}