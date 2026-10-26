package hospital;

public class LaboratoryTechnician extends MedicalStaff {


    // Uses the parent constructor to initialize common stuff details
    public LaboratoryTechnician(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Laboratory technician in " + department
        + "collects samples and performs medical tests.");
    }
}
