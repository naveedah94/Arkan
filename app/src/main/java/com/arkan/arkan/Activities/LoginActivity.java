package com.arkan.arkan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.arkan.arkan.R;
import com.arkan.arkan.HelperClasses.InternetConnectivityErrorGenerator;
import com.arkan.arkan.Webservices.Retrofit.RetrofitClient;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText usernameText, passwordText;
    private InternetConnectivityErrorGenerator internetCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializations();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginClicked();
            }
        });
    }

    private void loginClicked() {
        if(internetCheck.isNetworkAvailable()){
            Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(i);
        } else {
            internetCheck.createNetErrorDialog();
        }
    }

    private void initializations() {
        loginButton = (Button) findViewById(R.id.login_btn);
        usernameText = (EditText) findViewById(R.id.username_text);
        passwordText = (EditText) findViewById(R.id.password_text);

        /**
         * Creating retrofit instance
         */
        RetrofitClient.createRetrofitInstance();

        internetCheck = new InternetConnectivityErrorGenerator(this);
    }
}
