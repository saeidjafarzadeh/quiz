public class Start {
    public static void main(String[] args) {
     Bank bank=new Bank();
        Thread thread=new Thread(new Thread1(bank));
        thread.start();
        Thread thread1=new Thread(new Thread2(bank));
        thread1.start();
    }
}
