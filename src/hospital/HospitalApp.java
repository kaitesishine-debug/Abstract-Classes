package hospital;

public class HospitalApp {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("D001", "Outpatient", 8);
        Nurse nurse = new Nurse("N001", "Maternity", 8);
        Pharmacist pharmacist = new Pharmacist("P001", "Pharmacy", 8);
        LaboratoryTechnician laboratoryTechnician = new
                LaboratoryTechnician("L001", "Laboratory", 8);

        // Display information and duties for each staff member
        System.out.println("===== MUKONO HOSPITAL STAFF =====");
        System.out.println();

        verifyStaff(doctor);
        verifyStaff(nurse);
        verifyStaff(pharmacist);
        verifyStaff(laboratoryTechnician);

        System.out.println();


        doctor.displayStaffInfo();
        doctor.performDuties();

        System.out.println();

        nurse.displayStaffInfo();
        nurse.performDuties();

        System.out.println();

        pharmacist.displayStaffInfo();
        pharmacist.performDuties();

        System.out.println();

        laboratoryTechnician.displayStaffInfo();
        laboratoryTechnician.performDuties();



    }
    // Confirms that a staff member has valid common information
    public static void verifyStaff(MedicalStaff staff) {
        if (staff.employeeId != null && !staff.employeeId.isEmpty()) {
            System.out.println("Staff verification successful: "
            + staff.employeeId);
        } else {
            System.out.println("Staff verification failed.");

        }
    }
}
