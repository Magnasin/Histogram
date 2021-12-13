/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abeld
 */
public class Histogram3 {

/**
* @param args the command line arguments
*/
      
public static void main(String[] args) throws IOException {


File file3 = new File("test3.txt");//File location is past as the path to the file as a parameter
Scanner scanFile = new Scanner(file3); //Creates a scanner for the file

ArrayList<Integer> integerValues = new ArrayList<Integer>(); //Creates an array list to store integers
  
int otherChar = 0;
  
int counting = 0;
  
try{
    
while( scanFile.hasNext() ){ //Reads input file
         
String reads = scanFile.nextLine();      
boolean highlight = true;
      
for(int i=0; i<reads.length(); i++) {//Notes if the inputed value is Integer or not
          
if(!Character.isDigit(reads.charAt(i))) {
              
otherChar ++;             
highlight = false;              
break;
              
}
       
}
      
if(highlight) {//Checks if it is then add to list
          
int num = Integer.parseInt(reads);          
integerValues.add(num);
                  
}     
}
}
   
finally {
scanFile.close();//Closes scanner in the file to prevent data loss
}
  
int variable[] = new int[10]; // Array with 11 spaces
  
for(int i=0; i<integerValues.size(); i++) { //For loop to check the input file 
      
if(integerValues.get(i) >=1 && integerValues.get(i) <=10 ) {//Checks the input and adds it to the array   
          
variable[0]++;
counting++;
          
}
      
else if(integerValues.get(i) >=11 && integerValues.get(i) <=20 ) {  //Checks range of all integers
          
variable[1]++;
counting++;
          
}
      
else if(integerValues.get(i) >=21 && integerValues.get(i) <=30 ) {  //Checks range of all integers
          
variable[2]++;
counting++;
          
}
      
else if(integerValues.get(i) >=31 && integerValues.get(i) <=40 ) {  //Checks range of all integers
          
variable[3]++;
counting++;
          
}
      
else if(integerValues.get(i) >=41 && integerValues.get(i) <=50 ) {  //Checks range of all integers
          
variable[4]++;
counting++;
          
}
      
else if(integerValues.get(i) >=51 && integerValues.get(i) <=60 ) {  //Checks range of all integers
          
variable[5]++;
counting++;

}
      
else if(integerValues.get(i) >=61 && integerValues.get(i) <=70 ) {  //Checks range of all integers
          
variable[6]++;
counting++;
          
}
      
else if(integerValues.get(i) >=71 && integerValues.get(i) <=80 ) {  //Checks range of all integers
          
variable[7]++;
counting++;
          
}
      
else if(integerValues.get(i) >=81 && integerValues.get(i) <=90 ) {  //Checks range of all integers
          
variable[8]++;
counting++;
          
}
      
else if(integerValues.get(i) >=91 && integerValues.get(i) <=100 ) {  //Checks range of all integers
          
variable[9]++;
counting++;
          
}
      
else {
  
otherChar++;  //Checks range of all other characters
  
}      
}
        
FileWriter writer3 = new FileWriter("result1-3.txt"); //Uses the FileWriter tool
    
writer3.write("Reading Integers from the file: C:\\Users\\abeld\\Desktop\\School Work\\COP 3337.1\\Assignment3\\test3" + "\n");//Prints file location in the output file
  
writer3.write("Numbers of Integers in Interval [1-100]: " + counting + "\n"); //Prints the interval
  
writer3.write("Other Characters: " + otherChar + "\n"); // Prints the other characters
  
writer3.write("Histogram"); // Prints Histogram
  
int minimum = 1;
int maximum = 10;
    
for(int i=0;i<variable.length;i++) {//For loop to print the histogram to the output file
      
writer3.write("\n" + minimum + "-" + maximum + " | ");
      
for(int j=0; j<variable[i];j++) {
          
writer3.write("*");
          
}
     
minimum = minimum+10;
maximum = maximum+10;
         
}
  
writer3.close();//Closes writer1 to prevent data loss
 
}
} 