package BasicQus;

class swapping{

    public static void main(String[] args) {
        int x, y, z;
        x=5;
        y=3;

        // before swapping
        System.out.println("before swapping: " + x + " " + y);

        z=x;
        x=y;
        y=z;

        // after swapping
        System.out.println("after swapping: "+ x + " " + y);
    }
}