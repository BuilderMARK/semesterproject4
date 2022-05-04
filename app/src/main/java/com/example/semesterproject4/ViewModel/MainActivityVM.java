package ViewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityVM extends ViewModel {

    private int data;

    public MainActivityVM(){
        data = 0;
    }

    public int getData(){
        return data;
    }

    public void addData(int data){
        this.data = data;
    }

    public void genData(){
        double tmp = Math.random()*12;
        data = (int)tmp;
    }
}
