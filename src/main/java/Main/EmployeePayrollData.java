package Main;
import java.time.LocalDate;
public class EmployeePayrollData {
    private int id;
    private String name;
    private double salary;
    private LocalDate date;

    public EmployeePayrollData(int id, String name, double salary, LocalDate start_date) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = start_date;
    }

    public EmployeePayrollData() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStart_date() {
        return date;
    }

    public void setStart_date(LocalDate start_date) {
        this.date = start_date;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", start_date=" + date +
                '}';
    }
}
