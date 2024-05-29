package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.Square_Draw;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Square_Draw squareDraw = new Square_Draw();

        System.out.printf("Square area: %d \n", square.getArea());
        squareDraw.draw(square);
    }
}
