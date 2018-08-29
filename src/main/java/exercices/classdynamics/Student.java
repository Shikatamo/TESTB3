package exercices.classdynamics;

public class Student {

        private String name;
        private double firstAvg;
        private double secondAvg;
        private double thirdAvg;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getFirstAvg() {
            return firstAvg;
        }

        public void setFirstAvg(double firstAvg) {
            this.firstAvg = firstAvg;
        }

        public double getSecondAvg() {
            return secondAvg;
        }

        public void setSecondAvg(double secondAvg) {
            this.secondAvg = secondAvg;
        }

        public double getThirdAvg() {
            return thirdAvg;
        }

        public void setThirdAvg(double thirdAvg) {
            this.thirdAvg = thirdAvg;
        }

        public double getYearAvg(){
            return (firstAvg + secondAvg + thirdAvg)/3;
        }
}

