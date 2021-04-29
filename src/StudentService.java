public class StudentService {
    //Task1
    public void printFullNames(Student[] students) {
        for(Student student: students) {
            student.getFullName();
            System.out.println();
        }
    }

    //Task2
    public void printMaleStudents(Student[] students) {
        for(Student student: students) {
            if(student.getGender() == 'm') {
                student.getInfo();
            }
        }
    }

    //Task3
    public void printFemaleWithMarksGreaterThan50point4(Student[] students) {
        for(Student student: students) {
            if(student.getGender() == 'f' && student.getMark() > 50.4) {
                student.getInfo();
            }
        }
    }

    //Task4
    public void printStudentInfoWithMinimalMark(Student[] students) {
        Student min = students[0];
        for(int i = 1; i < students.length; i++) {
            if(students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }
        min.getInfo();
    }

    //Task5
    public void printBiggestMaleStudentInfo(Student[] students) {
        Student biggest = students[0];
        for(Student student: students) {
            if(student.getGender() == 'm') {
                biggest = student;
                break;
            }
        }
        for(Student student: students) {
            if(student.getGender() == 'm' && student.getYear() < biggest.getYear()) {
                biggest = student;
            }
        }
        biggest.getInfo();
    }

    //Task6
    public void printStudentsSortedByMark(Student[] students) {
        int l = students.length;
        boolean check = true;
        while(check) {
            check = false;
            for(int i = 0; i < l-1; i++) {
                for(int j = 0; j < l-1-i;j++) {
                    if(students[j].getMark() > students[j+1].getMark()) {
                        Student temp = students[j];
                        students[j] = students[j+1];
                        students[j+1] = temp;
                        check = true;
                    }
                }
            }
        }
        for(Student student: students) {
            student.getInfo();
        }
    }

    //Task7
    public void printFemaleSortedByYear(Student[] students) {
        Student[] females;
        int count = 0;
        for(Student student: students) {
            if(student.getGender() == 'f') {
                count++;
            }
        }
        females = new Student[count];
        int index = 0;
        for(Student student: students) {
            if(student.getGender() == 'f') {
                females[index++] = student;
            }
        }

        boolean check = true;
        while(check) {
            check = false;
            for(int i = 0; i < count-1; i++) {
                for(int j = 0; j < count-1-i;j++) {
                    if(students[j].getYear() < students[j+1].getYear()) {
                        Student temp = students[j];
                        students[j] = students[j+1];
                        students[j+1] = temp;
                        check = true;
                    }
                }
            }
        }
        for(Student student: females) {
            student.getInfo();
        }

    }

//    public static void main(String[] args) {
//        StudentService studentService = new StudentService();
//        Student s1 = new Student("Hayk","Arabyan",1998,'m',77.5);
//        Student s2 = new Student("Ani","Babayan",1980,'f',47.5);
//        Student s3 = new Student("Karine","Vancyan",2000,'f',87.5);
//        Student s4 = new Student("Armen","Khachatryan",1990,'m',95.5);
//        Student[] students = new Student[] {s1,s2,s3,s4};
//
//        studentService.printFullNames(students);
//        studentService.printMaleStudents(students);
//        studentService.printFemaleWithMarksGreaterThan50point4(students);
//        studentService.printStudentInfoWithMinimalMark(students);
//        studentService.printBiggestMaleStudentInfo(students);
//        studentService.printStudentsSortedByMark(students);
//        studentService.printFemaleSortedByYear(students);
//    }

}
