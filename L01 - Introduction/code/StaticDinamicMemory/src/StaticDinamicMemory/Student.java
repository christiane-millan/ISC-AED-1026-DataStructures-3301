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
public class Student {
    // Esta es la variable llamada first
    String id;
    String firtsNameStudent;
    float grade1;
    float grade2;
    float grade3;
    String email;
    
    public Student(String id, String fnStudent, float grade1, float grade2, 
            float grade3, String email){
        this.id = id;
        this.firtsNameStudent = fnStudent;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.email = email;
    }
    
    public Student(){
        this.id = null;
        this.firtsNameStudent = null;
        this.grade1 = 0.0F;
        this.grade2 = 0.0F;
        this.grade3 = 0.0F;
        this.email = null;
    }
    
    public void initStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el n. de control:");
        id = scanner.nextLine();
        System.out.println("Ingresa el nombre:");
        firtsNameStudent = scanner.nextLine();
        System.out.println("Ingresa la calificación 1er parcial:");
        grade1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingresa la calificación 2do parcial:");
        grade2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingresa la calificación 3er parcial:");
        grade3 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingresa el email:");
        email = scanner.nextLine();
        System.out.println("");
    }
    
    public float computeAverageStudent(){
        return ((grade1 + grade2 + grade3 )/ 3);
    }
    
    @Override
    public String toString(){
        String student = "";
        student = "[" + id + ", " + firtsNameStudent + ", " + grade1 + ", " 
                + grade2 + ", " + grade3 + ", " + email + "]" ;
        return student;
    }
}
