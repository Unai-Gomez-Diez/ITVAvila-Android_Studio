package src.com.iesam.itvavila.domain.usecase;

import src.com.iesam.itvavila.data.InspeccionDataStore;
import src.com.iesam.itvavila.data.PropietarioDataStore;
import src.com.iesam.itvavila.domain.models.Inspeccion;
import src.com.iesam.itvavila.domain.models.Propietario;

public class GuardarInspeccionUsaCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion model) {
        dataStore.guardar(model);
    }
}
