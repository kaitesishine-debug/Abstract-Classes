package hospital;

public class Pharmacist extends MedicalStaff {

    public Pharmacist(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Pharmacist in " + department
                + "dispenses medicines and advises patients on their use.");
    }
}
