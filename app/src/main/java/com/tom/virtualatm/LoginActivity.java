package com.tom.virtualatm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //private EditText edAccount;
    //private EditText edPassword;
    //private Button bLogin;
    //private Button bCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // findViews();
        setContentView(R.layout.activity_login);
    }


    //private void findViews (){
       // edAccount = (EditText) findViewById(R.id.ed_account);
       // edPassword = (EditText) findViewById(R.id.ed_password);
       // bLogin = (Button) findViewById(R.id.b_login);


    //}

    public void login (View v){
        EditText edAccount = (EditText) findViewById(R.id.ed_account);
        EditText edPassword = (EditText) findViewById(R.id.ed_password);

        String uid = edAccount.getText().toString();
        String pw = edPassword.getText().toString();
        if(uid.equals("jack") && pw.equals("1234")){
            Toast.makeText(this,"login access", Toast.LENGTH_LONG).show();
            finish();
        }
        else{
            new AlertDialog.Builder(this)
                    .setTitle("Atm")
                    .setMessage("login failed")
                    .setPositiveButton("OK", null)
                    .show();

        }
    }
}
