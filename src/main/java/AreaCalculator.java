public class AreaCalculator {

    // Dikdörtgen alanı
    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            return -1; // Geçersiz değer
        }
        return length * width;
    }

    // Daire alanı
    public static double area(double radius) {
        if (radius < 0) {
            return -1; // Geçersiz değer
        }
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0, 4.0));  // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
        System.out.println(area(5.0));       // 78.53975
        System.out.println(area(-1));        // -1
    }
}
