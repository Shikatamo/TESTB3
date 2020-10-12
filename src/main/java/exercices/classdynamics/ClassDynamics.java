package exercices.classdynamics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClassDynamics {
    private List<Student> students;

    public ClassDynamics(List<Student> students) {
        this.students = students;
    }

    //Skeletons of test response classes
    public String bestProgression() {
        return students.stream()
                .filter(student -> student.getFirstAvg() <= student.getSecondAvg() && student.getSecondAvg() <= student.getThirdAvg())
                .sorted((student, st2) -> (student.getThirdAvg() - student.getFirstAvg()) < (st2.getThirdAvg() - st2.getFirstAvg()) ? 1 : -1)
                .collect(Collectors.toList()).get(0).getName();
    }

    public String[] topThree() {

        List<Student> orderedStudents = students.stream()
                .sorted(Comparator.comparingDouble(Student::getYearAvg).reversed())
                .collect(Collectors.toList());

        return new String[]{orderedStudents.get(0).getName(), orderedStudents.get(1).getName(), orderedStudents.get(2).getName()};
    }

    public double[] statSummary() {

        List<Student> orderedStudents = students.stream()
                .sorted(Comparator.comparingDouble(Student::getYearAvg))
                .collect(Collectors.toList());

        double q1 = orderedStudents.get((orderedStudents.size() / 4)).getYearAvg();
        double median = orderedStudents.get((orderedStudents.size() / 2)).getYearAvg();
        double q3 = orderedStudents.get(orderedStudents.size() - (orderedStudents.size() / 4)).getYearAvg();


        return new double[]{q1, median, q3};
    }
}
