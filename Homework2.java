import java.util.Scanner;

class Student {
    int studentNumber;
    String name;
    String major;
    long phoneNumber;

    Student(int studentNumber, String name, String major, long phoneNumber) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    int getStudentNumber() {
        return studentNumber;
    }

    int setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
        return studentNumber;
    }

    String getName() {
        return name;
    }

    String setName(String name) {
        this.name = name;
        return name;
    }

    String getMajor() {
        return major;
    }

    String setMajor(String major) {
        this.major = major;
        return major;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }

    long setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
}

class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int studentNumber = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phoneNumber = sc.nextLong();

            students[i] = new Student(studentNumber, name, major, phoneNumber);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            String phone = "0" + students[i].getPhoneNumber();

            System.out.println((i + 1) + "번째 학생: "
                    + students[i].getStudentNumber() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + phone.substring(0, 3) + "-"
                    + phone.substring(3, 7) + "-"
                    + phone.substring(7));
        }
    }
}