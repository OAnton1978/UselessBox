package q;

public class Box extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(200);
                if (Main.toggle) {
                    Main.toggle = false;
                    System.out.println("Тумблер выключил");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}



