public class Recursion {
    //public static void main(String[] args) {
    ////    System.out.println("Enter a number: ");
    //   Scanner s = new Scanner(System.in);
    //   int n = s.nextInt();
    //}
    public static void main(String[] args) {
        int n = 5;
        recur(n);
        System.out.println();
        recur1(1, 5);
        System.out.println();
        recur2(n);
    }

    public static int recur(int n) {
        if (n > 0) {
            System.out.println(n);
            recur(n - 1);
            System.out.println(n);
        }

        return n;
    }


    public static void recur1(int n, int j) {
        if (n > j) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(n);
        }
        System.out.println();
        recur1(n + 1, j);

        for(int i = n; i>0; i--){
            System.out.print(n);

        }
        System.out.println();

    }



    public static void recur2(int n){
        if(n < 1){
            return;
        }
        for(int i = n; i > 0; i--){
            System.out.print("#");

        }
        System.out.println();
        recur2(n-1);

        for(int i =0;i<=n;i++){
            System.out.print("#");
        }
        System.out.println();

    }


}
