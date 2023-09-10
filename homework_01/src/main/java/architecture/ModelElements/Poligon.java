package architecture.ModelElements;

import architecture.Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий полигон.
 * Содержит список точек, определяющих полигон.
 */
public class Poligon {
    // Список точек, формирующих полигон
    public List<Point3D> points = new ArrayList<Point3D>();

    /**
     * Конструктор класса Poligon, инициализирует список точек одной начальной
     * точкой.
     *
     * @param point Начальная точка для полигона.
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}
