import java.util.Scanner;

class Dog extends Animal{
    private int run;
    private float jump;
    private int swim;
    public Dog(String name, String color, int age, int r, float j, int s) {
        super(name, color, age);
        jump = j;
        run = r;
        swim = s;
    }
    public void setAllInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите имя собаки: ");
        String n = sc.nextLine();
        setName(n);
        System.out.print("Введите цвет собаки: ");
        String c = sc.nextLine();
        setColor(c);
        System.out.print("Введите возраст собаки: ");
        int a = sc.nextInt();
        setAge(a);
        System.out.print("Введите длину бега для собаки: ");
        int r = sc.nextInt();
        setRun(r);
        System.out.print("Введите высоту препятствия для собаки: ");
        float j = sc.nextFloat();
        setJump(j);
        System.out.print("Введите расстояние плавания для собаки: ");
        int s = sc.nextInt();
        setSwim(s);

        System.out.print("Собака: ");
        info();
        run(r);
        jump(j);
        swim(s);
        sc.close();
    }
    public void setRun(int r){ run = r;}
    public void setJump(float j){ jump = j;}
    public void setSwim(int s){ swim = s;}
    public void run(int r){
        if(r <= 500){ System.out.print("\n\trun: true"); }
        else{ System.out.print("\n\trun: false"); }
    }
    public void jump(float j){
        if(j <= 0.5){ System.out.print("\n\tjump: true"); }
        else{ System.out.print("\n\tjump: false"); }
    }
    public void swim(int s){
        if(s <= 10){ System.out.print("\n\tswim: true"); }
        else{ System.out.print("\n\tswim: false"); }
    }
}
