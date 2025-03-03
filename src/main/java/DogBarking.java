public class DogWakeUp {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Geçersiz saat
        }
        if (barking && (hourOfDay >= 8 && hourOfDay <= 23)) {
            return false; // Gündüz havlayan köpeğe tepki verilmez
        }
        return barking && (hourOfDay >= 0 && hourOfDay < 8);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false
    }
}
