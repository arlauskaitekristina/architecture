package store3D.InMemoryModel;

public interface IModelChanger {
    /**
     * Метод для уведомления об изменении модели.
     *
     * @param sender Объект, вызвавший изменение.
     */
    public void NotifyChange(IModelChanger sender);
}
