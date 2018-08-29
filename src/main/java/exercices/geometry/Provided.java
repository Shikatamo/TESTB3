package exercices.geometry;

public class Provided {
    public static interface PointItf {

        public int getX();
        public int getY();

        /**
         * @return Euclidean distance
         */
        public double distance(PointItf p);
    }

    public static interface Colored {

        public String getColor();

    }
}
