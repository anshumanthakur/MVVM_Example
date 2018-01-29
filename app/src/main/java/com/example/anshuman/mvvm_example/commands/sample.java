package com.example.anshuman.mvvm_example.commands;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by anshuman on 29-01-2018.
 */

public class sample {
    public void onClickLogin(View view, Context context){
        Toast.makeText(context, "you just clicked me", Toast.LENGTH_SHORT).show();
    }

}
