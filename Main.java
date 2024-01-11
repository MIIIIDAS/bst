public class Main {
    int data;
    Main left;
    Main right;

    public Main(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(int data) {
        if (data < this.data) {
            if (this.left == null) {
                this.left = new Main(data);
            } else {
                this.left.insert(data);
            }
        } else if (data > this.data) {
            if (this.right == null) {
                this.right = new Main(data);
            } else {
                this.right.insert(data);
            }
        }
    }

    public boolean contains(int data) {
        if (data == this.data) {
            return true;
        } else if (data < this.data) {
            if (this.left == null) {
                return false;
            } else {
                return this.left.contains(data);
            }
        } else {
            if (this.right == null) {
                return false;
            } else {
                return this.right.contains(data);
            }
        }
    }

    public static void main(String[] args) {
        // Przykłady testowe
        Main root = new Main(10);

        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);

        System.out.println(root.contains(7));
        System.out.println(root.contains(20));
        System.out.println(root.contains(3));
        System.out.println(root.contains(12));
        System.out.println(root.contains(10));
    }
}
