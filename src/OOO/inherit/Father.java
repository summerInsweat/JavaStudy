package OOO.inherit;

/**
 * @author summersweat
 */
public class Father {
    private String name;
    private int Money;
    private String wife;
    private int age=40;
    public String house="lp";


        //封装年龄
    public void setAge(int age) {
        if (age>200||age<0){
            System.out.println("请输入正确的数值");
        }else {
            this.age = age;
            System.out.println(age);
        }

    }
}
