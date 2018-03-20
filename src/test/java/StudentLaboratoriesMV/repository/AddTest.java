package StudentLaboratoriesMV.repository;

import StudentLaboratoriesMV.controller.LaboratoriesController;
import StudentLaboratoriesMV.model.Student;
import junit.framework.TestCase;

public class AddTest extends TestCase {

    public void testAddStudentDuplicateException() {
        System.out.println("\ntestAddClientBusinessException");

        try {
            LaboratoriesController ctrl = new LaboratoriesController("students.txt", "laboratories.txt");
            Student student = new Student("mmie1941", "mada", 2);
            ctrl.saveStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(e.getMessage().equals("Student already exists!"));
        }
    }

//    public void testAddClientUIException() {
//        //TODO
//    }
//
//    public void testAddInvoiceBusinessException() {
//        System.out.println("\ntestAddInvoiceBusinessException");
//
//        try {
//            ClientController ctrl = new ClientController();
//            ctrl.AddSubscriberInvoice("mada", "doro", 2010, 10, 100, 90);
//        } catch (Exception e) {
//            e.printStackTrace();
//            assertTrue(e.getMessage().equals("Invoice already exists!"));
//        }
//    }

}
