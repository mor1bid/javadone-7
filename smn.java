/**
 * Определение точек координат через конструкторы методов
 */
import java.lang.Thread.State;
import java.util.*;
class Point2D
{
    private int x, y;

    /**
     * Это конструктор LEGO ...
     * @param vl1 это кусок ракеты
     * @param vl2 эта кусок ракети
     */
    Point2D(int vl1, int vl2) {
        x = vl1;
        y = vl2;
    }
    Point2D(int vl) {
        this(vl, vl);
    }
    // Point2D() {
    //     x = 0;
    //     y = 0;
    // }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int vl){
        this.x = vl;
    }
    public void setY(int vl){
        this.y = vl;
    }
    String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override // можно изменять готовые методы, а не создавать новые
    public String toString() {
        return super.toString();
    }
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

class prog 
{
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // a.x = 0;
        // a.y = 2;
        // a.setX(0);
        // a.setY(2);
        System.out.println(a.getInfo());
        Point2D b = new Point2D(0, 10);
        // b.x = 0;
        // b.y = 10;
        System.out.println(b.getInfo());
        // System.out.println(distance(a, b));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}

class robo1 {
    private int level;
    private String name;
    public String getnm() {
        return name;
    }
    public int getlvl() {
        return level;
    }

    /**
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public robo1(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    public void powerOff() {
        this.stopBIOS();
        this.stopOS();
        this.sayBye();
    }
    private void startBIOS() { System.out.println("Start BIOS");}
    private void startOS() { System.out.println("Start OS");}
    private void sayHi() { System.out.println("Hi bob");}
    private void stopBIOS() { System.out.println("fuck BIOS");}
    private void stopOS() { System.out.println("fuck OS");}
    private void sayBye() { System.out.println("Toodles");}
}
class robo01 {
    private int level;
    private String name;
    public String getnm() {
        return name;
    }
    public int getlvl() {
        return level;
    }
    private static int defaultindex;
    private static ArrayList<String> names;
    static {
        defaultindex = 1;
        names = new ArrayList<>();
    }
    enum State {
        On, Off
    }
    private State stat;
    public robo01(String name, int level) {
        if((name.isEmpty() || Character.isDigit(name.charAt(0))) || robo01.names.indexOf(name) == -1) 
        {
            this.name = String.format("DefaultName_%d", defaultindex++);
        }
        else {
            this.name = name;
        }
        robo01.names.add(this.name);
        this.level = level;
        this.stat = State.Off;
    }
}
/**
 * smn
 */
public class smn {
    public static void main(String[] args) {
        robo1 robot = new robo1("NSHR-1", 1);
        // robot.level = 100500; // Со значением private пользователь такого не сделает
        System.out.println("%s %d\n" + robot.getnm() + robot.getlvl());
    }
    
}
