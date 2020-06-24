

public class ThreadInterfaceLambdaExpression {
    public static  void main(String[] args){ // by default main() is a thread


        Runnable hey1 = () -> {
                for (int i = 0; i < 5 ; i++ ) {
                    System.out.println("h ==> 1");
                    // to make the thread goes slow in printing
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            };

        Runnable hey2 = () -> { // this means we are creating an object from a class has no name and which extends a runnable interface, and since the runnable interface has only one method we override it
                for (int i = 0; i < 5 ; i++ ) {
                    System.out.println("h ==> 2");
                    // to make the thread goes slow in printing
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            };


        Thread t1 = new Thread(hey1, "thread-hey1"); //we need to link the obj  to the thread
        Thread t2 = new Thread(hey2, "thread-hey2"); //we need to link the obj  to the thread

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // we could also replace hey1 and hey2 with the functions directly as well but i just left them to make the understanding easy
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        t1.start();
        t2.start();

        System.out.println("is t1 alive ===> "+ t1.isAlive());
        System.out.println("is t2 alive ===> "+ t2.isAlive());

        try{t1.join();}catch (Exception e){} // .join() means that we ask the main() thread to wait for t1 to join
        try{t2.join();}catch (Exception e){} // .join() means that we ask the main() thread to wait for t1 to join

        System.out.println("is t1 alive ===> "+ t1.isAlive());
        System.out.println("is t2 alive ===> "+ t2.isAlive());
        System.out.println("bye ");


        //checking the priority of the thread
        System.out.println("t1  priority ===> "+ t1.getPriority());
        System.out.println("t2  priority ===> "+ t2.getPriority());

        // changing the priority of the threads
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1  priority ===> "+ t1.getPriority());
        System.out.println("t2  priority ===> "+ t2.getPriority());

        //checking the current thread priority
        System.out.println("current thread priority ===> "+ Thread.currentThread().getPriority());
    }
}
