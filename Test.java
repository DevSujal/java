public class Test {
    public static void main(String[] args) {
        
        EmployDetails emp = new EmployDetails(222, "Shivansh", 100000);

        double s = emp.getGrossSalary();

        System.out.println("the total salary of a person is " + s);
        System.out.println(emp);

     // System.out.println(emp.getName() + "\n" + emp.getEmpId() + "\n" + emp.getBasicSalary());

 
 // explicit type casting  = type casting and type demotion or down casting 
  //  implicit type casting = type conversion and type promotion or up casting 
   }
}
