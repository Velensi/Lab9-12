import java.util.Scanner;

public class Telekanal extends SMI{
    private String autor;
    public Telekanal(){
        super();
        autor="Без автора";
    }
    public Telekanal(String nazv, int kol, String mesto, String avtor){
        super(nazv,kol,mesto);
        autor = avtor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String avtor) {
        autor = autor;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите канал: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("Введите количество каналов: ");
        int kol = sc.nextInt();
        setCount(kol);
        System.out.println("Введите платформу каналов: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите тему: ");
        String avtor = sc.next();
        setAutor(avtor);
    }
    public String toString(){
        return ("\n\t"+"Канал: "+getName() +"\n\t"+"Кол-во канал: "+getCount()+"\n\t"+"Платформы: "+getLocation()+"\n\t"
                + "Тема: " + autor);
    }
}
