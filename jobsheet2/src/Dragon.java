public class Dragon {
    int x, y, width, height;

    public Dragon(){
        
    }
    public Dragon(int x, int y, int width, int height){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x += 1;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Position: " + "(" + x + "," + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("GAME OVERRR!!");
        System.exit(0);
    }
}
