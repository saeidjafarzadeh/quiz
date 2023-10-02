public class Bank {


    static int totalMoney=0;
    public static synchronized int Deposit(int amount){
        for (int i = 0; i < 10; i++) {
            totalMoney+=amount;
        }
        return totalMoney;
    }
    public static synchronized int Withrow(int amount){
        for (int i = 0; i < 10; i++) {
            totalMoney-=amount;
        }
        return totalMoney;
    }


}
