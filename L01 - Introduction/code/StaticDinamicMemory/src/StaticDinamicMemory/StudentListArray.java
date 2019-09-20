/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticDinamicMemory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class StudentListArray {
    ArrayList<Student> listStudents;
  
    
    public StudentListArray(){
        listStudents = new ArrayList();
       
    }
    
    public float computeAverageGroup(){
        float sum = 0.0F;
        for (int i = 0; i < listStudents.size(); i++) {
            sum += listStudents.get(i).computeAverageStudent();
            //sum += listStudents[i].computeAverageStudent();
        }
        float average = sum/listStudents.size();
        return average;
    }
    
    
    public static void main(String[] args) {
        StudentListArray studentList = new StudentListArray();
        
        boolean b = true;
        Scanner scan = new Scanner(System.in);
        while (b) {
            Student student = new Student();
            student.initStudent();
            //studentList.listStudents[studentList.sizeGroup] = student;
            studentList.listStudents.add(student);
            System.out.println("Desea agregar más alumnos [S/N]:");
            String answer = scan.nextLine();
            if ("N".equals(answer)) {
                b = false;
            }
            
        }
        
        System.out.println(studentList.toString());
        System.out.println("Promedio del grupo:" + studentList.computeAverageGroup());
    }
    
    public String toString(){
        String list = "";
        for (int i = 0; i < listStudents.size(); i++) {
            //list +=  listStudents[i].toString() + "\n";
            list += listStudents.get(i).toString() + "\n";
        }
        return list;
    }
}
