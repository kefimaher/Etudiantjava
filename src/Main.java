    public class Main {
        public static void main(String[] args) {
            Etudiant etudiant1 = new Etudiant(1, "Eya", "Riyahi");
            Etudiant etudiant2 = new Etudiant(2, "Kefi", "Maher");
            Etudiant etudiant3 = new Etudiant();

            System.out.println("Etudiant 1 : " + etudiant1);
            System.out.println("Etudiant 2 : " + etudiant2);
            System.out.println("Etudiant 3 : " + etudiant3);

            // Tester les méthodes getId(), getNom(), getPrenom()
            System.out.println("ID d'Etudiant 1 : " + etudiant1.getId());
            System.out.println("Nom d'Etudiant 1 : " + etudiant1.getNom());
            System.out.println("Prénom d'Etudiant 1 : " + etudiant1.getPrenom());

            // Tester les méthodes setId(), setNom(), setPrenom()
            etudiant3.setId(3);
            etudiant3.setNom("Kefi");
            etudiant3.setPrenom("Maher");
            System.out.println("Etudiant 3 après modification : " + etudiant3);

            // Tester la méthode equals()
            System.out.println("Etudiant 1 est égal à Etudiant 2 : " + etudiant1.equals(etudiant2));
            System.out.println("Etudiant 1 est égal à Etudiant 3 : " + etudiant1.equals(etudiant3));
        }
    }

