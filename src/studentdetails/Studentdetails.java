/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**print student details name, age using array
 *
 * @author 16476
 */
public class Studentdetails 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) // view class - user interaction i/p and o/p
    {
        // print student details name, age using array - MVC design pattern - view class is only responsible for 
        //user interaction
        //create an object for student 
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(21);
        
        Student s2 = new Student();
        s2.setName("John");
        s2.setAge(23);
        
        Student s3 = new Student();
        s3.setName("Mary");
        s3.setAge(25);
        
        //Array is homogeneous- only same data types can be saved
        
        Student[] list = new Student[3]; //we need an array to store string, int //this is the array of objects declaration
        list[0]= s1;
        list[1]= s2;
        list[2]= s3;  //objects are store like this in the array
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " "+list[i].getAge());
        }
       
    }
}

        
        
        
        
    
    

