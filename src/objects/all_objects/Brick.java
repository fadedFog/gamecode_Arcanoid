package objects.all_objects;

import objects.BaseObject;
import objects.Canvas;

/**
 * Класс для объекта "кирпич".
 */
public class Brick extends BaseObject {
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');
    }

    @Override
    protected void move() {
        //do nothing
    }
}
