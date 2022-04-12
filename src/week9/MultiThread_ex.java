package week9;

class Hamburger2 extends Thread {
    private int shop_number;

    Hamburger2(int number) {
        this.shop_number = number;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hamburger from shop " + this.shop_number);
        }
    }
}

public class MultiThread_ex {
    public static void main(String[] args) {
        Hamburger2[] shop_list = new Hamburger2[17];
        for (int i = 0; i < shop_list.length; i++) {
            shop_list[i] = new Hamburger2(i);
            if (i == 1) shop_list[i].setPriority(10);
            shop_list[i].start();
        }
    }
}
