package hospital;

// Abstract parent class for all medical staff
public abstract class MedicalStaff {

    // Common information shared by all medical staff
    protected String employeeId;
    protected String department;
    protected int workingHours;

    //Constructor to initialize common staff information
    public MedicalStaff(String employeeId, String department, int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    // Eac medical staff category must define it's own duties
    public abstract void performDuties();
}
