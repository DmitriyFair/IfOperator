public class IfOperator {
    public static void main(String[] args) {
        int sumInWallet = 500;
        if (sumInWallet > 500) {
            System.out.println("You can buy a pizza!");
        } else if (sumInWallet <= 500 && sumInWallet > 300) {
            System.out.println("You can buy a hamburger!");
        }
        else if (sumInWallet <= 300 && sumInWallet >= 100 ) {
            System.out.println("You just can buy mac&cheese");
        }
        else {
            System.out.println("Sorry... You can't buy anything");
        }
    }
}
