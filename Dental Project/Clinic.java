//-----------------------------------------------------
// Written by:Neelendra Mishra
// ----------------------------------------------------


/*
                                                            ============================
                                                                PROGRAM DESCRIPTION:
                                                            ============================

                    This Java program features a Clinic class representing a dental clinic. It stores essential details like name, code, and term,
           and manages dentist, dental assistant, and patient information. Accessor (getter) and mutator (setter) methods enable easy retrieval and modification of clinic information.
       Methods like appendToPatientArr and appendToDentalAsstArr add new patients and dental assistants, while removeFromPatientArr and removeFromDentalAsstArr remove existing individuals.


                                                            ===============================
                                                               ALGORITHM OF THE PROGRAM:
                                                            ===============================


    * Create a class named Clinic to encapsulate clinic-related operations.

    * Set private variables to store clinic details like clinicName, clinicCode, and clinicTerm. Include variables for a dentist, an array of dental assistants (dentalAsst), and an array of patients.

    * Define a default constructor to initialize arrays with a size of 0 to prevent null pointer exceptions. Implement a parameterized constructor to set initial values for clinic details and staff/patient arrays.

    * Create getter and setter methods for all private variables to enable access and modification of their values.

    * Create methods like addPatient and addDentalAssistant to add new patients and dental assistants. Similarly, implement methods like removePatient and removeDentalAssistant to delete individuals.

    * Develop a method named updatePatientCharges to change the charge percentage for a specific patient.

    * Implement methods such as displayClinicStatistics and displayPatientsStatistics to present pertinent statistics, including the number of patients, number of dental assistants, and detailed patient information.

    * Create a method named displayChargeSheet to showcase a summary of patient charges.

    * Develop utility methods like copyArray to facilitate efficient array operations.
 */



//                                                                      ----START OF THE CODE----
public class Clinic {
    // Declaring private variables to hold-on clinic information
    private String clinicName; // Clinic name
    private String clinicCode; // Clinic code
    private String clinicTerm; // Clinic term
    private Individual dentist; // Dentist object
    private Individual[] dentalAsst; // Array of dental assistants
    private Individual[] patient; // Array of patients

    // creating Getters and setters for clinic information
    public String getClinicName() { // Getter for clinic name
        return clinicName;
    }

    public void setClinicName(String clinicName) { // Setter for clinic name
        this.clinicName = clinicName;
    }

    public String getClinicCode() { // Getter for clinic code
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) { // Setter for clinic code
        this.clinicCode = clinicCode;
    }

    public String getClinicTerm() { // Getter for clinic term
        return clinicTerm;
    }

    public void setClinicTerm(String clinicTerm) { // Setter for clinic term
        this.clinicTerm = clinicTerm;
    }

    public Individual getDentist() { // Getter for dentist
        return dentist;
    }

    public void setDentist(Individual dentist) { // Setter for dentist
        this.dentist = dentist;
    }

    public Individual[] getDentalAsst() { // Getter for dental assistants
        return dentalAsst;
    }

    public void setDentalAsst(Individual[] dentalAsst) { // Setter for dental assistants
        this.dentalAsst = dentalAsst;
    }

    public Individual[] getPatient() { // Getter for patients
        return patient;
    }

    public void setPatient(Individual[] patient) { // Setter for patients
        this.patient = patient;
    }

    // Default constructor
    public Clinic() {
        // Initializing arrays with size 0 to avoid NullPointerException
        this.dentalAsst = new Individual[0]; // Initialize dental assistants array
        this.patient = new Individual[0]; // Initialize patients array
    }

    // creating a Custom constructor
    public Clinic(String clinicName, String clinicCode, String clinicTerm, Individual dentist,
                  Individual[] dentalAsst, Individual[] patient) {
        // Initializing clinic with provided details
        this.clinicName = clinicName;
        this.clinicCode = clinicCode;
        this.clinicTerm = clinicTerm;
        this.dentist = dentist;
        this.dentalAsst = dentalAsst;
        this.patient = patient;
    }

    // Overriding toString method to provide string representation of clinic object
    @Override
    public String toString() {
        // Create string representation of dental assistants array
        StringBuilder dentalAsstString = new StringBuilder("[");
        for (int i = 0; i < dentalAsst.length; i++) {
            dentalAsstString.append(dentalAsst[i]);
            if (i < dentalAsst.length - 1) {
                dentalAsstString.append(", ");
            }
        }
        dentalAsstString.append("]");

        // Creating string representation of patients array
        StringBuilder patientString = new StringBuilder("[");
        for (int i = 0; i < patient.length; i++) {
            patientString.append(patient[i]);
            if (i < patient.length - 1) {
                patientString.append(", ");
            }
        }
        patientString.append("]");

        // Returning string representation of clinic object
        return "Clinic{" +
                "clinicName='" + clinicName + '\'' +
                ", clinicCode='" + clinicCode + '\'' +
                ", clinicTerm='" + clinicTerm + '\'' +
                ", dentist=" + dentist +
                ", dentalAsst=" + dentalAsstString +
                ", patient=" + patientString +
                '}';
    }

