package uke40uni;

class Person1{
    public String navn1;
    public int fodselsar1;
    public int alder1(int arstall1){
        int alderEks=arstall1-fodselsar1;
        return alderEks;
    }
}
public class returnEksempel {
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.navn1="Line Lensen";
        person1.fodselsar1=1999;
        int alderEks= person1.alder1(2022);
        System.out.println(person1.navn1+" er "+alderEks+" år.");
    }
}
