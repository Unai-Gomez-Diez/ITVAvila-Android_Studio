package com.iesam.itvavila.domain.models;

public class Bicicleta {
    private Integer param1;
    private String param2="123";

    public static int size = 2;
    public Bicicleta(){

    }
    public Bicicleta(String param1){

    }

    public Bicicleta(String param1, String param2){

    }

    public Integer getParam1() {
        return param1;
    }

    public void setParam1(Integer param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }
    public int getSize(){
        return size;
    }
}
