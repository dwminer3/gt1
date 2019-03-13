public class SumSquare{
public static void main (String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);
System.out.println("Your program will generate an output of Sum of Squares of multiple of 3" + "\nfrom 3 to 33.");
 
int three = 3;
int sum = 0;

while(three <= 33) {
sum = sum + (three * three);
System.out.printf("Cumulation result: %-8d%4s%8d%8s%8d\n" , sum ,":" , three , "*" , three);
three = three + 3;
}
 
}
}
