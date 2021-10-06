public class HomeWorkApp {
    public static void main(String[] args) {
        drawSquare();
        checkSumSign();
        printColor();
        compareNumbers();}
        public static void drawSquare () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign () {
            int a = 12;
            int b = 32;
            int c = a + b;
            if (c > 0) {
                System.out.println("Сумма положительная");
            }
            if (c == 0) {
                System.out.println("Сумма = 0");
            }
            if (c < 0) {
                System.out.println("Сумма отрецательна");
            }
        }
        public static void printColor () {
            int i = 17;
            if (i <= 0) {
                System.out.println("Красный");
            }
            if (i > 0 && i < 100) {
                System.out.println("Жолтый");
            }
            if (i > 100) {
                System.out.println("Эеленый");
            }

        }
        public static void compareNumbers(){
            int a = 24;
            int b = 17;
            if (a >= b){
                System.out.println("a>=b");
            }
            if (a < b){
                System.out.println("a<b");
            }


        }

    }
