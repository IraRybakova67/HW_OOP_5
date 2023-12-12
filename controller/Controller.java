package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.GroupLayout.Group;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.GroupService;
import view.StudentView;
import view.TeacherView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    
    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastNameS) {
        dataService.create(firstName, secondName, lastNameS, Type.TEACHER); // создаем преподавателя
    }

    public void getAllTeacher() {
        for (User user : dataService.getAllConcUser(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
    public void finedTeacher(int id ){
        dataService.getUserById(Type.TEACHER, id);
        toString();
        

    }
    private GroupService groupService;

    public Controller(GroupService groupService) {
        this.groupService = groupService;

    }
    public Group createGroup(int numGroup,int teacherID, List <Integer> studentIDs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы");
        numGroup = scanner.nextInt();
        
        System.out.println("ID педагога");
        teacherID = scanner.nextInt();
                  
        
        System.out.println("Введите числа через запятую, когда закончите - введите 0");

        studentIDs = new ArrayList<>();
        // List<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.next());
            if (number == 0) {
                break;
            }
            studentIDs.add(number);
        }

        for (int number : studentIDs) {
            System.out.printf("%d ", number);
        }
        


    }


    
    




            
    
}
        

    


