package ru.mvrlrd.materialdesignbuttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickFlatButton(View view){
        Log.d("ButtonActivity","FlatButton was pressed");
    }
    public void onClickFlatButtonWithBackground(View view){
        Log.d("ButtonActivity","FlatButtonWithBackground was pressed");
    }
    public void onClickRaisedButton(View view){
        Log.d("ButtonActivity","RaisedButton was pressed");
    }
    public void onClickRaisedButtonWithBackground(View view){
        Log.d("ButtonActivity","RaisedButtonWithBackground was pressed");
    }
    public void onClickFloatButton(View view){
        Log.d("ButtonActivity","FloatButton was pressed");
    }
}
