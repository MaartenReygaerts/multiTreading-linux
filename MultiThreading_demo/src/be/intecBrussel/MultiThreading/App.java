package be.intecBrussel.MultiThreading;

public class App {
    public static void main(String[] args) {

       Thread thread1 = new Thread(() ->print('@',100));
       Thread thread2 = new Thread(() -> print('#',100));

       thread1.start();
       thread2.start();



    }

    private static void print(char c, int count) {
        for (int j = 0; j < count ; j++) {
            System.out.println(c);
            Thread.yield();
        }
    }
}
