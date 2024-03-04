package hospitalManagement;


public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital();

        // Add doctors to the hospital
        Doctor doctor1 = new Doctor("D001", "John Doe", "Cardiology");
        Doctor doctor2 = new Doctor("D002", "Jane Smith", "Orthopedics");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Add patients to the hospital
        Patient patient1 = new Patient("P001", "Alice Johnson", 30);
        Patient patient2 = new Patient("P002", "Bob Williams", 45);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Schedule appointments
        hospital.scheduleAppointment(patient1, doctor1, "2024-02-01 10:00 AM");
        hospital.scheduleAppointment(patient2, doctor2, "2024-02-02 02:30 PM");

        // View scheduled appointments
        hospital.viewAppointments();

        // View patients assigned to a doctor
        hospital.viewAssignedPatients(doctor1);
        hospital.viewAssignedPatients(doctor2);
    }
}

