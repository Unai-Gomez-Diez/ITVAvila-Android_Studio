package src.com.iesam.itvavila.domain.usecase;

import src.com.iesam.itvavila.data.InspeccionDataStore;
import src.com.iesam.itvavila.data.PropietarioDataStore;
import src.com.iesam.itvavila.domain.models.Inspeccion;
import src.com.iesam.itvavila.domain.models.Propietario;

public class ObtenerInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
