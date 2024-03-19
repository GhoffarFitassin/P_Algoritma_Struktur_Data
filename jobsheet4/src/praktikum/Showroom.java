package praktikum;

public class Showroom {
    int[] acceleration;
    int[] power;

    Showroom(int[] acc, int[] pow){
        acceleration = acc;
        power = pow;
    }

    
    int highest_Acceleration(){
        return findHighestAcceleration(0, acceleration.length - 1);
    }

    int findHighestAcceleration(int start, int end) {
        if (start == end) {
            return acceleration[start];
        } else {
            int mid = (start + end) / 2;
            int left = findHighestAcceleration(start, mid);
            int right = findHighestAcceleration(mid + 1, end);
            return Math.max(left, right);
        }
    }

    int lowest_Acceleration(){
        return findLowestAcceleration(0, acceleration.length - 1);
    }

    int findLowestAcceleration(int start, int end){
        if (start == end) {
            return acceleration[start];
        } else {
            int mid = (start + end) / 2;
            int left = findLowestAcceleration(start, mid);
            int right = findLowestAcceleration(mid + 1, end);
            return Math.min(left, right);
        }
    }

    int rata_power(){
        int rata = 0;
        int temp = 1;
        for (int i = 0; i < power.length; i++) {
            temp += power[i];
        }
        rata = temp / power.length;
        return rata;
    }
}
