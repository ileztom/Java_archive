class Human {
    String Name;

    public void setName(String name) {
        this.Name = Name;
    }
    public String getName() {return this.Name;}
}
public class Main3 {
    public static void main(String[] args){
        Human human = new Human();
        human.setName("John");
        System.out.println(human.getName());
    }
}
