package com.example.anshuman.mvvm_example.ViewModel;

import android.databinding.BaseObservable;

import com.example.anshuman.mvvm_example.R;
import com.example.anshuman.mvvm_example.model.User;

/**
 * Created by anshuman on 29-01-2018.
 */

public class UserModel extends BaseObservable{
    private String number;
    private String numberHint;

    public String getNumber() {
        return number;
    }

    public String getNumberHint() {
        return numberHint;
    }

    public void setNumberHint(String numberHint) {
        this.numberHint = numberHint;
    }

    public void setNumber(String number) {
        this.number = number;
        notifyPropertyChanged(R.id.input_number);

    }

    public UserModel(User user) {

        this.numberHint=user.numberHint;
    }


}
