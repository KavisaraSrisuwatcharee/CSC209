package sample;

public class Contro {
    public static void main(String[] args) {
        Fraction a1=new Fraction(4,2);
        Fraction a2=new Fraction(1,5);
        System.out.println("Add : "+a1.Add(a2));
        System.out.println("Substract : "+a1.Subtract(a2));
        System.out.println("Muti : "+a1.Multiply(a2));
        System.out.println("Divide : "+a1.Divide(a2));
        System.out.println("Reduce : "+a1.Reduce());
    }
}
class Fraction{
    int fact;
    int part;
    public Fraction(int fact,int part){
            this.fact = fact;
            this.part = part;
    }
    public int getFact() {
        return fact;
    }
    public void setFact(int fact) {
        this.fact = fact;
    }
    public int getPart() {
        return part;
    }
    public void setPart(int part) {
        this.part = part;
    }
    public String toString(){
        if(this.part == 0) return "can't divide by zero";
        return ""+fact+"/"+part;
    }
    public Fraction Add(Fraction f){
        int newAdd1=(this.fact*f.getPart())+(f.getFact()*this.part);
        int newAdd2=this.part*f.getPart();
        return new Fraction(newAdd1,newAdd2).Reduce();
    }
    public Fraction Subtract(Fraction f){
        int newSub1=(this.fact*f.getPart())-(f.getFact()*this.part);
        int newSub2=this.part*f.getPart();
        return new Fraction(newSub1,newSub2).Reduce();
    }
    public Fraction Multiply(Fraction f){
       int newMuti1=this.fact*f.getFact();
       int newMuti2=this.part*f.getPart();
       return new Fraction(newMuti1,newMuti2).Reduce();
    }
    public Fraction Divide(Fraction f){
        int newDi1=this.fact*f.getPart();
        int newDi2=this.part*f.getFact();
        return new Fraction(newDi1,newDi2).Reduce();
    }
    public Fraction Reduce(){
        int newFact=this.fact;
        int newPart=this.part;
        if(newFact<newPart){
                for (int i = 2; i < newPart; i++) {
                  while(newPart%i==0 && newFact%i==0){
                      newFact=newFact/i;
                      newPart=newPart/i;
                  }

                }
        }else{
                for(int i=2;i<newFact;i++) {
                    while(newPart%i==0 && newFact%i==0){
                        newFact=newFact/i;
                        newPart=newPart/i;
                    }
                }
        }
        return new Fraction(newFact,newPart);
    }
}

