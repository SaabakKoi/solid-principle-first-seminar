package lsp1.shape;

import lsp1.Quadrilateral;

public class Square extends Quadrilateral {

    private int side;
    public Square(int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
