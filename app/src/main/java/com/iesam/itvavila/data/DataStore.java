package com.iesam.itvavila.data;

import java.util.Date;

public class DataStore {


    public Integer size;

    private Date now;

    public static Integer id;

    private DataStore() {

    }


    private DataStore(Integer size) {
        this.size = size;
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    /*


             public static DataStore build(Integer size){
                    DataStore dataStore = new DataStore(size);
                    dataStore.now = new Date();
                    return dataStore;
             }
       */
    public void exampleFunction() {
        Integer edad = 5;
        setSize(1);
        Date now = this.now;
    }

    public static DataStore build(Integer size) {
        DataStore dataStore = new DataStore();
        dataStore.exampleFunction();
        return dataStore;
    }
}

