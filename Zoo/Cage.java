package sample;

public class Cage {
    int length, width, depth;
    String material;
    double latitude, longitude;
    String groundType;
    Animal[] animals;
    int amountOfAnimals;
    public Animal[] getAnimals() {
        return animals;
    }
    public int getDepth() {
        return depth;
    }
    public String getGroundType() {
        return groundType;
    }
    public double getLatitude() {
        return latitude;
    }
    public int getLength() {
        return length;
    }
    public double getLongitude() {
        return longitude;
    }
    public String getMaterial() {
        return material;
    }
    public int getWidth() {
        return width;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void setGroundType(String groundType) {
        this.groundType = groundType;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public Cage(int capacity) {
        this(0, 0, 0, "Steel", 10.1234, 100.1111, "dirt", capacity);

    }

    public Cage(int length, int width, int depth, String material, double latitude, double longitude, String groundType,
                int capacity) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.material = material;
        this.latitude = latitude;
        this.longitude = longitude;
        this.groundType = groundType;
        animals = new Animal[capacity];
        amountOfAnimals = 0;
    }

    public void addAnimal(Animal newAnimal) {
        if (amountOfAnimals < animals.length) {
            animals[amountOfAnimals] = newAnimal;
            amountOfAnimals++;
        } else {
            System.out.println("Cage is full");
        }
    }

    public void printALLAnimals() {
        System.out.println(material + " cage:");
        for (int i = 0; i < amountOfAnimals; i++) {
            System.out.println(animals[i].toString());
        }
    }
}

