public class DemoMain {

    public static void main(String[] args) {
        ThreadDemo td= new ThreadDemo();
        td.setName("extend thread");
        td.run();
        Thread thread= new Thread(new RunnableClass());
        thread.run();
        thread.setName("Runnable thread");
        System.out.println("from main menthod"+ thread.getName());
        td.walk();
    }

}
