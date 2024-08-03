package methods;

public class Ex7 {
    public static void main(String[] args) {
        //display the first 50 pentagonal numbers

//        for (int i = 1; i <= 50; i++) {
//            int res = i * (3 * i - 1) / 2;
//            System.out.print(res + "  ");
//        }
        int i, k =0;
        for(i= 1; i<=7; i++){

            String l ="", r = "";

            for(k= 1; k<=7-i; k++){
                System.out.print(" ");
            }


            for(k= i; k>=1; k--){
               // System.out.print(k);
                l += k;
                r = (k!= 1) ? k+r : r;
            }
            System.out.print(l+r);
            System.out.println();
        }
        System.out.println("\n\n");
        Shape shape1 = Shape.CIRCLE;
        Shape shape2 = Shape.RECTANGLE;
        Shape shape3 = Shape.HEXAGON;
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
    }

    // Write a Java method to
    public enum Shape {
        SQUARE(14), CIRCLE(33), RECTANGLE(45), TRIANGLE(18), HEXAGON(20);
        private int area;

        Shape(int a) {
            this.area = a;
        }

        public int getArea() {
            return this.area;
        }

        @Override
        public String toString() {
            return this.name().charAt(0) + this.name().substring(1).toLowerCase() + "(" + this.area + ")";
        }
    }
}
