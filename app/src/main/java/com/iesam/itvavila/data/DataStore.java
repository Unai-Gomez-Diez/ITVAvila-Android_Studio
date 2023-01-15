package com.iesam.itvavila.data;

public class DataStore {



        public Integer size;
        public Integer ruedas;

        public DataStore(){

        }



        public DataStore(Integer size){
                this.size = size;
        }

        public DataStore(Integer size, Integer ruedas){
                this.size=size;
                this.ruedas=ruedas;
        }

        public Integer getSize() {
                return size;
        }

        public void setSize(Integer size) {
                this.size = size;
        }
        public Integer getRuedas() {
                return ruedas;
        }

        public void setRuedas(Integer ruedas) {
                this.ruedas = ruedas;
        }
}
