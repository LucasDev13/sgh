package br.com.recepcaoExterna.util;

public class CreatedMedicalRecord {
    private static int medicalRecord = 1;

    public CreatedMedicalRecord(){
    }

    public static int buildsMedicalRecord(){
        int lastValue;
        lastValue = medicalRecord++;
        return lastValue;
    }

}
