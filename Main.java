/*
* Anderson Borges
* André Pires
* Bruno Henrique
* Jade Soares
* Jefferson Mendes
* Thiago Freitas
*/

import entities.Pet;

public class Main {

    public static void main(String[] args) {

        Pet d1 = new Pet();

        d1.setNome("Bob");
        d1.setRaca("Vira-lata");
        d1.setAnoNasc(2000);
        d1.setPeso(2.0);
        d1.setChip(false);
        d1.setCondicao(false);

        System.out.println("Nome do doguinho: " + d1.getNome());
        System.out.println("Raça do doguinho: " + d1.getRaca());
        System.out.println("Ano de nascimento do doguinho: " + d1.getAnoNasc());
        System.out.println("Peso do doguinho: " + d1.getPeso());
        System.out.println("Possui chip: " + d1.isChip());
        System.out.println("Está ferido: " + d1.isCondicao());

        d1.encaminha(d1.isCondicao(), d1.getPeso());

    }

}
