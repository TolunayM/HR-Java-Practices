import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    int k = N % 2;
    if(k == 1){
        System.out.println("Weird");
    }
    if(k == 0 && 2<=N && N<=5){
        System.out.println("Not Weird");
    }
    if(k == 0 && 6<=N && N<=20){
        System.out.println("Weird");
    }
    if(k == 0 && 20<N){
        System.out.println("Not Weird");
    }
        scanner.close();
    }
}
