import java.util.Scanner;
public class primeRange {
public static void main(String [] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the minimum number: ");
int min = scanner.nextInt();
System.out.print("Enter the maximum number: ");
int max = scanner.nextInt();
int count = 0;
for(int i = 1; i<=max; i++) {
    count = 0;
    for(int j = 1; j<=i; j++) {
     if(i%j == 0) 
     count++;
    }
    if(count == 2) {
        System.out.println(i +"");
    }
}

}

}