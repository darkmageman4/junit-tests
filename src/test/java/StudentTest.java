import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    Student pullfrom;

    @Before
    public void setUp() {
        pullfrom = new Student(12, "Wagner");
        pullfrom.addGrade(10);
    }

    @Test
    public void testGetId() {
        assertEquals(12, pullfrom.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Wagner", pullfrom.getName());
    }

    @Test
    public void testAddGrade() {
        assertEquals(1, pullfrom.getGrades().size());
        pullfrom.addGrade(10);
        pullfrom.addGrade(10);
        pullfrom.addGrade(10);

        assertEquals(4, pullfrom.getGrades().size());

    }

//    @Test
//    public void testgetGradeAverage(){
//        assertEquals(4,pullfrom.getGradeAverage());
//    }

}
