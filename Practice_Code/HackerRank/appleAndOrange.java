package HackerRank;
/*
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. 
 * Using the information given below, determine the number of apples and oranges that land on Sam's house.
 * The red region denotes the house, where s is the start point, and t is the endpoint. 
 * The apple tree is to the left of the house, and the orange tree is to its right.
 * Assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.
 * When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. 
 * *A negative value of d means the fruit fell d units to the tree's left, 
 * and a positive value of d means it falls d units to the tree's right. *
 */

 /*
  * Complete the countApplesAndOranges function in the editor below. 
  It should print the number of apples and oranges that land on Sam's house, each on a separate line.
  countApplesAndOranges has the following parameter(s):
s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.
  */
import java.util.*;

public class appleAndOrange {
    public static void main(String[] args) {
        int startOfHouse=7,endOfHouse=10,appleTreeLoc=4,orangeTreeLoc=12;
        ArrayList<Integer> apples=new ArrayList<>();
        ArrayList<Integer> oranges=new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);

        countApplesAndOranges(startOfHouse,endOfHouse,appleTreeLoc,orangeTreeLoc,apples,oranges);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int appleCount=0,orangecount=0;
        ArrayList<Integer> appleAt=new ArrayList<>();
        ArrayList<Integer> orangeAt=new ArrayList<>();
        for(int i:apples){
            appleAt.add(a+i);
        }
        for(int i:oranges){
            orangeAt.add(b+i);
        }
        for(int i:appleAt){
            if( i>=s && i<=t)
                appleCount++;
        }
        for(int i:orangeAt){
            if( i>=s && i<=t)
                orangecount++;
        }
        System.out.println("The apples dropped at Sam's house is "+appleCount);
        System.out.println("The oranges dropped at Sam's house is "+orangecount);
    }
}
