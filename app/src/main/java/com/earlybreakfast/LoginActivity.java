package com.earlybreakfast;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.earlybreakfast.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        loginBinding.loginBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                // TODO: 2019-03-11 add your login logic and start your action for routing the app
                // temp action for the design
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                break;
            case R.id.sign_up_btn:
                // TODO: 2019-03-11 start action for registration
                break;
            case R.id.facebook_login:
                // TODO: 2019-03-11 replace the facebook place holder button with build in facebook btn in activity_login.xml
                break;
        }
    }
}
