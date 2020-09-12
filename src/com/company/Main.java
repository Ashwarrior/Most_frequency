
package com.company;




//* uncomment this if you want to read input.
//imports for BufferedReader
import java.io.*;
import java.lang.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Main {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());



        // Scanner scanner = new Scanner(System.in);
        // int t=scanner.nextInt();
        String[] s=br.readLine().split(" ");

        int[] arr= new int[t];
        for(int i=0; i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<t;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int res=0;
        int high=0;
        for(int i=0;i<t;i++){
            int local=map.get(arr[i]);
            if(high<local){
                high=local;
                res=arr[i];
            }
        }
        System.out.println(res);

    }
}
