package uke40uni;

class Person{
    public String navn;
    public int fodselsar;

    public void alder(){
        int alder = 2022-fodselsar;
        System.out.println(alder+" år");
    }
}

public class EksempelPerson     {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.navn="Line Lensen";
        person1.fodselsar=1999;
        System.out.println(person1.navn+" er"   );
        person1.alder();
    }
}
