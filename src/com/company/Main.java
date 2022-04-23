package com.company;

public class Main {

    public static void main(String[] args) {
// write your code here
        Kosmetica tint = new Kosmetica("letual", 15, 9);
        pokypatel nnn = new pokypatel("tint", 150, 15, "dasha", "123");
        nnn.pokkk();
        pocupatel2 mmm=new pocupatel2("bershka",1500,25,"anohin","1434");
        mmm.pokkk2();
        pocupatel3 ppp=new pocupatel3("air",1000,5,"lida","53647586");
        ppp.pokkk3();
    }
}
interface tovar{
    void tovarName();
    void price();
    void raiting();

}

class Kosmetica implements tovar{
    String gubnushka;
    int cena;
    int rait;
    Kosmetica(String gubnushka, int cena, int rait){
        this.gubnushka=gubnushka;
        this.cena=cena;
        this.rait=rait;
    }

    public void tovarName(){
        System.out.println(gubnushka);
    }

    public void price(){
        System.out.println(cena);
    }


    public void raiting(){
        System.out.println(rait);
    }
}
class odejda implements tovar{
    String palto;
    int cena1;
    int raiti1;
    odejda( String palto,int cena1,int raiti1){
        this.palto=palto;
        this.cena1=cena1;
        this.raiti1=raiti1;
    }
    public void tovarName(){
        System.out.println(palto);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
}
class obuv implements tovar{
    String nike;
    int cena2;
    int raiti2;
    obuv(String nike,int cena2,int raiti2){
        this.nike=nike;
        this.cena2=cena2;
        this.raiti2=raiti2;
    }
    public void tovarName(){
        System.out.println(nike);
    }

    public void price(){
        System.out.println(cena2);
    }


    public void raiting(){
        System.out.println(raiti2);
    }
}
interface userss{
    void loginn();
    void passs();
}

class pokypatel implements userss, tovar{
    String gubnushka1;
    int cena1;
    int rait1;
    String logg;
    String pass;

    pokypatel(String gubnushka1, int cena1, int rait1, String logg, String pass){
        this.gubnushka1=gubnushka1;
        this.cena1=cena1;
        this.rait1=rait1;
        this.logg=logg;
        this.pass=pass;
    }

    public void tovarName(){
        System.out.println(gubnushka1);
    }
    public void raiting(){
        System.out.println(rait1);
    }
    public void price(){
        System.out.println(cena1);
    }

    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk(){
        System.out.println("User name: "+logg + " pokupaet " + gubnushka1);
    }
}
class pocupatel2 implements userss,tovar{
    String palto;
    int cena1;
    int raiti1;
    String logg;
    String pass;
    pocupatel2(String palto,int cena1,int raiti1,String logg,String pass){
        this.palto=palto;
        this.cena1=cena1;
        this.raiti1=raiti1;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(palto);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk2(){
        System.out.println("User name: "+logg + " pokupaet " + palto);
    }
}
class pocupatel3 implements userss,tovar{
    String nike;
    int cena2;
    int raiti2;
    String logg;
    String pass;
    pocupatel3(String nike, int cena2,int raiti2,String logg,String pass){
        this.nike=nike;
        this.cena2=cena2;
        this.raiti2=raiti2;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(nike);
    }

    public void price(){
        System.out.println(cena2);
    }
    public void raiting(){
        System.out.println(raiti2);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk3(){
        System.out.println("User name: "+logg + " pokupaet " + nike);
    }
}