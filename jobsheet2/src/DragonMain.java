import java.util.Scanner;

public class DragonMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String movement;

        Dragon draco = new Dragon(0, 0, 10, 10);
        System.out.println("Tutorial:");
        System.out.println("W to Move up");
        System.out.println("A to Move left");
        System.out.println("S to Move Down");
        System.out.println("D to Move Right");
        while (true) {
            draco.printPosition();
            System.out.print("Do U Know Da Way?: ");
            movement = inp.nextLine();
            switch (movement) {
                case "w" -> {
                    draco.moveUp();
                    break;
                }
                case "a" -> {
                    draco.moveLeft();
                    break;
                }
                case "s" -> {
                    draco.moveDown();
                    break;
                }
                case "d" -> {
                    draco.moveRight();
                    break;
                }
                default -> {
                    System.out.println("Input not Available");
                    break;
                }
            }
        }

    }
}
