package com.example.liguoli44;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 请设置签名
     */
    private EditText mEdTextSign;
    /**
     * 完成
     */
    private Button mBtnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        initView();
    }

    private void initView() {
        mEdTextSign = (EditText) findViewById(R.id.edTextSign);
        mBtnSave = (Button) findViewById(R.id.btnSave);
        mBtnSave.setOnClickListener(this);
    }

    private void saveSign(){
        String str = mEdTextSign.getText().toString();
        if (TextUtils.isEmpty(str)){
            Toast.makeText(this, "不能为空...", Toast.LENGTH_SHORT).show();
            return;
        }
        SharedPreferences.Editor editor = this.getSharedPreferences("SIGN",MODE_PRIVATE).edit();
        editor.putString("sign",str);
        editor.apply();
        Toast.makeText(this, "保存成功...", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnSave:
                saveSign();
                break;
        }
    }
}