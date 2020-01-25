package sample;

public class Animal {
    String name;
    int age;
    String color;
    String type;
    char sex;
    public Animal(){
        name="No name";
        age=1;
        color="green";
        type="bear";
        sex='M';
    }
    public Animal(String n,int a,String c,String t,char s){
        this.name=n;
        this.age=a;
        this.type=t;
        this.setColor(c);
        this.setSex(s);
    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name=newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (type.equalsIgnoreCase("bear")) {
            if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("brown") || color.equalsIgnoreCase("black")){
                this.color=color;
            }
            System.out.println("This is not the color of bear");
        }
        else{
            this.color=color;
        }
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='M' || sex=='F'){
            this.sex=sex;
        }
    }
    public String toString() {
        return "Animal{" + " Name = " + name + ", Age = " + age + ", Type = " + type + ", Color = " + color + ", Sex = "
                + sex + "}";
    }
}
