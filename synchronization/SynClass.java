package synchronization;



class Count {
     int i = 0;
    public  synchronized  void  increment(){ // synchronized means only one thread can use this function at time
        i += 1;
    }

}




public class SynClass {
  public static void main(String[] args) throws Exception{

      Count count = new Count();
      count.increment();
      System.out.println("i ===>"+ count.i);

      // using a thread to increment
      Thread t1 = new Thread(()-> {
          for (int i = 0; i < 1000; i++){
              count.increment();
          }
      });
      Thread t2 = new Thread(()-> {
          for (int i = 0; i < 1000; i++){
              count.increment();
          }
      });



      t1.start();
      t2.start();

      t1.join(); // asking the main() thread to join
      t2.join(); // asking the main() thread to join
      System.out.println("i after  ===>"+ count.i);
  }
}
