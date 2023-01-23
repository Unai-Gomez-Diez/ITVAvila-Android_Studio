package com.iesam.itvavila.presentation;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.iesam.itvavila.data.DataStore;
import com.iesam.itvavila.domain.models.Bicicleta;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainNota mainNota = new MainNota();
        mainNota.main();
    }
    private void example(){
        DataStore newDataSore = DataStore.build(1024);

        DataStore.id = 2;

        Log.d("@dev", DataStore.id.toString());
    }
    private void bicicleta(){
        Bicicleta bicicleta = new Bicicleta();
        Bicicleta.size = 3;
        System.out.println(bicicleta.getSize());



        Bicicleta bicicleta1 = new Bicicleta();
        Bicicleta.size = 1;
        bicicleta1.getSize();

        MainSingleton mainSingleton = new MainSingleton();
        mainSingleton.main();
    }
}
