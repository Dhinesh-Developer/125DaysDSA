package PlacementPreparation.Day1;

public class day1_ps {

    private static void pattern1(){
        for(int i=0;i<5;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    private static void pattern2(){
        for(int i=1;i<=5;i++){
            System.out.println("*");
        }
        System.out.println();
    }

    private static void pattern3(){
        int n = 5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern4(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern5(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void pattern6(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void pattern7(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern8(){
        int n = 5;
        int cnt = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern9(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(char j='A';j<='A'+i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void pattern10(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern11(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern12(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern13(){
        int n = 5;
        for(int i=1;i<=n;i++){
            int val = (i%2==1)?1:0;
            for(int j=1;j<=i;j++){
                System.out.print(val);
                val = (val == 1)?0:1;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern14(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j == n-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern15(){
        int n = 5;
        for(int i=1;i<=n;i++){
            int val = 1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
        pattern13();
        pattern14();
        pattern15();

    }
}
