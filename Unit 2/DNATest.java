/*
Name: Alisha Wheeler
Date: 10/2/24
Period: 2
*/
import java.util.*;
import java.io.*;

class DNATest
{

    public static void checkIllness (String patientDNA, String patientName){

        System.out.println ("Testing " + patientName + " . . . ");
        
        String picards = "ACGTTCGAGATCGA";
        String riker = "CGTAGATCATGACGA";
        String troi = "GTACCAGTACGATCAG";
        String laForge = "GATCGATGTGCAGACTAGCGAT";
        String worf = "ACTGGTCA";

        if (patientDNA.contains(picards)){
            System.out.println ("Picards Syndrome: true");
        }
        else{
            System.out.println ("Picards Syndrome: false");
        }

        if (patientDNA.contains(riker)){
            System.out.println ("Riker Syndrome: true");
        }
        else{
            System.out.println ("Riker Syndrome: false");
        }

        if (patientDNA.contains(troi)){
            System.out.println ("Troi Syndrome: true");
        }
        else{
            System.out.println ("Troi Syndrome: false");
        }

        if (patientDNA.substring(0,41).contains(laForge)){
            System.out.println ("laForge Syndrome: true");
        }
        else{
            System.out.println ("laForge Syndrome: false");
        }

        if (patientDNA.substring(patientDNA.length()-41, patientDNA.length()).contains(worf)){
            System.out.println ("Worf Syndrome: true\n");
        }
        else{
            System.out.println ("Worf Syndrome: false\n");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("DNA Test\n");
      
        String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
        String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
        String patient3 = "CACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTACGATCAGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATC";

        checkIllness(patient1, "Patient 1");
        checkIllness(patient2, "Patient 2");
        checkIllness(patient3, "Patient 3");
    }
}