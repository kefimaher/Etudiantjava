public class Etudiant {
        private int id;
        private String nom;
        private String prenom;

        public Etudiant() {
            this.id = 0;
            this.nom = "";
            this.prenom = "";
        }

        public Etudiant(int id, String nom, String prenom) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
        }

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Etudiant etudiant = (Etudiant) obj;
            return id == etudiant.id;
        }

        @Override
        public String toString() {
            return "Etudiant{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }
    }


