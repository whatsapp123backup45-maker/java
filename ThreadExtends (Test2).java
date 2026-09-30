class Odd extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class Even extends Thread {

    public void run() {

        for (int i = 2; i <= 6; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Test2 {

    public static void main(String[] args) {

        new Odd().start();
        new Even().start();
    }
}
