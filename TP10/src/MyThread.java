public class MyThread extends Thread {
    private Thread other;

    public MyThread(String nom) {
        super(nom);
    }

    public void setOther(Thread other) {
        this.other = other;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++) {
            System.out.println("Nom : " + this.getName() + " Etat : " + this.getState());
            System.out.println("Nom : " + this.getName() + " Other : " + other.getName()  + " Etat : " + other.getState());
        }
    }

    public static void main(String[] args) {
        MyThread threadA = new MyThread("Thread A");
        MyThread threadB = new MyThread("Thread B");
        threadA.setOther(threadB);
        threadB.setOther(threadA);

        System.out.println(threadA.getState());
        System.out.println(threadB.getState());

        threadA.start();
        threadB.start();

        System.out.println(threadA.getState());
        System.out.println(threadB.getState());
    }
}
