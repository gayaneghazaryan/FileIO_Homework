import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentService studentService = new StudentService();

        FileService.createFolder(("java\\picsart"));
        try {
            FileService.createFile("java\\picsart","homeworkInput.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileService.write("java\\picsart\\homeworkInput.txt","Hayk,Arabyan,1998,m,77.5");
            FileService.write("java\\picsart\\homeworkInput.txt","\nAni,Babayan,1980,f,47.5");
            FileService.write("java\\picsart\\homeworkInput.txt","\nKarine,Vancyan,2000,f,87.5");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] read;

        Student[] students = new Student[10];

        try {
            read = FileService.read("java\\picsart\\homeworkInput.txt");
            students = new Student[read.length];
            for(int i = 0; i < students.length; i++) {
                students[i] = Student.fromString(read[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        boolean isMenuActive = true;
        while(isMenuActive) {
            System.out.println("\nEnter command number");
            System.out.println("1. print full names of students");
            System.out.println("2. print all male students");
            System.out.println("3. print all female students who has mark greater than 50.4");
            System.out.println("4. print student information having the minimal mark");
            System.out.println("5. print biggest male student information");
            System.out.println("6. print students sorted by mark");
            System.out.println("7. print female students sorted by year");
            System.out.println("8. Exit");

            System.out.println();
            int command = s.nextInt();

            switch(command) {
                case 1:
                   studentService.printFullNames(students);
                    break;
                case 2:
                    studentService.printMaleStudents(students);
                    break;
                case 3:
                    studentService.printFemaleWithMarksGreaterThan50point4(students);
                    break;
                case 4:
                    studentService.printStudentInfoWithMinimalMark(students);
                    break;
                case 5:
                    studentService.printBiggestMaleStudentInfo(students);
                    break;
                case 6:
                    studentService.printStudentsSortedByMark(students);
                    break;
                case 7:
                    studentService.printFemaleSortedByYear(students);
                    break;
                case 8:
                    isMenuActive = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid command number");
            }
        }



    }
}
