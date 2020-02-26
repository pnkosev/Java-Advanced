package pr05transactions;

public class Transaction {
    public static void main(String[] args) throws InterruptedException {
        final int transactions = 100;
        final int operationsPerTransaction = 100;

        BankAccount account = new BankAccount(0);

        Runnable task = () -> {
            for (int i = 0; i < operationsPerTransaction; i++) {
                account.deposit(1);
                Thread.yield();
            }
        };

        Thread[] threads = new Thread[transactions];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join(); // the main (caller) thread awaits for the other threads (called) to finish execution
        }

        System.out.println(account.getBalance()); // returns 10000 if the method deposit() of BankAccount is synchronised OR a number that varies if not synced
    }
}
