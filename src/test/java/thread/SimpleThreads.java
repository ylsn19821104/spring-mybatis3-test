package thread;

/**
 * Created by hongxp on 2016/9/23.
 */
public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException {
        String hello = "hello";
        String msg = "he" + new String("llo");
        System.out.println(msg == hello);

        long patience = 1000 * 1;
        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            t.join();
            if ((System.currentTimeMillis() - startTime) > patience) {
                threadMessage("Tired of waiting...");
                t.interrupt();

                t.join();
            }
        }

        threadMessage("Finally!");
    }

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {
        @Override
        public void run() {
            String importantInfo[] = {"Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"};
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }
}
