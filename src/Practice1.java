
import java.util.Scanner;

class TestRectangle2 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 15);
        double area = rect.getArea();
        System.out.println("area = " + area);
        rect.setWidth(20);
        area = rect.getArea();
        System.out.println("new area = " + area);
    }
}


class Rectangle {
    double height;
    double width;
    double area;

    Rectangle(double h, double w) {
        height = h;
        width = w;
        area = w * h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        updateArea();
    }

    private void updateArea() {
        area = width * height;
    }

    double getArea() {
        return area;
    }
}
