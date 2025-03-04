//Unit 7 Lab 1
//Airline Ticket Manager
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

public class ticketManager{
    public static ArrayList<modelTicket> ticketList = new ArrayList<modelTicket>();
    
    public static String rowMaker(int x){
        if (x==1){
            return "A";
        }
        else if (x==2){
            return "B";
        }
        else if (x==3){
            return "C";
        }
        else if (x==4){
            return "D";
        }
        else if (x==5){
            return "E";
        }
        else if (x==6){
            return "F";
        }
        else{
            return "ERROR";
        }
    }

    public static void randomizer(){
        for(int i=0; i<15; i++){
            int name = i+1;
            int rowNum = (int) (Math.random()*6)+1; 
            String row = rowMaker(rowNum);
            int seat = (int) (Math.random()*8)+1;
            int group = (int) (Math.random()*5)+1;

            modelTicket newTicket = new modelTicket(name, row, seat, group);
            ticketList.add(newTicket);
        }
    }

    public static void print(){
        for(int i=0; i<5; i++){
            System.out.println("Boarding Group " + (i+1) + ":");
            for(int j=0; j<ticketList.size(); j++){
                if(ticketList.get(j).group == i+1){
                    System.out.print("Passenger #" + ticketList.get(j).name + ": ");
                    System.out.print("Row " + ticketList.get(j).row + ", ");
                    System.out.print("seat " + ticketList.get(j).seat + ", ");
                    System.out.println("Boarding Group " + ticketList.get(j).group);
                }
            }
            System.out.println("\n");
        }
        System.out.println("Passengers that may board together:");
        for(int i=0; i<5; i++){
            for(int j=0; j<6; j++){
                ArrayList<modelTicket> newTicketList = new ArrayList<modelTicket>();
                for(int k=0; k<ticketList.size(); k++){
                    if((ticketList.get(k).group == i+1) && (ticketList.get(k).row == rowMaker(j+1))){
                        newTicketList.add(ticketList.get(k));
                    }
                }

                if (newTicketList.size()>=2){
                    for(int r=0; r<newTicketList.size(); r++){
                        System.out.print("Passenger #" + newTicketList.get(r).name + ": ");
                        System.out.print("Row " + newTicketList.get(r).row + ", ");
                        System.out.print("seat " + newTicketList.get(r).seat + ", ");
                        System.out.println("Boarding Group " + newTicketList.get(r).group);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        randomizer();
        print();
    }
}
