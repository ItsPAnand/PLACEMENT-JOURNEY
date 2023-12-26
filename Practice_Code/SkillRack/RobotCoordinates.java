package SkillRack;

public class RobotCoordinates {
    public static void main(String[] args) {
        String input="x2 y1 N3 E2 S1";
        String parts[]=input.split(" ");
        String X[]=parts[0].split("",2);
        String Y[]=parts[1].split("",2);
        int Xcoordinate=Integer.parseInt(X[1]);
        int Ycoordinate=Integer.parseInt(Y[1]);
        for(int i=2;i<parts.length;i++){
            String coordinate[]=parts[i].split("",2);
            String direction=coordinate[0];
            int distance=Integer.parseInt(coordinate[1]);
            switch(direction){
                case "N":
                case "n":
                    Ycoordinate+=distance;
                    break;
                case "E":
                case "e":
                    Xcoordinate+=distance;
                    break;
                case "W":
                case "w":
                    Xcoordinate-=distance;
                    break;
                case "S":
                case "s":
                    Ycoordinate-=distance;
                    break;
            }
        }

        System.out.println("X"+Xcoordinate+" "+"Y"+Ycoordinate);
    }
}
