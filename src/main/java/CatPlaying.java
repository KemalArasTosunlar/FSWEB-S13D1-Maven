public class CatPlaying {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true
    }
}
