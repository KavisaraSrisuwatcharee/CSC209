package TanosUniverse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class Universe {
    Vector<Star> starList;
    final String universefile="universe.data";
    public Universe(){
        starList=new Vector<Star>(10, 5);
    }
    public void addStar(Star s){
        starList.add(s);
        addStarToFile(s);
    }
    public Star getStar(int i){
        return starList.get(i);
    }
    public void printAllStars(){
        for(Star s:starList){
            System.out.println(s.toString());
        }
    }
    public void addStarToFile(Star s){
        try {
            RandomAccessFile raf=new RandomAccessFile(universefile,"rw");
            //starnumber (4 bytes)+haslight(1 byte)
            //+material (10 material * 20 bytes/material =200 bytes
            //age(8 bytes) + diameter(8 bytes) +maxTem (8 types) +minTem (8 types) Total is 237 bytes
            raf.seek(raf.length());
            raf.writeInt(s.getStarNumber());
            raf.writeBoolean(s.isHasLight());
            for(String m:s.material){
                byte[] materialInByte = new byte[20];
                materialInByte = m.concat("                                              ").getBytes();
                raf.write(materialInByte, 0 ,20);
            }
            for(int i=s.material.size();i<10;i++){
                byte[] emptyMaterialInByte = new byte[20];
                emptyMaterialInByte = "                                            ".getBytes();
                raf.write(emptyMaterialInByte, 0 ,20);
            }
            raf.writeDouble(s.getAge());
            raf.writeDouble(s.getDiameter());
            raf.writeDouble(s.getMaxTemperature());
            raf.writeDouble(s.getMinTemperature());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readStarFromFile(int i){
        try {
            RandomAccessFile readPointer =new RandomAccessFile(universefile,"r");
            //Jump to record i
            long locationOfI =237 * i;
            int starNum;
            readPointer.seek(locationOfI);
            starNum=readPointer.readInt();
            System.out.println(starNum);
            boolean light = readPointer.readBoolean();
            System.out.print(light?"Has light":"No light");
            byte[] material =new byte[20];
            for(int j=0;j<10;j++){
                readPointer.read(material,0,20);
                String m=new String(material);
                System.out.print("  "+ m.trim());
            }
            double age = readPointer.readDouble();
            double diameter= readPointer.readDouble();
            double maxTemp= readPointer.readDouble();
            double minTemp= readPointer.readDouble();
            System.out.println(age+" "+diameter+" "+maxTemp+" "+minTemp);
            readPointer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public double getDiameter(int i){ //get diameter of star i
        try {
            RandomAccessFile pointer=new RandomAccessFile(universefile,"r");
            pointer.seek(i*237+213);
            double dia=pointer.readDouble();
            pointer.close();
            return dia;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
