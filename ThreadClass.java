
// !!!!! important , in thread the start method always call the run method



class Hello1 extends Thread { // by extending the class to the thread, this make the class a thread
    public void run(){
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println("hello ==> 1");
            // to make the thread goes slow in printing
            try{Thread.sleep(1000);}catch (Exception e){}
        }
        }
    }


class Hello2 extends Thread { // by extending the class to the thread, this make the class a thread
    public void run(){
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println("hello ==> 2");
            // to make the thread goes slow in printing
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}




public class ThreadClass {

    public static void main(String[] args){ // by default main() is a thread


        Hello1 h1 = new Hello1();
        Hello2 h2 = new Hello2();

        h1.start();  // because it is a thread as well since we extended from a thread class, start() always call run()
        h2.start(); // because it is a thread as well since we extended from a thread class start() always call run()



    }
}
