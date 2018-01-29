package com.example.anshuman.mvvm_example.model;

import android.content.Context;
import android.widget.Toast;

import com.example.anshuman.mvvm_example.MainActivity;

/**
 * Created by anshuman on 29-01-2018.
 */

public class User {

    private String number;
    public String numberHint;

    public User(String numberHint) {
        this.numberHint = numberHint;
    }

    public User() {
    }
}
