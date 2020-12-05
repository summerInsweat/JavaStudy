package OOO.inherit;
import org.junit.Test;
/**
 * @author summersweat
 */
public class Son extends Father {


    public static void main(String[] args) {
        Son son=new Son();
        Father son1=new Son();
        son1.setAge(2);
        son.setAge(199);
    }


}
