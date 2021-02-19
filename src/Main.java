public class Main {
    public static void main(String[] args) {
        double masskg = 82.5;
        double growthcm = 182;
        double growthm = growthcm / 100;
        double imt = masskg / (growthm * growthm);
        System.out.println(imt);
    }
}
