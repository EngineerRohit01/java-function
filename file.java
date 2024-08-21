import java.util.Scanner;

public class file{
public static void main(String[] args){
int a = number();
int b = number();
int c  =  a+b;
System.out.print(c);
}

public static int number(){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number");
int no = input.nextInt();
return no;
}
}