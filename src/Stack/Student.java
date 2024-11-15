package Stack;

public class Student {
    private int am;
    private String name;
    private String surname;
    private double mo;

    public Student(int am, String name, String surname) {
        this(am, name, surname, 0.0);

    }

    public Student(int am, String name, String surname, double mo) {
        this.am = am;
        this.name = name;
        this.surname = surname;
        this.mo = mo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "am=" + am +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mo=" + mo +
                '}';
    }

    public void setAm(int am) {
        this.am = am;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMo(double mo) {
        this.mo = mo;
    }

    public int getAm() {
        return am;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMo() {
        return mo;
    }
}
