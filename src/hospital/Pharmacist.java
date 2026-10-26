package hospital;

public class Pharmacist extends MedicalStaff {


    // Uses the parent constructor to initialize common stuff details
    public Pharmacist(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Pharmacist in " + department
                + "dispenses medicines and advises patients on their use.");
    }
}
