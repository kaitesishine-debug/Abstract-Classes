package hospital;

// Represents a doctor at Mukono Hospital
public class Doctor extends MedicalStaff {

    // Initializes the doctor's common staff information
    public Doctor(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    // Defines the duties performed by a doctor
    @Override
    public void performDuties() {
        System.out.println("Doctor in " + department + "diagnoses and treats patients.");
    }
}
