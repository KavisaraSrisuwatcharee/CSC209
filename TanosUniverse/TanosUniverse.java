package TanosUniverse;

public class TanosUniverse {
    public static void main(String[] args) {
        Star earth =new Star(3,false,4000000000.0,20000,100.0,0.0);
        System.out.println(earth.getVolume());
        earth.addMaterial("Nitrogen");
        earth.addMaterial("water");
        earth.addMaterial("Carbon");
        System.out.println(earth.getMaterial(1));
        System.out.println(earth.getAllMaterial());

        Star Venus=new Star(2,false,3000000000.0,15000,300.0,100.0);
        Star Sun=new Star(0,true,10000000000000.0,60000,30000.0,150000.0);
        Sun.addMaterial("Hydrogen");
        Sun.addMaterial("Herium");
        Sun.addMaterial("Oxigen");
        Venus.addMaterial("Iron");
        Venus.addMaterial("Captain Marvel");
        System.out.println(Venus.toString());
        Universe solarSystem=new Universe();
//        solarSystem.addStar(Sun);
//        solarSystem.addStar(earth);
//        solarSystem.addStar(Venus);
        System.out.println("Show all Stars");
        solarSystem.printAllStars();
        solarSystem.readStarFromFile(0);
        System.out.println("Diameter test");
        System.out.println(solarSystem.getDiameter(2));
    }
}
