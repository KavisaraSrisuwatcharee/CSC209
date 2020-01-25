package sample;

public class AnimalPark {
    Cage[] cages;
    int amoutOfCages;
    public AnimalPark(int maxCages){
        this.amoutOfCages=0;
        cages= new Cage[maxCages];
    }
    public void  addCage(Cage c){
        if(amoutOfCages < cages.length){
            cages[amoutOfCages] =c;
            amoutOfCages++;
        }else{
            System.out.println("Zoo has too many cages already! Too crowded for animals");
        }
    }
    public void printAllAnimalNameAndType(){
        for(int i=0;i<amoutOfCages;i++){
            System.out.println(cages[i].material+" "+(i+1));
            for(int j=0;j<cages[i].amountOfAnimals;j++){
                System.out.println(cages[i].animals[j].getName()+": "+cages[i].animals[j].getType());
            }
        }
    }
}
