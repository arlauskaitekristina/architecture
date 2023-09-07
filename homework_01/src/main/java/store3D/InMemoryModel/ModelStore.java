package store3D.InMemoryModel;

import store3D.ModelElements.Camera;
import store3D.ModelElements.Flash;
import store3D.ModelElements.PoligonalModel;
import store3D.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий хранилище 3D-сцен и элементов модели (источники света,
 * камеры, полигональные модели).
 * Реализует интерфейс IModelChanger для уведомления об изменениях.
 */
public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    /**
     * Метод для получения 3D-сцены по уникальному идентификатору.
     *
     * @param id Уникальный идентификатор сцены.
     * @return 3D-сцена или null, если сцена с таким идентификатором не найдена.
     */
    public Scene GetScena(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).ID == ID) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Уведомление об изменении модели.
     *
     * @param sender Объект, вызвавший изменение.
     */
    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
