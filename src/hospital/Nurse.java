package hospital;

// Represents a nurse at Mukono Hospital
public class Nurse extends MedicalStaff {

    // Initializes the nurse's common staff information
    public Nurse(String employeeId, String department, int workingHours) {
        super((employeeId, department, workingHours);
    }

    // Defines the duties performed by a nurse
    @Override
    public void performDuties() {
        System.out.println("Nurse cares for patients and monitors their recovery.");
    }
}
