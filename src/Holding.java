import java.util.ArrayList;
public class Holding {
    private ArrayList<SMI> masPub = new ArrayList<SMI>();
    public void addPub(SMI m){
        masPub.add(m);
    }
    public Boolean findPub(SMI m){
        return masPub.contains(m);
    }
    public Holding(){
    }
    public Holding(ArrayList<SMI> n){
        masPub=n;
    }
    public void printPub(){
        System.out.println("В холдинге: ");
        for(SMI p:masPub){
            System.out.println("\t"+p.toString());
        }
        printCount();
    }
    public void printCount(){
        int b = 0;
        int m = 0;
        for(SMI p:masPub){
            if(p instanceof Gazeta){
                b+=1;
            } else if (p instanceof  Telekanal) {
                m+=1;
            }
        }
        System.out.println("В холдинге: "+b+" Телеканалы и "+m+" Газеты");
    }
}
