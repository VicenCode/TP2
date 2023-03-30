// VOUS POUVEZ MODIFIER CE FICHIER

public class Phrase {
    private Mot premier, dernier;
    private int nbMots;

    public Phrase() {
        // N'hésitez pas à modifier ce constructeur au besoin.
        // Vos changements seront automatiquement appliqués au constructeur ci-dessous.
        premier = dernier = null;
        nbMots = 0;
    }

    public Phrase(String str) {
        // Cette fonction initialise la phrase en ajoutant chaque mot de 'str' un par un.
        // Vous devrez coder la méthode ajouter(Mot mot) pour que cela fonctionne.
        this();
        String[] mots = str.split("\s");
        for (String mot : mots)
            ajouter(new Mot(mot));
    }

    public void ajouter(String str) {
        ajouter(new Phrase(str));
    }

    public boolean inserer(String str, int indexMot) {
        return inserer(new Phrase(str), indexMot);
    }

    // AJOUTEZ VOTRE CODE CI-DESSOUS

    public void ajouter(Mot mot) {
        // Codez-moi!
    }

    public void ajouter(Phrase autre) {
        // Codez-moi!
    }

    public boolean inserer(Phrase autre, int indexMot) {
        // Codez-moi!
        return true;
    }
}
