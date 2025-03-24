public class FiboThread extends Thread {

        @Override
        public void run() {
            long[] fib = new long[100];
            fib[0] = 1;
            fib[1] = 1;
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + fib[0]);
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + fib[1]);
            for (int i = 2; i < 100; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                System.out.println("Thread: " + Thread.currentThread().getName() + " - " + fib[i]);
            }
        }

        public static void main(String[] args) {
            FiboThread fiboThread = new FiboThread();
            fiboThread.start();
        }
    }