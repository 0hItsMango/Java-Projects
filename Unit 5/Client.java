/*
Name: Alisha Wheeler
Period: 2
Teacher: Mrs. Bergen-Hill

Player Class
*/

import java.io.*;
import java.util.*;

public class Client{

    //Instantiates two players
    public static Player p1 = new Player("Tweedle Dee");
    public static Player p2 = new Player("Tweedle Dum");

    public static void handleCherries(int TreeCherries, int BucketCherries){
        
    }
    public static void handleSpin(Player player){
        int playerTreeCherries = player.getTree();
        int playerBucketCherries = player.getBucket();

        if (Spinner.spin() == 1){
            playerBucketCherries+=1;
            playerTreeCherries-=1;

        }else if (Spinner.spin() == 2){
            playerBucketCherries+=2;
            playerTreeCherries-=2;
            
        }else if (Spinner.spin() == 3){
            playerBucketCherries+=3;
            playerTreeCherries-=3;
            
        }else if (Spinner.spin() == 4){
            playerBucketCherries+=4;
            playerTreeCherries-=4;
        }
        else if (Spinner.spin() == -3){
            playerBucketCherries-=3;
            playerTreeCherries+=3;
        }
        else if (Spinner.spin() == -2){
            playerBucketCherries-=2;
            playerTreeCherries+=2;
        }
        else if (Spinner.spin() == -10){
            playerBucketCherries=0;
            playerTreeCherries=10;

        }
        System.out.println(player.getName() + " spins: " + Spinner.getMessage());
        
        if(playerBucketCherries<0){
           playerBucketCherries=0;
        }else if(playerBucketCherries>10)
        {
            playerBucketCherries=10;
        }
        
        if(playerTreeCherries<0){
           playerTreeCherries=0;
        }else if(playerTreeCherries>10)
        {
            playerTreeCherries=10;
        }
        
        player.setBucketCherries(playerBucketCherries);
        player.setTreeCherries(playerTreeCherries);
        
        
        System.out.println("Tree Cherries: " + playerTreeCherries);
        System.out.println("Bucket Cherries: " + playerBucketCherries + "\n\n");
    }
    //players take turn spinning
    public static void run(){
        System.out.println("Player 1 name: " + p1.getName());
        System.out.println("Player 2 name: " + p2.getName());
        
        while(true){
            handleSpin(p1);
            if(p1.hasWon()){
                System.out.println("\n "+p1.getName()+" wins!");
                break;
            }
            
            handleSpin(p2);
            
            if (p2.hasWon()){
                System.out.println("\n "+p2.getName()+" wins!");
                break;
            }
        }
    }
    public static void main(String[]arg){
        Client.run();
    }
}