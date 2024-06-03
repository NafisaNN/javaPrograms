import java.util.*;
class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  

   public String toString() {
      return rollno +"  " +name +" "+age ;
   }
}  

class ArrayLiatStudent {

    public static void main(String args[]) {

        Student s1=new Student(101,"pooja",16);
        Student s2=new Student(102,"rohit",17);
        Student s3=new Student(103,"aqua",18);
        Student s4=new Student(104," barbie",20);
        


         ArrayList<Student> li=new ArrayList<Student>();
         li.add(s1);
         li.add(s2);
         li.add(s3);

         System.out.println(li);
         System.out.println("Student at index 1 :" + li.get(1));
         
         //li.clear();
          //li.remove(1);

        // li.set(2,s4
         //System.out.println(li);


    }
}
