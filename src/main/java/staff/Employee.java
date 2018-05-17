package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private Double salary;

    public Employee(String name, String ni, Double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;

    }

    public String getEmployeeName(){
        return this.name;
    }

    public String getNi(){
        return this.ni;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double salary) {
        if (salary > 0.0) {
            this.salary += salary;
        }
    }

    public Double payBonus(){
//        Double payBonus;
//        payBonus = this.salary * 0.1;
//        return payBonus;

        return this.salary * 0.01;
    }
}
