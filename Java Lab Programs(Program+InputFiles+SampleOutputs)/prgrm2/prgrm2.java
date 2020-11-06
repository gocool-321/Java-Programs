class Student extends Thread{
    public synchronized void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("From Student Thread with i = "+ i);
        }
        System.out.println("Exiting from Student Thread ...");
    }
}

class Teacherrr extends Thread{
    public synchronized void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("From Teacher Thread with i = "+ i);
        }
        System.out.println("Exiting from Teacher Thread ...");
    }
}

class Parents implements Runnable{
    @Override
    public synchronized void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("From Parent Thread with i = "+ i);
        }
        System.out.println("Exiting from Parents Thread ...");

    }}


class prgrm2{
    public static void main(String[] args) {
        Student stud=new Student();
        Teacherrr teach=new Teacherrr();
        Parents parent=new Parents();
        stud.start();
        teach.start();
        parent.run();
    }

}