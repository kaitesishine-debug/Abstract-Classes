package hospital;

// Abstract parent class: prevents direct creation of generic medical staff
// and requires concrete subclasses to define their duties.
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

    // Display all information shared by all medical staff
    public void displayStaffInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Working Hours: " + workingHours);
    }

    // Each medical staff category must define it's own duties
    public abstract void performDuties();
}
