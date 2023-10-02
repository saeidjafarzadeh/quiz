public class Thread2 implements Runnable {
    public Thread2(Bank bank) {

    }

    @Override
    public void run() {
        try {
            System.out.println("thread2");
            Thread.sleep(100);
            int b = Bank.Deposit(10);
            int c=Bank.Withrow(11);
            System.out.println("thread2 deposit:"+b);
            System.out.println("thread2 withrow:"+c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
