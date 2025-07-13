package PointAndMoveablePoint;

public class MainPoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);

        System.out.println("Before move: " + point);
        point.move();
        System.out.println("After move: " + point);
    }
}
