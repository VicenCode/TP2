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

    public String toString (){
        String resultat;
        for(int i = 0; i < nbLettres; i++)
            resultat += lettres[i];

        return resultat;
    }

    public int getLongueur(){
        return nbLettres;
    }


    public char getLettre ( int index ){
        return lettres[index];
    }

    public void ajouter (char lettre){
        validerEspace();

        lettres[nbLettres] = lettre;
        nbLettres++;
    }

    public boolean inserer(char lettre, int index) {
        if(index < 0 || index > nbLettres)
            return false;

        validerEspace();
        lettres[index] = lettre;
        return true;
    }

    private void validerEspace() {
        if (nbLettres == lettres.length){
            char [] temp = agrandir();
            recopier(temp);
            lettres = temp;
        }
    }

    private char[] agrandir(){
        char [] temp = new char[lettres.length * 2 + 1];
        return temp;
    }

    private void recopier (char[] temp){
        for ( int i = 0; i < lettres.length; i++){
            temp[i] = lettres[i];
        }
    }

}
