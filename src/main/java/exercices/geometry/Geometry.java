package exercices.geometry;

import exercices.geometry.Provided.Colored;
import exercices.geometry.Provided.PointItf;

public class Geometry {

    public static class Point implements PointItf {

        private int x, y;

        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int getX() {
            return this.x;
        }

        @Override
        public int getY() {
            return this.y;
        }
    }

    public static class ColoredPoint extends Point implements Colored {

        private String color;

        public ColoredPoint (int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

        @Override
        public String getColor() {
            return this.color;
        }
    }
}
