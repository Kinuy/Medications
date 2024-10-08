package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String,Medication> medication;
//    static int numberOfMedications;
    public Pharmacy() {
        this.medication = new HashMap<>();
//        numberOfMedications = 0;
    }

    public int getCount(){
        return this.medication.size();
//        return numberOfMedications;
    }

    public void save(String nameOfMedication,Medication medication){
        this.medication.put(nameOfMedication,medication);
    }

    public Medication find(String nameOfMedication){
        if(medication.containsKey(nameOfMedication)){
            return medication.get(nameOfMedication);
        }
        return null;
    }

    public void delete(String nameOfMedication){
        this.medication.remove(nameOfMedication);
    }

    public void printMedications(){
//        System.out.println(this.medication.values());

        for(Medication med : this.medication.values()){
            System.out.println(med.getName() + " " + med.getAvailability() + " " + med.getPrice());
        }
    }


}
