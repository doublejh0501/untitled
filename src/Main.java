public class Main {

    public static void problem1(int n) {
       for(int i =0; i <=n; i++) {
           for(int j=0; j <=n; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    public static void problem2(int n) {
        for(int i=0; i <=n; i++) {
            for(int j =0; j <=i; j++) {
                if (i ==j) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void problem3(int n) {
        for(int i =0; i<=n; i++) {
            for(int j=0; j <= n; j++) {
                System.out.print(" ");
                if(n-i == j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void problem4(int n) {
        for(int i=0; i <=n; i++) {
            for(int j=0; j <= n; j++) {
                if(j == i || j==n-i) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void problem5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void problem6(int n) {
        for(int i =0; i<=n; i++) {
            for(int j=0; j <=n; j++) {
                if(j >= n-i) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void problem7(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i+5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void problem8(int n) {
        for(int i =0; i <=n; i++) {
            for(int j=0; j <= n*2; j++) {
                if(n+i >= j && n-i <=j) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void problem9(int n) {
        for(int i =0; i<=n; i++) {
            for(int j = 0; j<=n; j++) {
                if(i <= n/2) {
                    if (i <= j && n - i >= j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else if(i > n/2) {
                    if(i >= j && n-i <=j) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void problem10(int n) {
        for(int i =0; i <=n; i++) {
            for(int j =0; j <=n; j++) {
                if(i <= n/2) {
                    if (j <= i || j >= n-i )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else if(i > n/2) {
                    if(j <= n-i || j >= i) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        problem1(4);
        problem2(4);
        problem3(4);
        problem4(4);
        problem5(4);
        problem6(4);
        problem7(4);
        problem8(4);
        problem9(4);
        problem10(4);

    }
}
