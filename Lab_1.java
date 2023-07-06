public class Lab_1 {
    public static void main(String[] args) {

        Manager manager = new Manager("Jhon Doe", 40, 123, 50000,"IT");
        Programer programer = new Programer("Jane Smith", 30, 456, 40000, "Java");
        Security security = new Security("Adam Jones", 45, 789, 18000, "Night");

        manager.displayDetails();
        manager.work();
        manager.Callmeeting();

        programer.displayDetails();
        programer.work();
        programer.coding();

        security.displayDetails();
        security.work();
        security.patrol();
    }
}

class employee{

    String name;
    int age;
    int Emp_ID;
    int salary;

    employee(String name,int age,int Emp_ID,int salary){
        this.name = name;
        this.age = age;
        this.Emp_ID = Emp_ID;
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.name + " is working");
    }
    
    public String getDepartment(){
        return "";
    }

    public String getLanguage(){
        return "";
    }

    public String getShift(){
        return "";
    }

    public void displayDetails(){
        int daisies = 36;
         for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Employee ID : " + this.Emp_ID);
        System.out.println("Salary : " + this.salary);

        String department = getDepartment();
        String language = getLanguage();
        String shift = getShift();
        if (!department.isEmpty()) {
            System.out.println("Department : " + department);
        }
        if (!language.isEmpty()) {
            System.out.println("Language : " + language);
        }        
        if (!shift.isEmpty()) {
            System.out.println("Avaliable at " +shift + " Shift");
        }
        }
}

class Manager extends employee{

    public String department;
    Manager(String name, int age, int Emp_ID, int salary,String department) {
        super(name, age, Emp_ID, salary);
        this.department = department;
    }

    public void Callmeeting(){
        System.out.println(this.name + " is scheduling a meeting");
    }

    public String getDepartment() {
        if (department.isEmpty()){
            return "";
        } else {
            return department;
        }
    }
}

class Programer extends employee{
    
    public String language;
    Programer(String name, int age, int Emp_ID, int salary,String language) {
        super(name, age, Emp_ID, salary);
        this.language = language;
    }

    public void coding(){
        System.out.println(this.name + " is coding");
    }

    public String getLanguage(){
        if (language.isEmpty()) {
            return "";
        } else {
            return language;
        }
    }
}

class Security extends employee{

    public String shift;
    Security(String name, int age, int Emp_ID, int salary,String shift) {
        super(name, age, Emp_ID, salary);
        this.shift = shift;
    }

    public void patrol(){
        System.out.println(this.name + " is patrolling");
    }

    public String getShift(){
        if (shift.isEmpty()){
            return "";
        }else{
            return shift;
        }
    }
}