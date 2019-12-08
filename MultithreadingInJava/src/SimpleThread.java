public class SimpleThread {
    public static void main2(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.print("a");
        }

        for (int i = 0; i <5 ; i++) {
            System.out.print("c");
        }

        for (int i = 0; i <5 ; i++) {
            System.out.print("d");
        }
    }
    public  class ChanrThread extends  Thread {
        private  char c;

        public  ChanrThread(char c){
            this.c =c;
        }
        @Override
        public void run(){
            for (int i = 0; i <5 ; i++) {
                System.out.print(c);
            }
        }
    }
    public void runThreads(){
        for (int i = 0; i <100 ; i++) {
            Thread a = new ChanrThread('a');
            Thread b = new ChanrThread('b');
            Thread c = new ChanrThread('c');
            a.start();
            b.start();
            c.start();
        }

    }

    public static void main(String[] args) {
        new SimpleThread().runThreads();
    }
}


