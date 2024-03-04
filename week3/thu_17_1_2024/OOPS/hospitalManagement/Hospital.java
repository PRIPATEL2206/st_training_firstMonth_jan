package hospitalManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;
    private Map<Doctor, List<Patient>> assignedPatients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.assignedPatients = new HashMap<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        assignedPatients.put(doctor, new ArrayList<>());
        System.out.println("Added Doctor: " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Added Patient: " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, String appointmentTime) {
        Appointment appointment = new Appointment(patient, doctor, appointmentTime);
        appointments.add(appointment);
        assignedPatients.get(doctor).add(patient);
        System.out.println("Scheduled appointment for " + patient.getName() + " with Dr. " +
                doctor.getName() + " at " + appointmentTime);
    }

    public void viewAppointments() {
        System.out.println("\nScheduled Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println("- Patient: " + appointment.getPatient().getName() +
                    ", Doctor: Dr. " + appointment.getDoctor().getName() +
                    ", Time: " + appointment.getAppointmentTime());
        }
    }

    public void viewAssignedPatients(Doctor doctor) {
        System.out.println("\nPatients Assigned to Dr. " + doctor.getName() + ":");
        List<Patient> assignedPatientsList = assignedPatients.get(doctor);
        for (Patient patient : assignedPatientsList) {
            System.out.println("- " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
        }
    }
}
