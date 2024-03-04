package hospitalManagement;

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String appointmentTime;

    public Appointment(Patient patient, Doctor doctor, String appointmentTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }
}
