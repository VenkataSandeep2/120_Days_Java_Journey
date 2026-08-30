package com.arrayList;

import java.util.ArrayList;

public class Hospital_Patient 
{

    public static void main(String[] args)
    {
        ArrayList<Patient> patients =
                new ArrayList<>();

        patients.add(new Patient(101, "Sai"));
        patients.add(new Patient(102, "Ravi"));
        patients.add(new Patient(103, "Kiran"));

        System.out.println("Patients:");

        for(Patient patient : patients)
        {
            System.out.println(patient);
        }

        System.out.println(
                "Total Patients: " + patients.size());

        Patient firstPatient = patients.get(0);

        System.out.println(
                "First Patient: " + firstPatient);

        patients.remove(1);

        System.out.println(
                "After removing patient:");

        for(Patient patient : patients)
        {
            System.out.println(patient);
        }
    }

}
