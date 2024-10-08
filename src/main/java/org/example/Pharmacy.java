package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String,Medication> medication;
    public Pharmacy() {
        this.medication = new HashMap<>();
    }

    public int getCount(){
        return this.medication.size();
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
        for(Medication med : this.medication.values()){
            System.out.println(med.getName() + " " + med.getAvailability() + " " + med.getPrice());
        }
    }


}
