public class Main {
    public static void main(String[] args) {
        int count=0;
        int a,b=1, c=2;
        double r=1.4;
        float rr=1.4f;
        boolean trueFalse=true;
        String str="nigger";
        char cc='r';
        char ccc=143;

        if (true) System.out.println(str);
        for (int i = 0; i<10; i++){
            System.out.print(i +" " );
        }
        int i=0;
        while (i<10){
            System.out.print(i +" " );
            i++;
        }
        Human humanDima = new Human(19, 1.7, 60.2);
        Human humanOlga = new Human(19, 1.8, 55);
        System.out.println(humanOlga.this.age);



        System.out.println();
    }
}