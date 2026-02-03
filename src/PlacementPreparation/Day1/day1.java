package PlacementPreparation.Day1;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class day1 {

    public static void dataTypes(){
        /// data types
        System.out.println("byte");
        // byte - range -128 to 127
        byte a = 10;
        System.out.println(a); // 10

        byte b = 127;
        System.out.println(b);


        System.out.println("short");
        //short -32768 to 32767
        short s = 32765; // 5 digits max
        System.out.println(s);

        short s2 = -23423;
        System.out.println(s2);


        // int
        System.out.println("Int");
        int i1 = 976876283; // 9 digits max
        System.out.println(i1);

        int i2 = 8972;
        System.out.println(i2);

        //long both suffix L -or- l  is anything is fine
        System.out.println("Long");
        long l1 = 987890798809223345L; // 18 digits max
        System.out.println(l1);

        long l2 = -8907892789798778l;
        System.out.println(l2);



        // boolean  range is not identified by JVM
        System.out.println("Boolean");
        boolean b1 = false;
        System.out.println(b1);


        // double
        System.out.println("Double");
        double d1 = 2.708978972343242342340;
        System.out.println(d1);

        //float suffix either f -or- F
        System.out.println("Float");
        float f1 = 3432.9899F;
        System.out.println(f1);

        float f2 = 809798.234234f;
        System.out.println(f2);


        // char
        // char must be initialized
        System.out.println("Char");
        char c1 = '\u0000';
        System.out.println(c1);

        char c2 = 'D';
        System.out.println(c2);

        // String
        System.out.println("String");
        String s1 = "kumar";
        System.out.println(s1);

        String s3 = "dhinesh"+"kumar";
        System.out.println(s3);
    }

    public static void loops(){
        // for loop->used when iterations is known.

        for(int i=1;i<=10;i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        String[] names = {"dhinesh","kumar","MTS @zoho"};
        for(String x : names){
            System.out.print(x+" ");
        }
        System.out.println();

        //while loop -> used when before checking the condition before executing the loop body.
        int i = 1;
        while(i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //do-while loop - > ensures that executing the block of code atleast once. before checking the condition

        int j = 1;
        do{
            System.out.print(j+" ");
            j++;
        }while(j <= 10);

        System.out.println();

        int k = 1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k <= 3);
    }
    public static void main(String[] args) {

        loops();
    }
}
