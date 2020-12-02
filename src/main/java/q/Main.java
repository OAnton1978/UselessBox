package q;

public class Main {
    static boolean toggle = false;    // переключатель выключено - false, включено - true

    public static void main(String[] args) throws InterruptedException {

        Runnable r = new User();
        Runnable t = new Box();
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread User = new Thread(mainGroup, r, "Пользователь");
        Thread Box = new Thread(mainGroup, t, "Коробка");
        User.start();
        Box.start();
        User.join();
        mainGroup.interrupt();
    }
}