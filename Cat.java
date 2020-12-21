import java.util.Scanner;

class Cat extends Animal{
    private int run;
    private float jump;
    private int swim;
    public Cat(String name, String color, int age, int t, float w, int u) {
        super(name, color, age);
        jump = w;
        run = t;
        swim = u;
    }
    public void setAllInfo(){
        Scanner scc = new Scanner(System.in);
        System.out.print("\nВведите имя кошки: " );
        String m = scc.nextLine();
        setName(m);
        System.out.print("Введите цвет кошки: ");
        String v = scc.nextLine();
        setColor(v);
        System.out.print("Введите возраст кошки: ");
        int e = scc.nextInt();
        setAge(e);
        System.out.print("Введите длину бега для кошки: ");
        int t = scc.nextInt();
        setRun(t);
        System.out.print("Введите высоту препятствия для кошки: ");
        float w = scc.nextFloat();
        setJump(w);
        System.out.print("Введите расстояние плавания для кошки: ");
        int u = scc.nextInt();
        setSwim(u);

        System.out.print("\nКошка: ");
        info();
        run(t);
        jump(w);
        swim(u);
        scc.close();
    }
    public void run(int t){
        if(t <= 200){ System.out.print("\n\trun: true"); }
        else{ System.out.print("\n\trun: false"); }
    }
    public void jump(float w){
        if(w <= 2){ System.out.print("\n\tjump: true"); }
        else{ System.out.print("\n\tjump: false"); }
    }
    public void swim(int u){
        System.out.print("\n\tswim: false");
    }
    public void setRun(int t){ run = t;}
    public void setJump(float w){ jump = w;}
    public void setSwim(int u){ swim = u;}
}
