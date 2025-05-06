//-----------------------------------------------------
// Written by:Neelendra Mishra
// ----------------------------------------------------


/*
                                                                    ===========================
                                                                        PROGRAM DESCRIPTION:
                                                                    ===========================

                         The Individual class is integral to clinic system management, handling entity records with attributes such as entityID, firstName, lastName, and chargePercent.
             It includes methods to access and update these attributes, along with constructors for initialization and a copy constructor for creating deep copies. Additional methods support object
                         comparison, string formatting, and utility tasks like string manipulation and object creation, enhancing the efficiency of record management within the clinic system.


                                                                    ===============================
                                                                       ALGORITHM OF THE PROGRAM:
                                                                    ===============================

    * Declare four private attributes: entityID, firstName, lastName, and chargePercent.

    * Define a copy constructor Individual(Individual i) that accepts an Individual object as a parameter and initializes a new object with identical attribute values

    * Implement accessor and mutator methods for each attribute:-

            getEntityID(),      setEntityID(String)
            getFirstName(),     setFirstName(String)
            getLastName(),      setLastName(String)
            getChargePercent(), setChargePercent(double).

    * Creating a default constructor Individual() that initializes all attributes with default values (empty string for names and 0.0 for charge percent).

    * Define a custom constructor Individual(String entityID, String firstName, String lastName) that initializes the attributes with the provided values and sets the charge percent to the default value of 0.0.

    * Enhance the toString() method to generate a formatted string representation of the Individual object, including all attribute values.

    * Creating a cloneData() method that constructs a new Individual object with identical attribute values to the current object and returns it.

 */


//                                                      ----START OF THE CODE----
public class Individual {
    // Private attributes
    private String entityID;  // Stores the unique identifier for the individual
    private String firstName; // Stores the first name of the individual
    private String lastName;  // Stores the last name of the individual
    private double chargePercent; // Stores the charge percentage for the individual

    // Copy constructor
    public Individual(Individual i){
        this.entityID = i.getEntityID();  // Copies the entity ID from the given Individual object
        this.chargePercent = i.getChargePercent();  // Copies the charge percentage from the given Individual object
        this.firstName = i.getFirstName();  // Copies the first name from the given Individual object
        this.lastName = i.getLastName();    // Copies the last name from the given Individual object
    }

    // Getters and setters
    public String getEntityID() {  // Getter for entityID attribute
        return entityID;
    }

    public void setEntityID(String entityID) {  // Setter for entityID attribute
        this.entityID = entityID;
    }

    public String getFirstName() {  // Getter for firstName attribute
        return firstName;
    }

    public void setFirstName(String firstName) {  // Setter for firstName attribute
        this.firstName = firstName;
    }

    public String getLastName() {  // Getter for lastName attribute
        return lastName;
    }

    public void setLastName(String lastName) {  // Setter for lastName attribute
        this.lastName = lastName;
    }

    public double getChargePercent() {  // Getter for chargePercent attribute
        return chargePercent;
    }

    public void setChargePercent(double chargePercent) {  // Setter for chargePercent attribute
        this.chargePercent = chargePercent;
    }

    // Default constructor
    public Individual() {
        // Initialize attributes with default values
        this.entityID = "";  // Default value for entityID attribute
        this.firstName = ""; // Default value for firstName attribute
        this.lastName = "";  // Default value for lastName attribute
        this.chargePercent = 0.0;  // Default value for chargePercent attribute
    }

    // Custom constructor
    public Individual(String entityID, String firstName, String lastName) {
        // Initialize attributes with provided values
        this.entityID = entityID;    // Initialize entityID attribute with provided value
        this.firstName = firstName;  // Initialize firstName attribute with provided value
        this.lastName = lastName;    // Initialize lastName attribute with provided value
        this.chargePercent = 0.0;    // Default value for chargePercent attribute
    }


    // Method for cloning data of an individual
    public Individual cloneData() {
        Individual newIndividual = new Individual(this.getEntityID(), this.getFirstName(), this.getLastName());
        return newIndividual;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Individual{" +
                "entityID='" + entityID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", chargePercent=" + chargePercent +
                '}';
    }
}


//                                                              ----END OF THE CODE----