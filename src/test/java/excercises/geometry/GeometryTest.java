package excercises.geometry;
import static org.assertj.core.api.Assertions.*;

import exercices.geometry.Geometry.*;
import exercices.geometry.Provided.*;

import org.junit.*;
import org.junit.runners.MethodSorters;

// JUnit will execute test methods in the alphabetical order of their names
@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class GeometryTest {

    @Test
    public void a_testExetends() {
        Point point = new Point(0, 0);
        ColoredPoint coloredPoint = new ColoredPoint(0, 0, "none");

        assertThat(PointItf.class).isAssignableFrom(point.getClass());
        assertThat(Point.class).isAssignableFrom(coloredPoint.getClass());
        assertThat(Colored.class).isAssignableFrom(coloredPoint.getClass());
    }

    @Test
    public void b_testGetSet() {
        Point point = new Point(10000000, 0);
        ColoredPoint coloredPoint = new ColoredPoint(0, -1, "none");

        assertThat(PointItf.class).isAssignableFrom(point.getClass());
        assertThat(PointItf.class).isAssignableFrom(coloredPoint.getClass());

        PointItf p1 = (PointItf)point;
        PointItf p2 = (PointItf)coloredPoint;

        assertThat(p1.getX()).as("x").isEqualTo(10000000);
        assertThat(p1.getY()).as("y").isEqualTo(0);
        assertThat(p2.getX()).as("x").isEqualTo(0);
        assertThat(p2.getY()).as("y").isEqualTo(-1);
    }

    @Test
    public void c_testColor() {
        ColoredPoint coloredPoint = new ColoredPoint(1, 2, "blue");

        assertThat(Colored.class).isAssignableFrom(coloredPoint.getClass());

        Colored colored = (Colored) coloredPoint;

        assertThat(colored.getColor()).as("color").isEqualTo("blue");
    }

    @Test
    public void d_testDistance() {
        Point point = new Point(1, -1);
        ColoredPoint coloredPoint = new ColoredPoint(5, 2, "red");

        assertThat(PointItf.class).isAssignableFrom(point.getClass());
        assertThat(PointItf.class).isAssignableFrom(coloredPoint.getClass());

        PointItf p1 = (PointItf) point;
        PointItf p2 = (PointItf) coloredPoint;

        assertThat(p1.distance(p2)).as("distance").isEqualTo(
                Math.pow(
                        Math.pow(p1.getX()-p2.getX(),2)
                                +Math.pow(p1.getY()-p2.getY(),2),
                        0.5));
    }

}