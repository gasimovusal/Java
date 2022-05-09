package day19_pass_byvalue_datetime_classes.reviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {

    static int x = 1000; // its static, it belongs to class

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> products = new ArrayList<>(); // [     ]

        int i=0;
        do {

            System.out.println("Enter " + (i+1) +  ". product name"); // Enter 1. product name ; Enter 2. product name ; Enter 3. product name ;
            products.add(scan.nextLine()); //           user enters              Toy first,          Lego second,            Shoes third
            i++; //i=0 ; i=1 ; i=2

        }while(i<3);
        System.out.println(products);   // [Toy,Lego,Shoes]

        List<String> productId = new ArrayList<>(); // [        ]
        for(String w : products) {

            productId.add("" + w.charAt(0) + w.charAt(1) + x); // To1000 ; Le1001 ; Sh1001
            x++; // 1000 ; 1001 ; 1002
        }
        System.out.println(productId); // [To1000, Le1001, Sh1001]

        scan.close();
    }

    //If user enters Toy, Lego, and Shoes as products, what will the output be?
    // output will be : [Toy, Lego, Shoes]
    //                  [To1000, Le1001, Sh1002]
}
