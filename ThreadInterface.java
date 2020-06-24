
// !!!!! important , in thread the start method always call the run method

class H1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println("h ==> 1");
            // to make the thread goes slow in printing
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}


class H2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println("h ==> 2");
            // to make the thread goes slow in printing
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class ThreadInterface {

    public static  void main(String[] args){ // by default main() is a thread
    Runnable hi1 = new H1();
    Runnable hi2 = new H2();

    Thread t1 = new Thread(hi1); //we need to link the classes to the threads
    Thread t2 = new Thread(hi2);

    t1.start();
    t2.start();

    }
}
