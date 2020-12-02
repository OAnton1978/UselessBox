package q;

public class User extends Thread {

    @Override
    public void run() {
        int togglePeriod = 4000;  // период включения тумблера
        int countCycles = 5;      // количество итераций
        try {
            while (!isInterrupted() && countCycles > 0) {
                Thread.sleep(togglePeriod);
                Main.toggle = true;
                System.out.println("Тумблер включен");
                countCycles--;
            }
        } catch (InterruptedException err) {
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}

