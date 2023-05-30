package com.company;

public class Main {

    public static void main(String[] args) {
//        Exercitii
//        System.out.println("ana are mere");
//        System.out.println("1");
//        System.out.println(1);
//        double = 5.5;
//        int = 2;

//        System.out.println("Aici e prima tema");
//        System.out.println("aici e a doua tema");
//        System.out.println();
//        System.out.print("Ana are mere" +"");
//        System.out.print("si pere" );
//        System.out.println();
//        System.out.println(1);
//        System.out.println(100);
//        System.out.println(100000000000000000l);
//        System.out.println(3.5);

//        String nume = "Ana";
//        System.out.println(nume);
//
//        String cde = ("cde");
//        String c = "abc";
//        String d = "cde";
//        System.out.println(c==d);
//
//        float numarulMeu = 55.555f;


//      int x = 5, y = 6, z = 50;
//        System.out.println(x + y + z);
//
//        double myDouble = 9.78d;
//        int myInt = (int) myDouble;
//        System.out.println(myInt);
//
//        String txt = "Hello";
//        System.out.println(txt.length());
//
//        String firstName = "John ";
//        String lastName = "Doe";
//        System.out.println(firstName + (lastName));

//        Return the index (position) of the first occurrence of "e" in the following string:
//        String txt = "Hello Everybody";
//        System.out.println(txt.indexOf("e"));

//        Exercitii https://www.w3resource.com/java-exercises/basic/index.php

//        System.out.println("Hello");
//        System.out.println("Ana Maria");
//
//        System.out.println(74+36);
//        System.out.println(50/3);
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55+9) % 9);
//        System.out.println(20 + -3*5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

//        int a = 25;
//        int b = 5;
//        System.out.println(a * b);

//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
//        System.out.println(125%24);
//        System.out.println(125 + 24);
//        System.out.println(125 - 24);
//        System.out.println(125 * 24);
//        System.out.println(125 / 24);
//
//        double x = 125;
//        double y = 24;
//        System.out.println(x / y);
//        -----------------------------------------

//           7. Write a Java program that takes a = 8 number as input and prints its multiplication table up to 10.
//        Trebuie facut un for loup


//      1. introcem automat numarul
//      int number = 8 ;
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(number + "*" + i + "=" + (number * i));}

