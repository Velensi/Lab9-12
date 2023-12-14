import java.util.Scanner;
public class Gazeta  extends SMI {
    private String theme;
    public Gazeta(){
        super();
        theme = "Без темы";
    }
    public Gazeta(String nazv, int kol, String mesto, String tema){
        super(nazv,kol,mesto);
        theme = tema;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String tema) {
        theme = tema;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название издательства: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("Введите количество названий: ");
        int kol = sc.nextInt();
        setCount(kol);
        System.out.println("Введите местоположение издательства: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите автора");
        String tema = sc.next();
        setTheme(tema);
    }
    public String toString(){
        return ("\n\t"+"Издатель: "+getName() +"\n\t"+"Кол-во названий: "+getCount()+"\n\t"+"Местоположение издательства: "+getLocation()+"\n\t"
                + "Автор: " +theme);
    }
}
