public class Task1Task2 {

    public static class Task1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task1");
                try {
                    Thread.sleep(5000); // čeka 5 sekundi
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Task2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task2");
                try {
                    Thread.sleep(2000); // čeka 2 sekunde
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

        public static void main(String[] args) {
            Thread thread1 = new Thread(new Task1());
            Thread thread2 = new Thread(new Task2());

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
