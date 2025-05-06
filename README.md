# Simple Mobile Dental Clinic Management System (SMDCMS)

## 📌 Project Overview

This Java-based application simulates a mobile dental clinic management system designed to assist clinic staff in managing dental offices across Quebec.
It enables the addition and management of dentists, dental assistants, and patients, along with tracking charges and generating clinic statistics.

---

## 📁 Project Structure

- `DentalClinicDriver.java` — The main driver class that presents a menu-based interface for user interaction and controls the application's flow.
- `Clinic.java` — A container class representing a dental clinic, encapsulating information such as name, code, term, and lists of staff and patients.
- `Individual.java` — A container class used to represent a person (dentist, assistant, or patient) with ID, name, and charge details.

---

## 🔧 Features (Menu Options)

| Code | Description                                     |
|------|-------------------------------------------------|
| 1001 | Define a new Office/Clinic                      |
| 1002 | Add a Dentist to a Clinic                       |
| 1003 | Add Dental Assistants (Hygienists/Clerks)       |
| 1004 | Register Patient(s) to Clinic                   |
| 1005 | Deregister Assistants and/or Patients           |
| 1006 | Enter/Update Patient Charges                    |
| 1007 | Display Patient Statistics                      |
| 1008 | Display Office/Clinic Statistics                |
| 1009 | Display a Chargesheet                           |
| 1010 | Exit the Program                                |

---

## 🧱 Object-Oriented Concepts Used

- **Classes and Objects**
- **Encapsulation** via private attributes and public getters/setters
- **Constructors** (default, custom, and copy)
- **Method Overriding and Overloading**
- **Array of Objects** and array manipulation methods
- **Static Helper Methods** for string formatting

---

## 📊 Sample Outputs

The file `MySolutionOutputs.pdf` includes several sample runs demonstrating functionality for:
- Adding and displaying clinic data
- Managing multiple individuals
- Calculating and updating charges
- Producing statistics and chargesheets

---

## 🛠 Technologies

- Language: Java
- IDE: IntelliJ IDEA / Eclipse / VS Code
