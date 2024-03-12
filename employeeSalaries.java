
/**
 * Write a description of class employeeSalary here.
 *
 * name : zainab
 * date : 12 march 2024
 */
//import the respective packages
import java.io.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
//Driver class
public class employeeSalaries
{
       public static void main(String[]args)
      {
//Instantiate the object of DecimalFormat
DecimalFormat dF = new DecimalFormat("0.00");
//try block
try
{
//Set the input/output file
//input file
BufferedReader inputFile = new BufferedReader(
new FileReader("employeeSalaries.txt"));
//2 output files
PrintWriter highAchievers = new PrintWriter(
new FileWriter("employeeSalary.txt"));
PrintWriter lowAchievers = new PrintWriter(
new FileWriter("annualSalaries.txt"));
//Declare the variables
String inputData = null;
String employeeName;
double employeeSalary; 
//Write the employee name and total salary 
highSalaries.println("List of employee who achieved the salary");
highSalaries.println("\nEmployeee Name\t\tTotal Salary");
highSalaries.println("--------------------------------------");
//Write the employee name and total salary for Low salary
lowSalaries.println("List of employee who achieved the annual salary");
lowAchievers.println("\nEmployee Name\t\tTotal Salary");
lowAchievers.println("--------------------------------------");
while((inputData = inputFile.readLine()) != null)
{
//Instantiate the object reference of the StringTokenizer class
//to read the string line (input data) & to set the delimeter
StringTokenizer sT = new StringTokenizer(inputData,";");
//to pass the string line &delimeter
//Break into tokens and assign to the appropriate variables
employeeName = sT.nextToken();
employeeSalary = Double.parseDouble(sT.nextToken());
//to calculate the annual salary
annual salary = salary + salary * 5%
 //To determine the grade and write the data to the appropriate output file  if (grade == 'A') 
 employeeSalary.println(studName + "\t\t\t" + totalScores); 
 annualSalary.println(studName + "\t\t\t" +   totalScores); 
}//end of while 

//close all the input/output files
//Close the input/output file
inputFile.close();
employeeSalary.close();
annualSalary.close();
}//end of try block
catch(FileNotFoundException e){ {
System.out.println(e.getMessage());}
trycatch(IOExceptione); {
System.out.println(e.getMessage());}
trycatch(Exceptione) ;{
System.out.println("Problem :" +e.getMessage());}
}//end of the main method
}//end of thr driver class





