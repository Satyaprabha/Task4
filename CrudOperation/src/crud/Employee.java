package crud;
import java.util.Scanner;
import java.util.*;

class Employee {
      private int empno;
      private String ename;
      private int salary;
      
      Employee(int empno, String ename, int salary){
    	  this.empno = empno;
    	
    	  this.ename = ename;
    	  this.salary = salary;
      }
      
      public int getEmpno() {
    	  return empno;
      }
      public String getEname() {
    	  return ename;
      }
      public int getsalary() {
    	  return salary;
      }
      
      public String toString() {
    	  return empno+" "+ename+" "+salary;
      }
}
    class CRUDDEMO{
	public static void main(String[] args) {
		
		List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
    	 System.out.println("1.INSERT");
    	 System.out.println("2.DISPLAY");
    	 System.out.println("3.SEARCH");
    	 System.out.println("4.DELETE");
    	 System.out.println("5.UPDATE");
    	 System.out.println("Enter your choice : ");
    	 ch = s.nextInt();
    	 
    	 switch(ch) {
    	 case 1:
    		 System.out.print("Enter Empno : ");
    	     int empno = s.nextInt();

    		 System.out.print("Enter Empname : ");
    	     String ename = s1.nextLine();

    		 System.out.print("Enter salary : ");
    	     int salary = s.nextInt();
    	     
    	     c.add(new Employee(empno,ename,salary));
    	     break;
    	 case 2:
    		 System.out.println("---------------------------");
    		 Iterator<Employee> i = c.iterator();
    		 while(i.hasNext()) {
    			 Employee e = i.next();
    			 System.out.println(e);
    		 }
    		 System.out.println("---------------------------");
    		 break;
    	 case 3:
    		 boolean found = false;
    		 System.out.println("Enter Empno to search : ");
    		 empno = s.nextInt();
    		 System.out.println("---------------------------");
    		 i = c.iterator();
    		 while(i.hasNext()) {
    			 Employee e = i.next();
    			 if(e.getEmpno() == empno) {
    			   System.out.println(e);
    			   found = true;
    			 }
    		 }
    		 
    		 if(!found) {
    			 System.out.println("Record not found");
    		 }
    		System.out.println("---------------------------");
    		break;
      	case 4:
    		 found = false;
    		 System.out.println("Enter Empno to Delete: ");
    		 empno = s.nextInt();
    		 System.out.println("---------------------------");
    		 i = c.iterator();
    		 while(i.hasNext()) {
    			 Employee e = i.next();
    			 if(e.getEmpno() == empno) {
    			   i.remove();
    			   found = true;
    			 }
    		 }
    		 
    		 if(!found) {
    			 System.out.println("Record not found");
    		 }else {
    			 System.out.println("Record is Deleted Successfully....!");
    		 }
    		System.out.println("---------------------------");
    		break;
    	
      	case 5:
   		 found = false;
   		 System.out.println("Enter Empno to Update: ");
   		 empno = s.nextInt();
   		 System.out.println("---------------------------");
   		 ListIterator<Employee>li = c.listIterator();
   		 while(li.hasNext()) {
   			 Employee e = li.next();
   			 if(e.getEmpno() == empno) {
   			    System.out.println("Enter new name : ");
   			    ename = s1.nextLine();
   			    
   			    System.out.println("Enter new Salary : ");
			    salary = s.nextInt();
			    
			    li.set(new Employee(empno,ename,salary));
   			   found = true;
   			 }
   			 
   		 }
   		 
   		 if(!found) {
   			 System.out.println("Record not found");
   		 }else {
   			 System.out.println("Record is Updated Successfully....!");
   		 }
   		System.out.println("---------------------------");
   		break;
  
    		
    		
    	 }
    	 
     }while(ch!=0);

        
	}
    }
    