    // Method to add new individuals to the patient array.
    public void appendToPatientArr(Individual[] individuals) {
        int currentLength = patient.length;
        int newLength = currentLength + individuals.length;
        patient = copyArray(patient, newLength);
        for (int i = 0; i < individuals.length; i++) {
            patient[currentLength + i] = individuals[i];
        }
    }

    // Method to remove individuals from the patient array
    public void removeFromPatientArr(String entityID) {
        Individual[] filteredPatients = new Individual[patient.length];
        int index = 0;
        for (Individual individual : patient) {
            if (!individual.getEntityID().equals(entityID)) {
                filteredPatients[index++] = individual;
            }
        }
        patient = copyArray(filteredPatients, index);
    }

    // Method for update patient charges
    public void updatePatientCharges(String entityID, double chargePercent) {
        for (Individual individual : patient) {
            if (individual.getEntityID().equals(entityID)) {
                individual.setChargePercent(chargePercent);
                break;
            }
        }
    }

    // Method for calculating and displaying patients' statistics
    public void displayPatientsStatistics() {
        System.out.println("Patients Statistics:");
        for (Individual individual : patient) {
            System.out.println("Patient: " + individual.getFirstName() + " " + individual.getLastName() +
                    ", Entity ID: " + individual.getEntityID() +
                    ", Charge Percent: " + individual.getChargePercent());
        }
    }

    // Method for calculate and display clinic statistics
    public void displayClinicStatistics() {
        int numPatients = patient.length;
        int numDentalAssistants = dentalAsst.length;

        System.out.println("Clinic Statistics:");
        System.out.println("Number of Patients: " + numPatients);
        System.out.println("Number of Dental Assistants: " + numDentalAssistants);
        System.out.println("Dentist: " + dentist.getFirstName() + " " + dentist.getLastName());
    }

    // Method for display chargesheet
    public void displayChargeSheet() {
        System.out.println("Charge Sheet:");
        for (Individual individual : patient) {
            System.out.println("Patient: " + individual.getFirstName() + " " + individual.getLastName() +
                    ", Entity ID: " + individual.getEntityID() +
                    ", Charge Percent: " + individual.getChargePercent());
        }
    }

    // Method for adding new individuals to the dental assistant array
    public void appendToDentalAsstArr(Individual[] individuals) {
        int currentLength = dentalAsst.length;
        int newLength = currentLength + individuals.length;
        dentalAsst = copyArray(dentalAsst, newLength);
        for (int i = 0; i < individuals.length; i++) {
            dentalAsst[currentLength + i] = individuals[i];
        }
    }

    // Utility method for copy array with new length
    private Individual[] copyArray(Individual[] array, int length) {
        Individual[] newArray = new Individual[length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    // Method for append new individuals to the dental assistant array
    public void appendToIndividualArr(Individual[] assistants) {
        // Copy existing dental assistants
        Individual[] actualList = getDentalAsst();
        Individual[] newList = new Individual[actualList.length + assistants.length];
        int index = 0;
        // Add existing assistants to the new list
        for(int i=0;i< actualList.length;i++) {
            newList[index] = new Individual(actualList[i]);
            index++;
        }
        // Add new assistants to the new list
        for(int i=0;i< assistants.length;i++) {
            newList[index] = new Individual(assistants[i]);
            index++;
        }
        // Set the updated list of dental assistants
        setDentalAsst(newList);
        // TODO Auto-generated method stub
        // Method to deregister Dental Assistant(s) and/or Patient(s)
    }

    // Method for removing a dental assistant from the array
    public void removeFromDentistArray(int index) {
        Individual[] newList = new Individual[dentalAsst.length - 1];
        int newIndex=0;
        for(int i=0;i<dentalAsst.length;i++) {
            if(index == i) {
                continue;
            }
            // Clone the individual data to avoid reference issues
            newList[newIndex] = dentalAsst[i].cloneData();
            newIndex++;
        }
        // Set the updated array of dental assistants
        setDentalAsst(newList);
    }

    // Method for removing a patient from the array
    public void removeFromPatientArray(int index) {
        Individual[] newList = new Individual[patient.length - 1];
        int newIndex=0;
        for(int i=0;i<patient.length;i++) {
            if(index == i) {
                continue;
            }
            // Cloning the individual data to avoid reference issues
            newList[newIndex] = patient[i].cloneData();
            newIndex++;
        }
        // Setting the updated array of patients
        setPatient(newList);
    }
}

//                                                              ----END OF THE CODE----