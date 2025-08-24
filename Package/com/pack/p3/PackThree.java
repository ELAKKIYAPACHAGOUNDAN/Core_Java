package Package.com.pack.p3;

import java.util.Scanner;
import java.util.StringTokenizer;

import Package.com.pack.p1.PackOne;
import Package.com.pack.p2.PackTwo;

//instead of writing PackOne & PackTwo -> use "*" (import Package.com.pack.*);

class Three{
    void three(){
        System.out.println("Output from class Three");
    }
}
public class PackThree {
    public static void main(String[] args) {
        System.out.println("Output from PackThree");

        Scanner sc = new Scanner(System.in);    //import from java.util
        
        StringTokenizer s = new StringTokenizer("a"," "); //import from java.util
        System.out.println(s.nextToken());
        
        Three t = new Three();
        t.three();
        
        PackTwo pt = new PackTwo();
        pt.two();
        
        PackOne po = new PackOne();
        po.one();
        
        sc.close(); //mandatory to close the scanner object

    }
}

/*  JRE System:

java.util
==================
Scanner
String Tockenizer
ArrayList
HashMap
HashSet
Collections
etc...

java.lang
(all are inbuilt, we no need to import because it is implicitly imported by default)
==================
String
StringBuffer
StringBuilder
Exception


java.io
==================
File InputStream
File OutputStream
File Reader
File Writer
BufferedReader
BufferedWriter
PrintWriter
etc...

*/

