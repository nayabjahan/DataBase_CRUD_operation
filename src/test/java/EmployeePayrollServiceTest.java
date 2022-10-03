import java.util.List;

import Main.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Main.EmployeePayrollService.IOSevice.DB_IO;
public class EmployeePayrollServiceTest {
    @Test
    public void givenEmployeePayrollInDB_When_Retrived_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
        Assert.assertEquals(3, employeePayrollData.size());
    }
}
