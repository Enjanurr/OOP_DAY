package SynchronizationSample;

class Counter {
    private int count = 0;

    //You can use Method 1
    /* Synchronize the increment method to ensure thread safety
    public synchronized void increment() {
        count++;
    }
    */

    //Or you can use Method 2
    // Method without synchronization, we will synchronize only the critical block
    public void increment() {
        // Synchronize only the critical section that modifies the shared resource
        synchronized (this) {
            count++;
        }
    }


    public int getCount() {
        return count;
    }
}