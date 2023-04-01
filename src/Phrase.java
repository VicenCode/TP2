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

    public void ajouter( char c ) {
            if ( c == ' ' ){
                Mot nouveau = new Mot(" ");
                // finir
                nbMots++;
            }
            else {
                getMot(nbMots - 1).ajouter(c);
            }
    }

    public void ajouter(Mot mot) {
        if(premier == null)
            premier = mot;

        else{
            getMot(nbMots - 1).suivant = mot;
        }
        nbMots++;
    }

    public void ajouter(Phrase autre) {
        // Codez-moi!
    }

    public boolean inserer(char c, int indexMot, int indexLettre) {
        if(getMot(indexMot) == null || getLettre(indexLettre) == 0)
            return false;

        getMot(indexMot).inserer(c, indexLettre);
        return true;
    }

    public boolean inserer(Mot mot, int indexMot) {
        if(indexMot < 0 || indexMot > nbMots)
            return false;

        Mot motAIndex = getMot(indexMot);
        mot.suivant = motAIndex;
        getMot(indexMot - 1).suivant = mot;
        nbMots++;
        return true;
    }

    public boolean inserer(Phrase autre, int indexMot) {
        // Codez-moi!
        return true;
    }

    @Override
    public String toString() {
        String resultat = "";
        Mot courant = premier;

        while(courant != null){
            resultat += courant + " ";
            courant = courant.suivant;
        }

        return resultat;
    }

    //GETTERS:
    public int getNbMots() {
        return nbMots;
    }

    public int getLongueur() {
        return this.toString().length();
    }

    public Mot getMot(int indexMot) {
        if(indexMot < 0 || indexMot > nbMots)
            return null;

        int pos = 0;
        Mot courant = premier;
        while(courant != null) {
            if(pos == indexMot)
                break;
            courant = courant.suivant;
            pos++;
        }
        return courant; //-----A verifer
    }

    public char getLettre(int indexMot, int indexLettre) {
        Mot motRecherche = getMot(indexMot);
        return motRecherche.getLettre(indexLettre); //-----A COMPLETER...
    }

    public char getLettre(int indexLettre) {
        return this.toString().charAt(indexLettre); //-----A COMPLETER...
    }

}
