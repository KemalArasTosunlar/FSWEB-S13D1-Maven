package org.example;

public class Main {
    public static void main(String[] args) {
        // shouldWakeUp testleri
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false

        // hasTeen testleri
        System.out.println(hasTeen(13, 20, 25));  // true
        System.out.println(hasTeen(22, 23, 34));  // false

        // isCatPlaying testleri
        System.out.println(isCatPlaying(true, 35));  // true
        System.out.println(isCatPlaying(false, 35)); // false

        // area metodları testleri
        System.out.println(area(5, 10));  // 50.0
        System.out.println(area(7));      // 153.93804002589985
    }

    // shouldWakeUp metodu
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false; // Geçersiz saat
        }
        return isBarking && (clock < 8 || clock > 20); // Gece 8'den önce veya sabah 8'den önce havlarsa true döner
    }

    // hasTeen metodu: Verilen üç yaş değerinden biri 13-19 arasındaysa true döner
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // isCatPlaying metodu: Yaz aylarında 25-45 derece, diğer zamanlarda 25-35 derece aralığında oynuyorsa true döner
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        }
        return temp >= 25 && temp <= 35;
    }

    // area metodu: Dikdörtgenin alanını hesaplar
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1; // Geçersiz değer için -1 döndür
        }
        return width * height;
    }

    // area metodu (aşırı yükleme): Çemberin alanını hesaplar
    public static double area(double radius) {
        if (radius < 0) {
            return -1; // Geçersiz değer için -1 döndür
        }
        return Math.PI * radius * radius;
    }
}
