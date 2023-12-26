package classesAndObjects;

class rectangle{
    int length,breadth;
    int area(int l,int b){
        return l*b;
    }
}

public class classes {
    public static void main(String[] args) {
        rectangle rect=new rectangle();
        int area=rect.area(5,4);
        System.out.println(area);
    }
}
