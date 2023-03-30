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



    }

    public int getLongueur(){

        return nbLettres;

    }


    public char getLettre ( int index ){
        return lettres[index];
    }

    public void ajouter ( char lettre ){

        if ( nbLettres == lettres.length){
            char [] temp = agrandir();

        }
    }


    private char[] agrandir(){
        char [] temp = new char[lettres.length * 2 + 1];
        return temp;
    }

    private void recopier (){
        char [] nouveau = new char[lettres.length];
        for ( int i = 0; i < lettres.length; i++){

        }

    }

}
