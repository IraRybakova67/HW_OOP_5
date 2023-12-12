package service;

import java.util.List;

import model.Student;
import model.Teacher;

public class GroupService {

    public model.Group createGroup(int number, Teacher teacher, List<Student> students) {
        return new model.Group(number, teacher, students);
    }

    // public void creatGroup (int teacherID, List<Integer> studentsID){
    // // Scanner scanner = new Scanner(System.in);
    // // System.out.println("Введите id преподавателя: ");
    // // int teacherId = scanner.nextInt();
    // Teacher teacher = User.getUserById();
    // if (teacher == null) {
    // return null;
    // }

    // public static void addStudentById(List<User> students, int studentId) {
    // User groupStudent =

    // User student = user.getUserById(studentId);
    // if (student != null) {
    // students.add(student);
    // }

    // }
}
