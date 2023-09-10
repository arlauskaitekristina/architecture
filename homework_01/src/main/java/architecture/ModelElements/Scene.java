package architecture.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий 3D-сцену.
 */
public class Scene {
    // Уникальный идентификатор сцены
    public int ID;

    // Список полигональных моделей на сцене
    public List<PoligonalModel> Models;

    // Список источников света на сцене

    public List<Flash> Flashes;

    // Список камер на сцене
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
