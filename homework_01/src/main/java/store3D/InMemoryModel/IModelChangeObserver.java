package store3D.InMemoryModel;

public interface IModelChangeObserver {
    /**
     * Метод, вызываемый при изменении модели.
     */
    public void applyUpdateModel();
}
