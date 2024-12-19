/*
Name: Alisha Wheeler
Period: 2
Teacher: Mrs. Bergen-Hill

Spinner Class
*/

import java.io.*;
import java.util.*;

public class Spinner {

    static String message = "";

    //spinner function
    static int spin(){

        //int randomizer: 1-7
        int spinny = (int) ((Math.random() * 7 ) + 1);

        if (spinny == 1){
            message = "Take 1 cherry from the tree";
            return spinny;
        }
        else if (spinny == 2){
            message = "Take 2 cherries from the tree";
            return spinny;
        }
        else if (spinny == 3){
            message = "Take 3 cherries from the tree";
            return spinny;
        }
        else if (spinny == 4){
            message = "Take 4 cherries from the tree";
            return spinny;
        }
        else if (spinny == 5){
            message = "Oh no, a dog has come and eaten some of your cherries. Put 3 cherries back on your tree";
            return -3;
        }
        else if (spinny == 6){
            message = "Oh no, a bird has come and eaten some of your cherries. Put 2 cherries back on your tree";
            return -2;
        }
        else if (spinny == 7){
            message = "Oh no, your basket spilled! Put all of your cherries back on your tree";
            return -10;
        }
        else{
            return 0;
        }
    }

    //returns the message
    static String getMessage(){
        return message;
    }
}
