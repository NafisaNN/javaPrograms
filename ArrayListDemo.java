import java.util.*;  
 public class ArrayListDemo{  
 public static void main(String args[]){  


      ArrayList<String>  list=new ArrayList<String>();
      list.add("Apple");
      list.add("Mango");
      list.add("Strwberry");
      list.add("papaya");
         System.out.println("List object .....");
        System.out.println(list);
          list.remove("papaya");
        System.out.println("List through for loop .....");
        for(String i:list)
            System.out.println(i);

             System.out.println("List through iterator .....");

      Iterator itr=list.iterator(); 
      while(itr.hasNext()){
       System.out.println(itr.next());
   

       System.out.println("changed List through for loop .....");

       list.set(1,"Dates");  
         
        System.out.println(list);

        
    
      }
 }  
} 
 