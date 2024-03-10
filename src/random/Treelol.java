package random;

public class Treelol {
    public static void main(String[] args) {

    }
    class Tree {
        int  value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Tree(int value) {
            this.value = value;
        }
        public int sum() {
            int sum = value;
            if (left!= null) {
                sum += left.sum();
            }
            if (right!= null) {
                sum += right.sum();
            }
            return sum;
        }
    }
}
