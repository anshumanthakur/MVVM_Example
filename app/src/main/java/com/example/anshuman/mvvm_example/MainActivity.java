package com.example.anshuman.mvvm_example;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.anshuman.mvvm_example.ViewModel.UserModel;
import com.example.anshuman.mvvm_example.commands.userLogin;
import com.example.anshuman.mvvm_example.databinding.ActivityMainBinding;
import com.example.anshuman.mvvm_example.model.User;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserModel userModel=new UserModel(new User("number"));

        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserLoginEvent(new userLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
