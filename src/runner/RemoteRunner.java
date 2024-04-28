package runner;
import controller.*;
public class RemoteRunner {
    public static void main(String[] args) {
        Runner DefultRemote = new Runner();
        System.out.println(DefultRemote.getColor());
        System.out.println(DefultRemote.getHeight());
        System.out.println(DefultRemote.getWidth());
        System.out.println(DefultRemote.getDepth());
        Runner CustomRemote=new Runner(1,12.0,12.0,12.1);
        System.out.println(CustomRemote.getColor());
        System.out.println(CustomRemote.getHeight());
        System.out.println(CustomRemote.getWidth());
        System.out.println(CustomRemote.getDepth());

    }


}
