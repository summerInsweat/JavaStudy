package test;

/**
 * @author summersweat
 */
public class bjz {
    public void make(mf mf,xian xian){
        System.out.println("这是"+mf.cailiao+xian.name+"饺子");
    }

    public static void main(String[] args) {
        mf mf = new mf("玉米");
        xian xian = new xian("猪头");
        new bjz().make(mf,xian);
    }
}
