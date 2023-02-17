package OppgaverKlasser1;

public class EmpDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1985,45,2000.0,"kemal");
        emp1.toString(emp1);

        Employee emp2 = new Employee(1988,50,1900.0,"Ali");
        emp1.toString(emp2);
    }
}
