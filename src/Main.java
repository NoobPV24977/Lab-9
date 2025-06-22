public class Main {
    public static void main(String[] args) {
        int threadsCount = 4;
        for (int i = 0; i < threadsCount; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Потік #" + threadNumber + ": слово " + j);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
