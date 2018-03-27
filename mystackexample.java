/*
 * Brandon Howard
 * March 20,2018
 * CSC 234
 * This program show stack 
 */
import java.util.Stack; //import the stack class
public class mystackexample {
public static void main(String[]args)
{
Stack names = new Stack<String>();// create a new stack called names
names.push("Sam");// add the first name to the top of the stack
names.push("Jim");
names.push("Jill");
names.push("Mary");

System.out.println(names);
System.out.println(names);

names.pop(); 
}
}