package week9;

class Hamburger implements Runnable {
    private int shop_number;

    Hamburger(int number) {
        this.shop_number = number;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hamburger from shop " + this.shop_number);
        }
    }
}

public class SingleThread_ex1 {
    public static void main(String[] args) {
        Thread h1 = new Thread(new Hamburger(1));
        Thread h2 = new Thread(new Hamburger(2));
        h1.start();
        h2.start();
    }
}
