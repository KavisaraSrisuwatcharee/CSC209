package sample;

public class Zoo {
    public static void main(String[] args) {
        Animal a1=new Animal("jimmy",5,"grey","Rhino",'M');
        Animal a2=new Animal("Tommy",10,"black","seal",'M');
        Animal a3=new Animal("Opal",7,"white","bear",'F');
        System.out.println(a3.getColor());
        System.out.println(a3.getName()+" "+a3.getType());
        a1.setSex('F');
        a2.setColor("brown");
        System.out.println(a1.getSex()+" "+a2.getColor());
        Cage c1 = new Cage(20);
        c1.addAnimal(a1);
        c1.addAnimal(a2);
        c1.addAnimal(a3);
        c1.printALLAnimals();
        System.out.println(c1.animals[1].getName());
        System.out.println("--------------------------------------");
        AnimalPark park=new AnimalPark(10);
        park.addCage(c1);
        Animal a4=new Animal("jack",10,"Blue","Rhino",'F');
        Animal a5=new Animal("Bill",10,"Red","Parrot",'F');
        Cage c2=new Cage(5);
        c2.addAnimal(a4);
        c2.addAnimal(a5);
        park.addCage(c2);
        park.printAllAnimalNameAndType();

    }
}
