package PlacementPreparation.Day2;

public class day2 {

    private static void ifExample(){
        int x = 10;
        if(x > 0){
            System.out.println("x is positive");
        }

        // Example 2
        boolean isRainy = true;
        if(isRainy){
            System.out.println("Rain is coming!");
        }
    }

    private static void ifElse(){
        int x = 10;
        if(x > 0){
            System.out.println("x is positive");
        }else{
            System.out.println("x is negative!");
        }


        /// Example 2
        boolean isRainy = false;
        if(isRainy){
            System.out.println("rain is coming");
        }else{
            System.out.println("It is normal day");
        }
    }

    private static void ifElseIf(){
        int x = 0;
        if(x > 0){
            System.out.println("x is positive");
        }else if(x < 0){
            System.out.println("x is negative");
        }else{
            System.out.println("x is equal to zero");
        }


        // Example 2
        String res = "MTS@ZOH";
        if(res.equals("MTS@ZOHO")){
            System.out.println("MTS@ZOHO");
        }else if(res.equals("kumar")){
            System.out.println("kumar getting 8.4 LPA");
        }else{
            System.out.println("dhineshKumar MTS@ZOHO @ 8.4 LPA");
        }
    }

    private static void switchStatement(){
        int x = 3;
        switch (x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }


    private static void ternaryOperator(){
        boolean res = true;
        System.out.println(res?"true":"false");
    }

    public static void main(String[] args) {

        // if
        ifExample();

        // if else
        ifElse();

        // if else if
        ifElseIf();

        // switch statement
        switchStatement();


        // ternary operator
        ternaryOperator();

    }
}
