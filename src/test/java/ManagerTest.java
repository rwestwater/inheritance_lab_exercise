import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ricardo", "JW162534", 56000.00, "HR");
    }

    @Test
    public void canGetName(){
        assertEquals("Ricardo", manager.getEmployeeName());
    }

    @Test
    public void canGetNi(){
        assertEquals("JW162534", manager.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(56000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(560.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", manager.getDeptName());
    }



}
