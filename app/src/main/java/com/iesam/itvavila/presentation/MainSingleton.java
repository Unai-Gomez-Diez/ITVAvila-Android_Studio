package com.iesam.itvavila.presentation;

import com.iesam.itvavila.data.DataStoreSingleton;

public class MainSingleton {
    public void main(){
        DataStoreSingleton dataStoreSingleton1 = DataStoreSingleton.getInstance();


        DataStoreSingleton dataStoreSingleton2 = DataStoreSingleton.getInstance();
        DataStoreSingleton dataStoreSingleton3 = DataStoreSingleton.getInstance();
        DataStoreSingleton dataStoreSingleton4 = DataStoreSingleton.getInstance();
    }
}
