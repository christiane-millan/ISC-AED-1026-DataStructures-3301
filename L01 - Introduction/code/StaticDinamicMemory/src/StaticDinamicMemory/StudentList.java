/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticDinamicMemory;

import java.util.Scanner;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class StudentList {
    Student[] listStudents;
    int sizeGroup;
    
    public StudentList(int sizeList){
        listStudents = new Student[sizeList];
    }
    
    public float computeAverageGroup(){
        float sum = 0.0F;
        for (int i = 0; i < sizeGroup; i++) {
            sum += listStudents[i].computeAverageStudent();
        }
        float average = sum/listStudents.length;
        return average;
    }
    
    public static void main(String[] args) {
        StudentList studentList = new StudentList(1000);
        studentList.sizeGroup = 0;
//        for (int i = 0; i < studentList.listStudents.length; i++) {
//            Student student = new Student();
//            student.initStudent();
//            studentList.listStudents[i] = student;
//        }
        boolean b = true;
        Scanner scan = new Scanner(System.in);
        while (b) {
            Student student = new Student();
            student.initStudent();
            studentList.listStudents[studentList.sizeGroup] = student;
            studentList.sizeGroup ++;
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
        for (int i = 0; i < sizeGroup; i++) {
            list +=  listStudents[i].toString() + "\n";
        }
        return list;
    }
}
