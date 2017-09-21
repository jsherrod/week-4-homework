package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.*;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, Organization they work for, Birthday
 *
 * As for the Organization that the Employee works for, you must also (at the very least) track this information:
 * Organization Name, Number of Employees
 *
 * The system must be able to properly compare any two employees against each other to determine,
 * if they are the same Person. This means that if you compared two People,
 * with the same Name, Birthday, and Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same Organization name are to be thought of as equal,
 * different names means different organizations.
 */
public class StructureTest
{

    // Define 3 instances each of Company and Employee
    Company c1, c2, c3;
    Employee e1, e2, e3;

    @Before
    public void setup()
    {
        // Test companies to use for comparison
        c1 = new Company("Siemens", 9876);
        c2 = new Company("Johnson", 6543);
        c3 = new Company("Honeywell", 999);

        // Test employees to use for comparison
        e1 = new Employee("James Sherrod", "Service Technician", c1, new GregorianCalendar(1983, Calendar.JULY, 16));
        e2 = new Employee("Roy Nelson", "Project Manager", c2, new GregorianCalendar(1981, Calendar.FEBRUARY, 25));
        e3 = new Employee("Murray Pratt","Account Engineer", c3, new GregorianCalendar(1957, Calendar.JANUARY, 19));
    }


    @Test
    public void employeeComplete()
    {
        //
        // check that an employee's attribute are complete and make sense.
        // assertTrue( employee is alive and company complies with child labor laws ...;
        //...
        assertTrue(e2.getName()!=null && e2.getCompany()!=null && e2.getBirthday()!=null);
    }

    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq()
    {

        // e4 created as a duplicate of e3
        Employee e4 = new Employee("Murray Pratt","Account Engineer", c3, new GregorianCalendar(1957, Calendar.JANUARY, 19));

        // test employee equality
        assertTrue(e3.equals(e4));

        // make e4 join Honeywell
        e4.setCompany(c2);

        // test e3 and e4 no longer equal
        assertNotEquals(e3, e4);

    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq()
    {
        // c4 created as a duplicate to c1
        Company c4 = new Company("Siemens", 9876);

        // test company equality
        assertTrue(c1.equals(c4));

        // change c4 name
        c4.setName("Tridium");
        assertNotEquals(c1, c4);

    }

    @Test
    public void companyComplete()
    {
        // test company attributes
        assertTrue(c1.getName()!=null && 0<c1.getName().length());
        assertTrue(0<c1.getNumberOfEmployees());
    }
}