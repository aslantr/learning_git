public class SimpleLoadThread {



    public  class ChanrThread extends  Thread {

        @Override
        public void run(){
            System.out.println("Thread Started, it name is "+ Thread.currentThread().getName());
            int a = 2;

            // Thread will never be ended!
            // Opening thread is expensive
            while(true){
                a++;
            }
        }
    }

    public void runThreads(){

        for (int i = 0; i <4 ; i++) {
            ChanrThread t = new ChanrThread();
            t.start();

        }


    }

    public static void main(String[] args) {

        System.out.println("Program started!");

        new SimpleLoadThread().runThreads();

        System.out.println("Program ended!!");
    }
}
