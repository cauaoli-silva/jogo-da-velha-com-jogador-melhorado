public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Nome: Cauã Oliveira Silva");

    System.out.print("Escolha seu símbolo (X ou O): ");

    char simboloHumano = sc.next().toUpperCase().charAt(0);

    char simboloMaquina = (simboloHumano == 'X') ? 'O' : 'X';

    Jogador jogador1 = new JogadorHumano(simboloHumano);

    Jogador jogador2 = new JogadorMaquina(simboloMaquina);

    Tabuleiro tabuleiro = new Tabuleiro();

    JogoDaVelha jogoDaVelha;

    jogoDaVelha = new JogoDaVelha(jogador1, jogador2, tabuleiro);

    jogoDaVelha.iniciar();

    sc.close();
}
