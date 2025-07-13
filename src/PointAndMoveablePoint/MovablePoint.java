package PointAndMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //contructor tham so day đủ x,y, xspeed, yspeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // gọi constructor của lớp cha mà lớp con muốn sử dụng
        this.xSpeed = xSpeed;  //gán giá trị cho thuộc tính mới của lớp của lớp con
        this.ySpeed = ySpeed;
    }

    // Constructor chỉ có xSpeed, ySpeed
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //constructor khong tham so
       public MovablePoint(){
       }

       //get & set
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move() {
        // thực hiện di chuyển tọa độ
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
