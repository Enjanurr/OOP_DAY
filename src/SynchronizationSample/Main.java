package SynchronizationSample;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two IncrementTask instances, both with the same counter
        Runnable task1 = new IncrementTask(counter);
        Runnable task2 = new IncrementTask(counter);

        // Create two threads, each running the IncrementTask
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output the final counter value
        System.out.println("Final counter value: " + counter.getCount());
    }
}