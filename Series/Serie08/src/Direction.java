import java.util.Random;

public class Direction {
    public static Random random = new Random();
    public static void main(String[] args) {
        EPFL[] people = new EPFL[5];

        people[0] = new Secretary("Bob", 2021, "IC", 200_000);
        people[1] = new Teacher("Mountford", 1856, "MATH", Integer.MAX_VALUE);
        people[2] = new ExchangeStudent("Bjorn", 2022, "PHYS", "KTH");
        people[3] = new RegularStudent("Tom", 2019, "ARCHI", 5.2);
        people[4] = new FirstYearStudent("Maria", 2023, "IC");

        for (EPFL person : people) {
            System.out.println(person);
        }
    }
}

class EPFL {
    private final String name;
    private final int arrivalYear;

    public EPFL(String name, int arrivalYear) {
        this.name = name;
        this.arrivalYear = arrivalYear;
    }

    @Override
    public String toString() {
        return String.format("%s\n    Name: %s\n    Arrival year: %d\n", this.getClass(), this.name, this.arrivalYear);
    }
}

class Secretary extends EPFL {
    private final String laboratory;
    private final double salary;

    public Secretary(String name, int arrivalYear, String laboratory, double salary) {
        super(name, arrivalYear);
        this.laboratory = laboratory;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("    Laboratory: %s\n    Salary: %.2f\n", this.laboratory, this.salary);
    }
}

class Teacher extends EPFL {
    private final String institute;
    private final double salary;

    public Teacher(String name, int arrivalYear, String institute, double salary) {
        super(name, arrivalYear);
        this.institute = institute;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("    Institute: %s\n    Salary: %.2f\n", this.institute, this.salary);
    }
}

class ExchangeStudent extends EPFL {
    private final String section;
    private final String originalUniversity;

    public ExchangeStudent(String name, int arrivalYear, String section, String originalUniversity) {
        super(name, arrivalYear);
        this.section = section;
        this.originalUniversity = originalUniversity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("    Section: %s\n    Original University: %s\n",
                this.section, this.originalUniversity);
    }
}

class RegularStudent extends EPFL {
    private final String section;
    private final double firstYearResults;

    public RegularStudent(String name, int arrivalYear, String section, double firstYearResults) {
        super(name, arrivalYear);
        this.section = section;
        this.firstYearResults = firstYearResults;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("    Section: %s\n    First Year Results: %.2f\n",
                this.section, this.firstYearResults);
    }
}

class FirstYearStudent extends RegularStudent {
    public FirstYearStudent(String name, int arrivalYear, String section) {
        super(name, arrivalYear, section, Direction.random.nextDouble() * 6);
    }
}