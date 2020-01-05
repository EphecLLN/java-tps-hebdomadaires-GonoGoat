public class AccountOwner {

    public static void main(String[] args) {
        final BankAccount compte = new BankAccount();
        Salary salaire = new Salary(compte);
        BankCard card = new BankCard(compte);

        salaire.run();
        card.run();
        System.out.println(compte.getAmount());
    }
}
