public class Driver {
    public static void main(String[] args) {
        method1(5);
        System.out.println();
        System.out.println();
        method2(5);

    }

    public static void method1(int number) {
        System.out.println(number);
        if (number > 1) {
                method1(number - 1);
        }
        System.out.println(number);



    }
    public static void method2(int number) {


            if (number > 1) {
                method2(number - 1);
            }




                for (int i = number; i > 0; --i) {
                    System.out.print(number);

                }
                System.out.println();










    }

    public static void printhash(int num) {

    }
}
