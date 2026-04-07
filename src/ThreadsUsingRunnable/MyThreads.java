package ThreadsUsingRunnable;

class MyThread implements Runnable {

    private String threadName;
    private int sleepTime;
    private int seconds;

    public MyThread(String threadName, int sleepTime,int seconds){
        this.threadName = threadName;
        this.sleepTime = sleepTime;
        this.seconds = seconds;
    }

    @Override
    public void run(){
        System.out.println(threadName + " is starting.");

        try{

            Thread.sleep(sleepTime);

            System.out.println(threadName + " is sleeping for " + seconds + " second(s).");
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println(threadName + " has finished.");

    }

}