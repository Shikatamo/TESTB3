package exercices.geometry;

public class Provided {
    public interface PointItf {

        int getX();

        int getY();

        /**
         * @return Euclidean distance
         */
        default double distance(PointItf p) {
            return Math.pow(
                    Math.pow(this.getX() - p.getX(), 2)
                            + Math.pow(this.getY() - p.getY(), 2),
                    0.5);
        }
    }

    public interface Colored {

        String getColor();

    }
}
