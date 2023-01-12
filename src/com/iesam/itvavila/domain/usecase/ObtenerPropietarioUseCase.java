package src.com.iesam.itvavila.domain.usecase;


import src.com.iesam.itvavila.data.PropietarioDataStore;
import src.com.iesam.itvavila.domain.models.Propietario;

public class ObtenerPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
