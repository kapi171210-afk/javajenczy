public class Meneger extends Employee{


    private double bonus;
public Meneger(String name, String surname, int phoneNumber, double salary , double bonus){
    super(name, surname, phoneNumber, salary);
    this.bonus = bonus;
}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getsalary() {
    double basesalary = super.getsalary();
        return basesalary + this.bonus;
    }


}
