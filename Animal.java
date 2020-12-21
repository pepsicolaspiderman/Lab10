import java.util.Scanner;

interface IAnimal{
    void info();
    void run(int r);
    void swim(int s);
    void jump(float j);
}
abstract class Animal implements IAnimal{
    private String name;
    private String color;
    private int age;
    public Animal(String name, String color, int age){
        this.name = "name";
        this.color = "color";
        this.age = 0;
    }
    public void setName(String n){ name = n; }
    public void setColor(String c){ color = c; }
    public void setAge(int a){ age = a; }
    public String getName(){ return name;}
    public String getColor(){ return color;}
    public int getAge(){ return age;}
    public void info(){
        System.out.println("\n\tИмя: "+name+"\n\tЦвет: "+color+"\n\tВозраст: "+age);
    }
}