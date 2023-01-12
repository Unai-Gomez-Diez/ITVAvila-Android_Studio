package src.com.iesam.itvavila.domain.usecase;

import src.com.iesam.itvavila.data.VehiculoDataStore;
import src.com.iesam.itvavila.domain.models.Camion;
import src.com.iesam.itvavila.domain.models.Vehiculo;

public class GuardarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo model) {
        dataStore.guardar(model);
    }
}
