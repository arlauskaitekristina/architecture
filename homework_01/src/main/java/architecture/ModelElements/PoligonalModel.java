package architecture.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий полигональную модель.
 * Содержит списки полигонов и текстур, ассоциированных с моделью.
 */
public class PoligonalModel {
    // Список текстур, ассоциированных с моделью
    public List<Texture> Textures;

    // Список полигонов, составляющих модель
    public List<Poligon> Poligons;

    /**
     * Конструктор класса PoligonalModel, инициализирует список текстур и создает
     * пустой список полигонов.
     *
     * @param textures Список текстур для модели.
     */
    public PoligonalModel(List<Texture> Textures) {
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;
    }
}
