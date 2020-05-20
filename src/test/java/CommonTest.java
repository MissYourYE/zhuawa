public class CommonTest {

    public static void main(String[] args) {
        long s = System.nanoTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long e = System.nanoTime();
        System.out.println((e - s)/1000000000);
    }
}
