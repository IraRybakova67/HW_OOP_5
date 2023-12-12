package model;

import java.util.List;

public class Group {

    private int numberGroup;
    private Teacher teacherGroup;
    private List<Student> students;

    public Group(int numberGroup, Teacher teacherGroup, List<Student> students) {
        this.teacherGroup = teacherGroup;
        this.students = students;
        this.numberGroup = numberGroup;
    }

    public Teacher getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(Teacher teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacherGroup +
                ", students=" + students +
                '}';
    }

}
