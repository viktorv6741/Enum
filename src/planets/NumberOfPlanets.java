package planets;

public enum NumberOfPlanets {

    MERCURY(){
        @Override
        public void description() {
            System.out.println("The first planet from the Sun");
            System.out.println("Discovery: Known to the ancients and visible to the naked eye ");
            System.out.println("Orbit: 88 Earth days");
            System.out.println("Day: 58.6 Earth days");
        }
    },
    VENUS(){
        @Override
        public void description() {
            System.out.println("The second planet from the Sun");
            System.out.println("Discovery: Known to the ancients and visible to the naked eye ");
            System.out.println("Orbit: 225 Earth days");
            System.out.println("Day: 241 Earth days");
        }
    },
    EARTH(){
        @Override
        public void description() {
            System.out.println("The third planet from the Sun");
            System.out.println("Orbit: 365.24 days");
            System.out.println("Day: 23 hours, 56 minutes");
        }
    },
    MARS(){
        @Override
        public void description() {
            System.out.println("The fourth planet from the sun");
            System.out.println("Discovery: Known to the ancients and visible to the naked eye");
            System.out.println("Orbit: 687 Earth days");
            System.out.println("Day: Just more than one Earth day (24 hours, 37 minutes)");
        }
    },
    JUPITER(){
        @Override
        public void description() {
            System.out.println("The fifth planet from the sun");
            System.out.println("Discovery: Known to the ancients and visible to the naked eye");
            System.out.println("Orbit: 11.9 Earth years");
            System.out.println("Day: 9.8 Earth hours");
        }
    },
    SATURN(){
        @Override
        public void description() {
            System.out.println("The sixth planet from the sun");
            System.out.println("Discovery: Known to the ancients and visible to the naked eye");
            System.out.println("Orbit: 29.5 Earth years");
            System.out.println("Day: About 10.5 Earth hours");
        }
    },
    URANUS(){
        @Override
        public void description() {
            System.out.println("The seventh planet from the sun");
            System.out.println("Discovery: 1781 by William Herschel (was thought previously to be a star)");
            System.out.println("Orbit: 84 Earth years");
            System.out.println("Day: 18 Earth hours");
        }
    },
    NEPTUNE(){
        @Override
        public void description() {
            System.out.println("The eighth planet from the sun");
            System.out.println("Discovery: 1846");
            System.out.println("Orbit: 165 Earth years");
            System.out.println("Day: 19 Earth hours");
        }
    };

    public abstract void description();
}
