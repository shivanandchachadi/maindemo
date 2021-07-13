public class ThreadDemo extends  Thread{

    public void run()
    {
        int n=0;
        while(n!=5)
        {
            System.out.println("print from run "+ n);
            n++;
        }
    }
    public void walk()
    {
        int n=0;
        while(n!=2)
        {
            System.out.println("print from walk method "+ n);
            n++;
        }
    }
}
