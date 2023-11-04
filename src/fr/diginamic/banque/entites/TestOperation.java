package fr.diginamic.banque.entites;

public class TestOperation {

    public static void main(String[] args) {
        // Créez un tableau d'opérations avec au moins 4 opérations de crédits et de débits
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2023-11-01", 500.0);
        operations[1] = new Debit("2023-11-02", 200.0);
        operations[2] = new Credit("2023-11-03", 300.0);
        operations[3] = new Debit("2023-11-04", 100.0);

        // Affichez les informations des opérations (date, montant, et type)
        for (Operation operation : operations) {
            System.out.println("Date: " + operation.getDate());
            System.out.println("Montant: " + operation.getMontant());
            System.out.println("Type: " + operation.getType());
        }

        // Calculez le montant global de toutes les opérations
        double montantGlobal = 0.0;
        for (Operation operation : operations) {
            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }
        }

        System.out.println("Montant global des opérations : " + montantGlobal);
    }
}
