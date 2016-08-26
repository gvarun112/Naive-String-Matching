package naivestring;

import java.io.*;
import java.util.Scanner;

public class NaiveString {

    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first string:");
        char[] Text=sc.next().toCharArray();        
        System.out.println("Please enter the Pattern string:");
        char[] Pattern=sc.next().toCharArray();
        naive(Text,Pattern);
    }

    private static void naive(char[] Text, char[] Pattern) {
        int n = Text.length;
        int m = Pattern.length;
        for (int i=0 ; i<=n-m ; i++) {
            int j;
            for (j=0 ; j<m ; j++) {
                if (Text[i+j] != Pattern[j])
                    break;
            }
            if ( j == m )
                System.out.println("Character found at:"+i);
        }
    }
}
