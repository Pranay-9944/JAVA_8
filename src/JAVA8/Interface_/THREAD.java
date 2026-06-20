package JAVA8.Interface_;

public class THREAD {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("running ");
            }
        });
        t.start();


  ///  VS


        THREAD t1=new THREAD();
        for (int i = 0; i < 10; i++) {
            System.out.println("running big ");
        }
    }

}