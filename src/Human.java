public class Human {
    private int age;
    private double height;
    private double weight;

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

