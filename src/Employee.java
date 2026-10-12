public class Employee {
   private String name;
   private String surname;
    private int phoneNumber;
    private double salary;

    public Employee (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name , String surname , int phoneNumber , double salary){
        this.name = name;
        this.surname = surname;
        this.phoneNumber =  phoneNumber;
        this.salary = salary;
    }
    public Employee () {}
    public void raiseSalary(double percent){
        double raise = salary * (percent/100);
        salary = salary + raise;
    }

    public void wypiszDane (){
        System.out.println("pracownik: "+ this.name + " " + this.surname + " " );
    }

    public String getName(){
        return  name;
    }
    public String getsurname() {
        return surname;
    }
    public int getphoneNumber() {
        return phoneNumber;
    }
    public double getsalary() {
        return salary;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }

}
