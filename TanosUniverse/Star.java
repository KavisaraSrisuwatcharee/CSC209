package TanosUniverse;

import java.util.Vector;

public class Star {
    private int starNumber;
    private boolean hasLight;
    Vector <String> material;
    private double age;
    private double diameter;
    private double maxTemperature,minTemperature;
    public Star(int starNumber,boolean hasLight,double age, double diameter,double maxTemperature,double minTemperature){
        this.starNumber=starNumber;
        this.hasLight=hasLight;
        this.age=age;
        this.diameter=diameter;
        this.maxTemperature=maxTemperature;
        this.minTemperature=minTemperature;
        material =new Vector<String>();
    }
    public Star(){
        starNumber=0;
        hasLight=false;
        material=new Vector<>(10);
        age=1000000;
        diameter=20000;
        maxTemperature=100;
        minTemperature=0;
    }
    public int getStarNumber() {
        return starNumber;
    }
    public void setStarNumber(int starNumber) {
        this.starNumber = starNumber;
    }

    public boolean isHasLight() {
        return hasLight;
    }

    public void setHasLight(boolean hasLight) {
        this.hasLight = hasLight;
    }
    public String getMaterial(int i) {
        String m="";
        for (int j=0;j<material.size();j++){
            if(i==j){
                m=material.get(j);
            }
        }
        return m;
    }
    public String getAllMaterial(){
        String allMat="";
        for(String x:material){
            allMat+=(", "+x);
        }
        return allMat;
    }
    public void addMaterial(String mat){
        material.add(mat);
    }
    public double getVolume(){
        return (4/3)*Math.PI*Math.pow(diameter/2,3);
    }
    public void setMaterial(Vector<String> material) {
        this.material = material;
    }
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    @Override
    public String toString() {
        return "Star{" +
                "starNumber=" + starNumber +
                ", hasLight=" + hasLight +
                ", material=" + material +
                ", age=" + age +
                ", diameter=" + diameter +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }
}
