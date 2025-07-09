# programming-practice
This is only purpose for java learning 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the minimum Number: ");
int min = scanner.nextInt();
System.out.println("Enter the maximum Number: ");
int max = scanner.nextInt();
for(int i = min; i<=max; i++) {
int count = 0;
for(int j = 1; j<=i; j++) {
if(i%j == 0)
count++;
}
if(count == 2) {
System.out.println(i);
}
}
}
}

