public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");


   Employee pracownik1 = new Employee();
   Employee pracownik2 = new Employee( "Adam",  "Mickiewicz" );
   Employee pracownik3 = new Employee( "Ewa" ,"Kowalska" );
   Meneger meneger = new Meneger("Janusz" ,"Mydlany" , 56565 , 3500 , 2000);
   Progamer progamer = new Progamer("Kuba" , "Kubek" , 555555 , 2334 , "java");

   Employee progamer1 = new Progamer()

        pracownik1.wypiszDane();
  // pracownik1.name = "Juliusz";
 //  pracownik1.surname = "Słowacki";

   pracownik1.wypiszDane();
   pracownik2.wypiszDane();
 //  pracownik1.salary = 4000;
   pracownik1.raiseSalary(10);

   //System.out.println(pracownik1.salary);

        pracownik3.wypiszDane();
        System.out.println(pracownik3.getsalary());
        pracownik3.setsalary(3500);
        meneger.wypiszDane();

        System.out.println(pracownik3.getsalary());
        System.out.println(meneger.getsalary());
    }
}