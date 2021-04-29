import java.util.Scanner;

public class Student {
    private String firstName = "Name";
    private String lastName = "Surname";
    private int year = 1000;
    private char gender = 'm';
    private double mark = 0;

    public Student(String firstName, String lastName, int year, char gender, double mark) {
        setFirstName(firstName);
        setLastName(lastName);
        setYear(year);
        setGender(gender);
        setMark(mark);
    }

    public Student() { }

    public static Student fromString(String student) {
        if(student.matches("\\w+,\\w+,\\d+,\\w,\\d+(.\\d+)")) {
            String[] info = student.split(",");
            String firstName = info[0];
            String lastName = info[1];
            int year = Integer.parseInt(info[2]);
            char gender = info[3].charAt(0);
            double mark = Double.parseDouble(info[4]);
            return new Student(firstName,lastName,year,gender,mark);
        } else {
            return new Student();
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if( year > 1900 && year < 2021) {
            this.year = year;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
    }

    public void getFullName(){
        System.out.printf("%s %s",firstName,lastName);
    }

    public void getInfo() {
        System.out.println("----------------------------");
        System.out.println("Name: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + (gender == 'm'?"male":"female"));
        System.out.println("Mark: " + mark);
    }


}
