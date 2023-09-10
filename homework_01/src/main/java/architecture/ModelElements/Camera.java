package architecture.ModelElements;

import architecture.Stuff.Angle3D;
import architecture.Stuff.Point3D;

/**
 * Класс, описывающий камеру в 3D-сцене.
 * Содержит информацию о положении камеры и ее угле.
 */
public class Camera {
    // Местоположение камеры в 3D-пространстве
    public Point3D Location;

    // Угол поворота камеры
    public Angle3D Angle;

    /**
     * Метод для вращения камеры.
     *
     * @param angle3D Угол, на который следует повернуть камеру.
     */
    public void Rotate(Angle3D angleAction) {

    }

    /**
     * Метод для перемещения камеры.
     *
     * @param point3D Точка, в которую следует переместить камеру.
     */
    public void Move(Point3D pointAction) {

    }
}
