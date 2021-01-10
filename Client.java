import java.rmi.*;
import java.io.DataInputStream;

public class Client {

public static void main(String[] args) {

try {

double res;
double num1 =0;
double num2=0;

Addition reference = (Addition)Naming.lookup("rmi://Localhost:1099/Addition");
DataInputStream in = new DataInputStream(System.in);

System.out.print("Please Enter Number 1: ");
num1 = Double.parseDouble(in.readLine());

System.out.print("Please Enter Number 2: ");
num2 = Double.parseDouble(in.readLine());

res= reference.addition(num1,num2);

System.out.println("The Addition of  '"+num1+"' and '"+num2+ "'  equals to : " + res); }

catch(Exception e) { System.err.println("Erreur: " + e.getMessage()); }

} }