public class Main {
    public static void main(String[] args){
        Holding myShop = new  Holding();
        Gazeta m1 = new Gazeta("СССР",1,"СССР","Н.Г.Полетаев");
        System.out.println(m1.toString());
        Telekanal b1 = new Telekanal ("История",2,"B2","C2");
        System.out.println(b1.toString());
        myShop.addPub(m1);
        myShop.addPub(b1);
        myShop.printPub();
    }
}