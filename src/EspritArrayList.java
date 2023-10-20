import java.util.ArrayList;
import java.util.List;
class EspritArrayList implements University {
    private ArrayList<String> studentsArrayList = new ArrayList<>();


    public void addStudent(String studentName) {
        studentsArrayList.add(studentName);
    }

    public List<String> getStudents() {
        return new ArrayList<>(studentsArrayList);
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {

    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return false;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {

    }

    @Override
    public void displayEtudiants() {

    }

    @Override
    public void trierEtudiantsParId() {

    }

    @Override
    public void trierEtudiantsParNom() {

    }
}