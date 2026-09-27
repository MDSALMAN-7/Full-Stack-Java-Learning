package Day03Variables;

class ResearchScope {

    int amountToBeTxn;

    public static void main(String args[]) {

        int balance = 200;

        ResearchScope obj = new ResearchScope();

        obj.amountToBeTxn = 10;

        System.out.println("Balance is : " + balance);
        System.out.println("Transaction amount : " + obj.amountToBeTxn);
    }
}