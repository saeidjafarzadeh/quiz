public class Thread1 implements Runnable{
    Bank bank;

    public Thread1(Bank bank) {
    }

    @Override
    public void run() {
        try {
            System.out.println("thread1");
            Thread.sleep(100);

            int a=Bank.Deposit(100);
            int b=Bank.Withrow(11);
            System.out.println("thread1 deposit:"+a);
            System.out.println("thread1 withrow:"+b);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
