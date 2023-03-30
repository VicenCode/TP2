// VOUS POUVEZ MODIFIER CE FICHIER

public class Mot {
    private char[] lettres;
    private int nbLettres;

    public Mot suivant = null;

    public Mot() {
        lettres = new char[0];
        nbLettres = 0;
    }

    public Mot(String str) {
        assert str.indexOf(' ') == -1 : "Un mot ne peut contenir d'espaces";
        lettres = str.toCharArray();
        nbLettres = str.length();
    }

    // AJOUTEZ VOTRE CODE CI-DESSOUS

}
