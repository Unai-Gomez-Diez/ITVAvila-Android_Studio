package com.iesam.itvavila.data;

import com.iesam.itvavila.domain.models.Inspeccion;

import com.iesam.itvavila.domain.models.Inspeccion;
import com.iesam.itvavila.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

import com.iesam.itvavila.domain.models.Inspeccion;

public class InspeccionDataStore {
    private static InspeccionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void guardar(Inspeccion model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Inspeccion buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Inspeccion model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static InspeccionDataStore getInstance() {
        if (instance == null) {
            instance = new InspeccionDataStore();
        }
        return instance;
    }
}
