package tpm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนชื่อนักศึกษา: ");
        String name = scanner.nextLine();

        System.out.print("ป้อนคะแนน: ");
        int score = scanner.nextInt();

        Student student = new Student(name, score);
        char grade = GradeCalculator.calculateGrade(student.getScore());

        if (grade == 'X') {
            System.out.println("คะแนนไม่ถูกต้อง (0-100)");
        } else {
            System.out.println("เกรดของ " + student.getName() + " คือ: " + grade);
        }

        scanner.close();
    }
}