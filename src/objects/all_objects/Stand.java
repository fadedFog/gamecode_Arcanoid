package objects.all_objects;

import application.Arkanoid;
import objects.BaseObject;
import objects.Canvas;

/**
 * Подставка, с помощью которой отражаеться мячик.
 */
public class Stand extends BaseObject {
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };
    private double speed = 1;
    //направление (-1 влево, +1 вправо)
    private double direction = 0;

    public Stand(double x, double y) {
        super(x, y, 3);
    }

    public void move() {
        double dx = speed * direction;
        x = x + dx;

        checkBorders(radius, Arkanoid.game.getWidth() - radius + 1, 1, Arkanoid.game.getHeight() + 1);
    }

    public void moveLeft() {
        direction = -1;
    }

    public void moveRight() {
        direction = 1;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }
}
