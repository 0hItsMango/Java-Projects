/*
Name: Alisha Wheeler
Period: 2
Teacher: Mrs. Bergen-Hill

Player Class
*/

import java.io.*;
import java.util.*;

public class Player{

    //Instance variables
    String name = "";
    int treeCherries = 10;
    int bucketCherries = 0;

    Player(String newName){
        name = newName;
    }

    //setter
    public void setName(String playerName){
        name = playerName;
    }

    //3 getters / accessor methods
    public String getName(){
        return name;
    }
    public int getTree(){
        return treeCherries;
    }
    public int getBucket(){
        return bucketCherries;
    }

    //boolean method to check if they won or not (10 cherries in bucket)
    public boolean hasWon(){
        if (bucketCherries == 10){
            return true;
        }
        else{
            return false;
        }
    }

    //mutator method 
    public void setBucketCherries(int newBucketCherries){
        bucketCherries = newBucketCherries;
    }
    public void setTreeCherries(int newTreeCherries){
        treeCherries = newTreeCherries;
    }
}
