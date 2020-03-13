package schema;

public class SqlThread implements Runnable{

    @Override
    public void run() {
        System.out.println(this.toString());
    }

}
