package store3D.ModelElements;

import store3D.Stuff.Angle3D;
import store3D.Stuff.Point3D;

/**
 * Класс, описывающий источник света в 3D-сцене.
 * Содержит информацию о местоположении, угле, цвете и мощности источника света.
 */
public class Flash {
    // Местоположение источника света в 3D-пространстве
    public Point3D Location;

    // Угол поворота источника света
    public Angle3D Angle;

    // Цвет источника света
    public java.awt.Color color;

    // Мощность источника света
    public float Power;

    /**
     * Метод для вращения источника света.
     *
     * @param angle3D Угол, на который следует повернуть источник света.
     */
    public void Rotate(Angle3D angleAction) {

    }

    /**
     * Метод для перемещения источника света.
     *
     * @param point3D Точка, в которую следует переместить источник света.
     */
    public void Move(Point3D pointAction) {

    }
}
