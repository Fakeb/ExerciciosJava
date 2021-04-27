
import java.util.ArrayList;
import java.util.Random;

public class Ordenacao {

    public static void popularLista(ArrayList<Aluno> lista, int qtd) {
//        Aluno a;
//        int numero;
        Random gerador = new Random();
        for (int i = 0; i < qtd; i++) {
//            numero = gerador.nextInt(1000);
//            a = new Aluno(numero);
//            lista.add(a);
            lista.add(new Aluno(gerador.nextInt(1000)));
        }
    }

    public static void exibirLista(ArrayList<Aluno> lista, String s) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("" + i + "  " + lista.get(i).matricula + " - " + s);
        }
    }

    public static void bolha(ArrayList<Aluno> lista) {
        boolean houveTroca;
        Aluno tmp;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).matricula > lista.get(i + 1).matricula) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }

    public static void selecao(ArrayList<Aluno> lista) {
        int i, j, posMenor;
        Aluno tmp;
        for (i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).matricula < lista.get(posMenor).matricula) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

    public static void insercao(ArrayList<Aluno> lista) {
        int i, j;
        Aluno tmp;
        for (i = 1; i < lista.size(); i++) {
            tmp = lista.get(i);
            for (j = i - 1; j >= 0 && lista.get(j).matricula > tmp.matricula; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(j + 1, tmp);
        }
    }
}

