package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;  // Т.к. на диаграмме связь с классом "Camera" явно имеется

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;

        if (models.size() == 0) {
            throw new Exception("Должна быть хотя бы одна модель");           // т.к. "1..*"
        } else {
            this.models = models;
        }

        this.flashes = flashes;     // т.к. "0..*" допускается 0.

        if (cameras.size() == 0) {
            throw new Exception("Должна быть хотя бы одна модель");
        } else {
            this.cameras = cameras;
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }

}