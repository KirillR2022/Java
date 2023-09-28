package InMemoryModel;
// Хранилище моделей

import ModelElements.*;

import java.util.List;
import java.util.ArrayList;


public class ModelStore implements IModelChanger {
    public ModelStore(IModelChangedObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(0, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());

    }

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    // Регистрация изменений моделей
    @Override
    public void notifyChange(IModelChanger sender) {
    }

    public Scene getScena(int id) {
        return null;
    }

}