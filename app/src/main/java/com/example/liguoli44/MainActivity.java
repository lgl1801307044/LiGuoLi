package com.example.liguoli44;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 姓名
     */
    private TextView mTextName;
    /**
     * 点击去设置签名
     */
    private TextView mTextSign;
    private RecyclerView mMovieRec;
    private LinearLayout mLayTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mTextName = (TextView) findViewById(R.id.textName);
        mTextSign = (TextView) findViewById(R.id.textSign);
        mTextSign.setOnClickListener(this);
        mMovieRec = (RecyclerView) findViewById(R.id.movieRec);
        mLayTop = (LinearLayout) findViewById(R.id.layTop);
        mLayTop.setOnClickListener(this);
    }

    private void initData() {
        MovieBean movieBean = JSONObject.parseObject(SimulateNetAPI.getOriginalFundData(this), MovieBean.class);
        if (movieBean == null) {
            return;
        }
        MovieAdapter movieAdapter = new MovieAdapter(this, movieBean.getList());
        mMovieRec.setAdapter(movieAdapter);
        mMovieRec.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        mTextName.setText(intent.getStringExtra("name"));
        initSign();
    }

    private void initSign() {
        SharedPreferences sharedPreferences = this.getSharedPreferences("SIGN", MODE_PRIVATE);
        String string = sharedPreferences.getString("sign", "");
        if (!TextUtils.isEmpty(string)) {
            mTextSign.setText(string);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        initSign();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.textSign:
                break;
            case R.id.layTop:
                startActivity(new Intent(this,SignActivity.class));
                break;
        }
    }
}