package src.com.iesam.itvavila.domain.usecase;

import src.com.iesam.itvavila.data.VehiculoDataStore;
import src.com.iesam.itvavila.domain.models.Camion;
import src.com.iesam.itvavila.domain.models.Vehiculo;

public class ObtenerVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matricula) {
        return dataStore.buscar(matricula);
    }
}
