package src.com.iesam.itvavila.domain.usecase;

import src.com.iesam.itvavila.data.PropietarioDataStore;
import src.com.iesam.itvavila.domain.models.Propietario;

public class GuardarPropietarioUseCasse {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario model) {
        dataStore.guardar(model);
    }
}
