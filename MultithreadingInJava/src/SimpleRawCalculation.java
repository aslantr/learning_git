import java.util.ArrayList;
import java.util.List;

public class SimpleRawCalculation {
    private  static  int value;

    private  static  Object SYCN_OBJECT = new Object();
    static  void  increment(){

        /*
        int newValue = value+1;
        try{
            Thread.sleep(5);
        } catch (InterruptedException e){
            e.setStackTrace();
        }
        value= newValue; */

        for (int i = 0; i <1000 ; i++) {
            synchronized (SYCN_OBJECT) {
                value++;
            }
        }

    }

    public class IncrementThread extends Thread {

        @Override
        public void run(){
            increment();
        }
    }

    public void runThreads () throws InterruptedException {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            Thread t = new IncrementThread();
            t.start();
            list.add(t);
        }
        for (int i = 0; i <list.size() ; i++) {
            Thread t = list.get(i);

            t.join();

        }
        System.out.println("Threads are over, value is "+ value);
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleRawCalculation simple = new SimpleRawCalculation();
        simple.runThreads();

    }


}