//       2. introducem manual in consola nr
//        functia System.in
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        for (int i = 0; i <=10; i++) {
//            System.out.println(number + "*" + i + "=" + (number * i));}

//        3. Let's play'
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        int age;
//        double hight;
//
//        System.out.println("Please enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.println("Please enter your age");
//        age = scanner.nextInt();
//
//        System.out.println("Please enter your hight");
//        hight = scanner.nextDouble();
//
//        System.out.println("Hello " + name);
//        System.out.println ("Your age is" +" " + age);
//        System.out.println("Your hight is " + hight);

//      * cum fac sa accepte doar litere fara cifre la nume
//      * cum fac conditia sa nu accepte litere pt varsta si inaltime
//      * arata la varsta cifrele pana la primul space si la nume ia nextline dupa space

//        Scanner scanner = new Scanner(System.in);
//        int age;
//        System.out.println("Please enter your age ");
//        age = scanner.nextInt();

//        String name = scanner.nextLine();

//        System.out.println("Your age is " + age);
//        System.out.println("Your name is " + name);


//        * nu accepta litere la varsta - da eroare :)

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter your age ");
//        String age = scanner.nextLine();
//
//        int intAge = Integer.parseInt(age);
//         * parse functie -  percepe int, float ca string

//        System.out.println("Your age is " + intAge);

//        --------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name ");
//        String name = scanner.nextLine();
//
//        * metoda try and catch exceptions - The Try Catch in java statements allows you to
//          define a block of code to be tested for exceptions (errors) while it is being executed.
//
//        try{
//            Integer.parseInt(name);
//            System.out.println("Please enter your name ");
//        }catch(Exception e){
//            System.out.println("Thank you ");
//        }
//        scanner.close();
//-------------------------------------------------------
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age ");
//        String age = scanner.nextLine();
//        float floatAge = 0.0f;
//
//        try {
//            floatAge = Float.parseFloat(age);
//        }
//        catch (NumberFormatException nfe){
//            System.out.println("You dind't entered a float");
//        }
//        System.out.println("Your age is " + floatAge);
//
//-----------------------------------------------------
//         loop do/while pentru a aparea mesajul pana la introducerea info corect

      /*  Scanner scanner = new Scanner(System.in);

        int IntAge = 0;
        boolean validIntAge = false;

        do {
            System.out.println("Please enter your age ");
            String age = scanner.nextLine();
            try {
                IntAge = Integer.parseInt(age);
                validIntAge = true;
                System.out.println("Great");
            } catch (NumberFormatException nfe) {
                System.out.println("You didn't entered an age");
            }
        } while (validIntAge ==false);

        System.out.println("Your age is " + IntAge);}

//       * flag =A Flag is a boolean variable that signals when some condition exists in a program.
//       count = A counter variable in Java is a special type of variable which is used in the loop to count the repetitions
//       or to know about in which repetition we are in - learn more


//           8. Write a Java program to display the following pattern.
//        System.out.println("*      *");
//        System.out.println("    *           Hello");
//        System.out.println("#       #");
//        System.out.println(   "# # # # #  ");
//
//        System.out.println();
//
//        System.out.println("  J        a       v       v       a   ");
//        System.out.println("  J       a a       v     v       a a  ");
//        System.out.println("J J      aaaaa       V   V       aaaaa ");
//        System.out.println("JJ      a    a         V        a     a");

//        ------------------------------------------
//        9. Write a Java program to compute the specified expressions and print the output.
//                Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//        Expected Output
//        2.138888888888889

//        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
////        or
//          double x = 25.5 * 3.5;
//          double y = 3.5 * 3.5;
//          double z = 40.5 - 4.5;
//        System.out.println(((x - y) / z));
////        or
//        double a = 25.5;
//        double b = 3.5;
//        double c = 40.5;
//        double d = 4.5;
//        System.out.println(((a * b - b * b) / (c - d)));
//        ---------------------------------------

//        Write a Java program to compute a specified formula.
//        Specified Formula :
//        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//        Expected Output
//        2.9760461760461765

//       double exercise =  4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(exercise);
//        or
//        double n1 = 4.0;
//        double n2 = 1;
//        double n3 = (1.0/3);
//        double n4 = (1.0/5);
//        double n5 = (1.0/7);
//        double n6 = (1.0/9);
//        double n7 = (1.0/11);
//        System.out.println(n1 * (n2 - n3 + n4 - n5 + n6 - n7));
//        ----------------------------------------------------------

        /*11. Write a Java program to print the area and perimeter of a circle.
                Test Data:
        Radius = 7.5;
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        Perimeter of the circle:  P =2 *  π * r
        */
        /*double Radius = 7.5;
        double P = 2 * Math.PI * Radius;
        double A = Math.PI * Radius * Radius;
        System.out.println(P);
        System.out.println(A);*/

        /*  12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
         */

        /*int a = 2;
        int b = 5;
        int c = 10;
        int d = 7;
        int e = 9;
        int f = (a+b+c+d+e)/5;
        System.out.println(f);*/

//        or

        /*Scanner scanner = new Scanner (System.in);
        System.out.println(" Please enter your first grade: ");
        float gr1 = scanner.nextFloat();

        System.out.println(" Please enter the second grade: ");
        float gr2 = scanner.nextFloat();

        System.out.println("Please enter your third grade: ");
        float gr3 = scanner.nextFloat();

        System.out.println("Please enter your fourth grade: ");
        float gr4 = scanner.nextFloat();

        System.out.println("Please enter your fifth grade ");
        float gr5 = scanner.nextFloat();

       float average = ((gr1 + gr2 + gr3 + gr4 + gr5)/5);
        System.out.println("Your average is:" +average);*/


       /* 13. Write a Java program to print the area and perimeter of a rectangle.
                Test Data:
        Width = 5.5 Height = 8.5*/


//        int g;
//        for (g=1; g<51; g=g+1);{
//            System.out.print(g+ " ");}


//        Tema din PPT

//        Problema 1:
//
      /*  int[] arr = {1, 5, 2, 8, 9, 14, 3, 4, 17, 10, 11};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximul este" + " " + max);*/



//        Problema 2:
//        Verificam dacă un numar se afla în intervalul [5,10].

//        var 1
       /* int nr=4;
        if(nr>=5 && nr<=10){
            System.out.println("Numar " + nr + " se afla in intervalul [5,10]");
        }
        else{
            System.out.println("Numarul "  + nr + " nu se afla in intervalul [5,10]");
        }*/

// var 2 - nested loop
        /*int max = 20;
        int low = 5;
        int high = 10;

        for (int i = low; i <= high; i++)
        {
            System.out.println("Numarul " + i + " se afla in intervalul 5 si 10: ");
        }
        System.out.println();

        for (int j = 0; j < low; j++) {
            System.out.println("Numarul " + j + " nu este in intervalul 5 si 10");
        }
        System.out.println();
        for (int k = max; k > high; k--)
        {
            System.out.println("Numerele " + k + " nu sunt in intervalul 5 si 10");
        }
        System.out.println();*/

//    var 3 - cum printez o propozitie pentru fiecare adica numerele 5,6,7,8,9,10 fac parte din intervalul 5 si 10.
//        int max = 20;
//        int low = 5;
//        int high = 10;
//
//        for (int i = low; i <= high; i++) {
//            System.out.println(i);
////         de continuat
////        }



//        Problema 3:
//        Verificam daca un numar este par sau impar

           /*if (16 % 2 == 0) {
                System.out.println("Numarul este par!");
            } else {
                System.out.println("Numarul este impar!");
            }*/



//        Problema 4:
//        Afiseaza fiecare litera a unui string pe rand nou utilizand structura repetitiva while.


       /*String [] l = {"a","b","c","d","e","f","g"};
        System.out.println(l.length);
       int x = 0;

        while(x < l.length){
            System.out.println(l[x] + " ");
            x++;
        } */


//        Problema 5:

//        int[] sir = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(sir));


//        -------------------------------
//        1. Se da String-ul „Maria merge cu bicicleta”. Sa se afiseze caracterul de pe pozitia 7.

        /*String x = "Maria merge cu bicicleta";
        System.out.println(x.charAt(7));

//
//        2. Se da String-ul „Azi este o zi minunata”. Sa se inlocuiasca toate aparitiile caracterului „z” cu „t”.
        String prop = "Azi este o zi minunata";
        System.out.println(prop.replace("z", "t"));


//        3. Se da String-ul „Mere”. Sa se inlocuiasca prima aparitie a caracterului „e” cu „a”.
        String prop2 = "Mere";
        System.out.println(prop2.replaceFirst("e", "a"));


//        4. Se da String-ul „236524”. Sa se afiseze substring-ul „65”.
        String a = "236524";
        System.out.println(a + a.length());
        System.out.println(a.substring(2, 4));*/


//        5. Sa se afiseze sirul 100, 98, 96 , … , 2, 0.

//        int k = 100;
//        while (k >= 0) {
//            System.out.print(k + " ");
//            k = k - 2;
//        }
//
//
////        6. Sa se declare tabloul de String-uri {„mere” , „pere” , „visine” ,
////        „portocale”} . Sa se afiseze elementele tabloului cu spatii intre ele.
//
//        String[] tablou = {"mere", "pere", "visine", "portocale"};
//        System.out.println(Arrays.toString(tablou));


//        7.Sa se afiseze toate numerele pare de la 1 pana la 100 cu virgula intre ele iar apoi, in rand nou să se afiseze numarul acestora.
//
//        int k=0;
//        for (int i=2;i<100;i+=2)
//        {
//            System.out.print(i+ ",");
//            k=k+1;
//        }
//        System.out.println();
//        System.out.println(k + " ");


//        8. Se da un numar N. Determinati si afisati valoarea sumei S=1+2+3+…+N

//        int n=10;
//        int s=((n*(n+1))/2);
//        System.out.println("Valoarea sumei numarului n este = " +s);

        
    }
    }





























