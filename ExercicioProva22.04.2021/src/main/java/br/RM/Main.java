package br.RM;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main( String[] args ){
        Main main = new Main();
        //implementar switch case
        // answer01
//        String[] words = new String[]{"aboffiato", "accio"};
//        String[] answer01 = main.answer01(words);
//
//        for (String index : answer01) {
//            System.out.println(index);
//        }

        // answer02
//        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
//        if(num>0){
//            int number = main.answer02(num);
//            System.out.println("Resposta N: " + number);
//        }
//        else{
//            System.out.println("Sem resposta (-1)");
//        }

        // answer03
//        char[][] words = { {'c','o','r','a','g','e','m'}, {'o','r','g','u','l','h','o'}, {'a','l','e','g','r','i','a'}, {'a','c','e','s','s','a','r'},
//                {'a','s','p','e','c','t','o'}, {'s','i','m','p','l','e','s'}, {'d','e','f','i','n','i','r'}
//        };
//
//        String word = main.answer03(words);
//        System.out.println(word);

        // answer04
//        DecimalFormat myFormat = new DecimalFormat(".00");
//        double value = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário bruto: "));
//        if(value>0){
//            double[] number = main.answer04(value);
//            System.out.println("Contribuição INSS mensal: " + myFormat.format(number[0])
//                + "\nContribuição INSS anual: " + myFormat.format(number[1])
//                + "\nPessoas necessárias para suprir salário bruto: " + myFormat.format(number[2]));
//        }
//        else{
//            System.out.println("Valor invalido");
//        }

        // answer05
//        int[][] rebeldes = new int[0][];
//        int[][] imperio = new int[0][];
//        main.answer05(rebeldes, imperio);

        //answerExample
//        String sizeb = "";
//        Scanner scanner = new Scanner(System.in);
//
//        String str = "a12.334tyz.78x";

//        System.out.print("Insira o tamanho do arquivo em bytes: ");
//        sizeb = scanner.nextInt();

//        sizeb = JOptionPane.showInputDialog("Digite um numero: ");
//        sizeb = sizeb.replaceAll("[^\\d.]", "");

        //answer06
//        String word ="omissíssimo";
//        int result = main.answer06(word);
//        System.out.println(result);

        //answer07
//        int in = 12;
//        int[] resist = new int[]{1500,100,100,1500};
//        double[] result = main.answer07(in, resist);
//
//        for (double index: result) {
//            System.out.println(index);
//        }

        //questao01 // mesma do answer03

//        char[][] words = { {'c','o','r','a','g','e','m'}, {'o','r','g','u','l','h','o'}, {'a','l','e','g','r','i','a'}, {'a','c','e','s','s','a','r'},
//                {'a','s','p','e','c','t','o'}, {'s','i','m','p','l','e','s'}, {'d','e','f','i','n','i','r'}
//        };
//
//        String word = main.questao01(words);
//        System.out.println(word);

        //questao02
//        String[] placas = new String[]{"YUL4149", "JDK0808", "NES2176", "ESP8266", "IBM4680", "YES9091"};
//        char[] caracteres = new char[]{'Y','1','L'};
//        String[] resposta = main.solucao02(placas, caracteres);
//
//        for (String index : resposta) {
//            System.out.println(index);
//        }

        //questao03
//        int altura = 10;
//        main.questao03(altura);

        //questao04
//        int[][] arrayDePontos = new int[][]{{3,3},{2,2}};
//        int[] ponto = new int[]{1,1};
//        int[] resposta = main.questao04(arrayDePontos, ponto);
//
//        for (int index: resposta ) {
//            System.out.print(index);
//            System.out.print(",");
//        }

        //questao05 // mesma da answer07

//        int in = 12;
//        int[] resist = new int[]{1500,100,100,1500};
//        double[] result = main.questao05(in, resist);
//
//        for (double index: result) {
//            System.out.println(index);
//        }

    }

    public String[] answer01(String[] words){
        String[] newWords = new String[words.length];
        char[] characters;
        String word = "";
        for (int i = 0 ; i < words.length; i++) {
            characters = words[i].toCharArray(); //aboffiato, accio,
            for (int j = 0; j < words[i].length(); j++) {
                if(j+1 != words[i].length()){
                    if (characters[j] == characters[j+1]) {
                        j++;
                    }
                }
                word = word + (characters[j]); // a + b
            }
            newWords[i] = word;
            word = "";
        }
        return newWords;
    }

    public int answer02(int n){

        int perfectSquare = 0;

        for (int i = 1 ; i <= n; i++){

            perfectSquare = i * i; // quadrado perfeito
            float sum = perfectSquare + n; //float pois inteiro no if acaba sendo arredondado

            for(int j = 1 ; j <= n; j++){
                if (((sum / j) == j) && n>= perfectSquare) { // um quadrado perfeito que é menor que n e se o resultado dividido por um numero, resultar no mesmo numero, significa que é um quadrado perfeito
//                    System.out.println("Quadrado Perfeito: " + perfectSquare + "\nnumero: " + n);
//                    System.out.println("Resultado:" + sum + " é perfeito");
//                    System.out.println("j:" + j);
                    return perfectSquare;
                }
            }
        }
        return -1;
    }

    public String answer03(char[][] words){

        String word = "";

        for (int i = 0; i < words.length; i++) {
            word = word + words[i][i];
            //System.out.println(words[i][i]);
        }
        //System.out.println(word);

        return word;
    }

    public double[] answer04(double value){

        double[] values = new double[3];

        if(value <= 1045.00){
            values[0] = (value * 7.50) / 100.00;
            values[1] = values[0] * 13.3;
            values[2] = value / values[0];
        }
        else if (value >= 1045.01 && value <= 2089.60){
            values[0] = (value * 9) / 100.00;
            values[1] = values[0] * 13.3;
            values[2] = value / values[0];
        }
        else if (value >= 2089.61 && value <= 3134.40){
            values[0] = (value * 12) / 100.00;
            values[1] = values[0] * 13.3;
            values[2] = value / values[0];
        }
        else if (value >= 3134.41){
            values[0] = (value * 14) / 100.00;
            values[1] = values[0] * 13.3;
            values[2] = value / values[0];
        }

        return values;
    }

    public String answer05(int[][] rebeldes, int[][] imperio) {

        String answer = "";
        int countimp = 0;
        int countreb = 0;

        for(int i = 0; i < rebeldes.length; i++){
            int x0 = rebeldes[i][0];
            int x1 = imperio[i][0];
            int y0 = rebeldes[i][1];
            int y1 = imperio[i][1];

            double D = Math.sqrt(((x1 - x0)*(x1 - x0)) + ((y1 - y0)*(y1 - y0)));

            if (D <= 5) {
                countimp++;
            }else{
                countreb++;
            }

        } if(countimp > countreb) {
            answer = "Império Galáctico";
        } else if(countreb > countimp){
            answer = "Aliança Rebelde";
        } else {
            answer = "Empate";
        }

        return answer;
    }

    public double answerExample(double a){

        if (a < 1024) {
            System.out.println(String.format("%.2f", a) + " B");
        }
        else if((a >= 1024) && (a < 1024000)) {
            System.out.println(String.format("%.2f", a / 1000) + " KB");
        }
        else if((a >= 1024000) && (a < 1024000000)) {
            System.out.println(String.format("%.2f", a / 1000000) + " MB");
        }
        else if(a >= 1024000000) {
            System.out.println(String.format("%.2f", a / 1000000000) + " GB");
        }

        return a;
    }

    public int answer06(String word){
        char[] characters = word.toCharArray();
        int result = 0;
        int num = characters.length-1;
        for (int i = 0; i < word.length()/2; i++) {
            if (characters[i] == characters[num]) {
                result++;
            }
            else{
                break;
            }
            num = num - 1;
        }
        return result;
    }

    public double[] answer07(int in, int[] resist){
        double nume = 0 , deno = 0;
        int output = resist.length - 1;
        double[] result = new double[output];

        for (int i = 0; i < resist.length; i++) { // denominador
            deno = deno + resist[i];
        }

        nume = deno; // numerador

        for (int i = 0; i < output; i++) {
            nume = nume - resist[i];
            result[i] = in*(nume/deno);
        }

        return result;
    }

    public String questao01(char[][] matriz) { // pegar a proxima letra da posição da matriz e formar uma palavra

        String word = "";

        for(int i=0; i < matriz.length ;i++){ //laço até o final da palavra
            word=word+matriz[i][i]; // inseri a letra na string
        }

        return word;
    }

    public String[] questao02(String[] placas, char[] caracteres) { // pesquisar placas na matriz
        String[] resposta = new String[placas.length]; // observação: na prova foi usado 0 e funcionou...
        char[] placa;

        for (int i = 0 ; i < placas.length; i++) {
            placa = placas[i].toCharArray(); // recebo a placa em letras
            int counter = 0;
            for (int j = 0; j < caracteres.length; j++) {
                char letra = caracteres[j];
                for (int k = 0; k < placa.length; k++) {
                    if(letra == placa[k]){
                        counter++;
                    }
                }
            }
            if(counter==caracteres.length){
                resposta[i]=placas[i];
            }
        }

        return resposta;
    }

    public String questao03(int altura) { // printar um triangulo de 0 e 1's
        String triangulo = "";
        int coluna = (2*altura) - 1;
        int linha = altura;

        int[][] matriz = new int[linha][coluna];
        int valorInicial = altura - 1;
        int valorFinal = altura - 1;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if(j >= valorInicial && j <= valorFinal) {
                    triangulo += "1";
                }
                else {
                    triangulo += "0";
                }
            }
            valorFinal++;
            valorInicial--;
            if(i < altura - 1) {
                triangulo += '\n';
            }
        }
        return triangulo;
    }

    public int[] questao04(int[][] arrayDePontos, int[] ponto) { // calcular a distancia entre 2 pontos com matriz e array

        double sub = 0;
        double quad = 0;
        double sum = 0;
        double[] raizes = new double[arrayDePontos.length];

        double raizmenor = 0;
        int[] resposta = new int[2];

        for (int i = 0; i < arrayDePontos.length; i++) { // laço do tamanho de array de pontos
            sum=0;
            System.out.println("raiz: " + (i+1));
            for (int j = 0; j < ponto.length; j++) {
                sub = ponto[j] - arrayDePontos[i][j]; // calculo de subtração
                quad = Math.pow(sub, 2); // calculo da subtração ao quadrado
                sum = sum + quad; // soma dos dois ou mais calculos ao quadrado
                System.out.println(ponto[j] + "-" + arrayDePontos[i][j]);
            }

            raizes[i] = Math.sqrt(sum);
            System.out.println(raizes[i]);
            System.out.println("-------------------");

            if (raizmenor==0){ // comparação
                raizmenor = raizes[i]; // atribuição
            }
            if(raizmenor>raizes[i]){
                raizmenor=raizes[i];
            }

        }

        //System.out.println(raizmenor);

        for (int i = 0; i < raizes.length; i++) {
            for (int j = 0; j < raizes.length; j++) {
                if(raizmenor==raizes[i]){
                    resposta[j]=arrayDePontos[i][j];
                }
            }
        }

        return resposta;
    }

    public double[] questao05(int tensao, int[] resistores) { // calculo de tensao e resistores

        double[] resultado = new double[resistores.length - 1]; // Inicialização do array de saída com tamanho de uma unidade menor que o array de resistores
        double nume = 0; // numerador
        double deno = 0; // denominador
        int output = resistores.length - 1; // quantidade de saídas

        for(int i = 0 ; i < resistores.length; i++){ // calcular denominador
            deno = deno + resistores[i]; // calculo denominador
        }

        nume = deno; // numerador recebe valor de denominador

        for(int i = 0; i < output; i++){ // calculo inteiro
            nume = nume - resistores[i]; // calcular numerador
            resultado[i] = tensao*(nume/deno); // calculo principal
        }

        return resultado;
    }

}
