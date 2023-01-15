package com.iesam.itvavila.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.iesam.itvavila.data.DataStore;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainNota mainNota = new MainNota();
        mainNota.main();
    }
    private void example(){
        DataStore dataStore = new DataStore(123,4);
    dataStore.setSize(21323123);
    }
}
