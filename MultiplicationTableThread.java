public class MultiplicationTableThread extends Thread {
    private int num;

    public MultiplicationTableThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
    
        
        generateMultiplicationTable(5);
        generateMultiplicationTable(10);
        generateMultiplicationTable(10, 20);
        generateMultiplicationTable(-10, -30);
        generateMultiplicationTable(0, 0);
    }

    private static void generateMultiplicationTable(int num) {
        MultiplicationTableThread thread = new MultiplicationTableThread(num);
        System.out.println("Multiplication Table for " + num + ":");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------");
    }

    private static void generateMultiplicationTable(int num1, int num2) {
        MultiplicationTableThread thread1 = new MultiplicationTableThread(num1);
        MultiplicationTableThread thread2 = new MultiplicationTableThread(num2);

        System.out.println("Multiplication Table for " + num1 + ":");
        thread1.start();

        System.out.println("Multiplication Table for " + num2 + ":");
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------");
    }
}
