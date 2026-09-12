import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variável utilizada para identificação do cliente
        int identificacao;

        //variável para identificar o serviço escolhido
        int servicoEscolhido;

        // Criando um novo cliente
        Cliente cliente1 = new Cliente();
        Servicos servico1 = new Servicos();

        // Novo scanner
        Scanner entrada = new Scanner(System.in);

        //mensagem de boas-vindas
        System.out.println("\n\n---------------Bem-vindo(a) ao BALNEÁRIO MÁRIO MOURÃO---------------\n");

        //apresenta o menu de identificação:
        menuIdentificacao();

        //lê a entrada para identificação do cliente
        do {
            System.out.print("Digite a opção desejada: ");
            identificacao = entrada.nextInt();
        }while(identificacao != 1 && identificacao != 2 && identificacao != 3);

        // identificação do cliente:
        identificaCliente(identificacao, cliente1);

        //apresenta o menu de serviços:
        menuServicos();

        //lê a entrada
        do {
            System.out.print("Digite a opção desejada: ");
            servicoEscolhido = entrada.nextInt();
            escolheServico(servicoEscolhido, cliente1, servico1);

        } while (servicoEscolhido < 1 || servicoEscolhido > 6);

        //mensagem final com o nome do serviço escolhido e o preço a ser pago:
        mensagemFinal(cliente1, servico1);

    }

    //menu de identificação:
    public static void menuIdentificacao(){
        System.out.println("Identifique-se:");
        System.out.println("1 - Morador local.");
        System.out.println("2 - Estudante.");
        System.out.println("3 - Turista.");

    }

    //menu de serviços:
    public static void menuServicos(){
        System.out.println("--------------- ESCOLHA O SERVIÇO ---------------");
        System.out.println("1 - Banho de imersão (20 min.).................R$ 30,00");
        System.out.println("2 - Banho de Aromaterapêutico (20 min.)........R$ 40,00");
        System.out.println("3 - Banho de Argila Detox (20 min.)............R$ 45,00");
        System.out.println("4 - Quick Massagem (15 min.)...................R$ 50,00");
        System.out.println("5 - Massagem c/ pedras quentes (50 min.).......R$ 90,00");
        System.out.println("6 - Limpeza de pele (90 min.)..................R$ 100,00");
    }

    //identificação do cliente:
    public static void identificaCliente(int identificacao, Cliente cliente1){
        switch (identificacao) {
            case 1 -> {
                System.out.println("1 - Morador local\n");
                System.out.println("-----------------------------------------------");
                System.out.println("Você tem desconto em nossos serviços!Aproveite!");
                System.out.println("-----------------------------------------------\n\n");
                cliente1.setTipo(1);
                cliente1.setDescricao("Morador local");
                cliente1.setTemDesconto(true);
            }
            case 2 -> {
                System.out.println("2 - Estudante\n");
                System.out.println("-----------------------------------------------");
                System.out.println("Você tem desconto em nossos serviços!Aproveite!");
                System.out.println("-----------------------------------------------\n\n");
                cliente1.setTipo(2);
                cliente1.setDescricao("Estudante");
                cliente1.setTemDesconto(true);
            }
            case 3 -> {
                System.out.println("3 - Turista\n");
                cliente1.setTipo(3);
                cliente1.setDescricao("Turista");
                cliente1.setTemDesconto(false);
            }
            default -> System.out.println("Digite um código válido.\n");
        }
    }

    //identificação do serviço escolhido:
    public static void escolheServico(int servicoEscolhido, Cliente cliente1, Servicos servico1){
        //atribui nome do serviço
        //atribui preço do serviço
        switch (servicoEscolhido) {
            case 1 -> {
                servico1.setNome("Banho de imersão (20 min.)");
                servico1.setPreco(30);
            }
            case 2 -> {
                servico1.setNome("Banho de Aromaterapêutico (20 min.)");
                servico1.setPreco(40);

            }
            case 3 -> {
                servico1.setNome("Banho de Argila Detox (20 min.)");
                servico1.setPreco(45);
            }
            case 4 -> {
                servico1.setNome("Quick Massagem (15 min.)");
                servico1.setPreco(50);
            }
            case 5 -> {
                servico1.setNome("Massagem c/ pedras quentes (50 min.)");
                servico1.setPreco(90);
            }
            case 6 -> {
                servico1.setNome("Limpeza de pele (90 min.)");
                servico1.setPreco(100);
            }
            default -> {
                //mensagem de erro caso a entrada seja inválida e solicita nova entrada.
                System.out.println("\nServiço inválido.");
                System.out.println("\nPor favor, tente novamente.\n");
            }
        }//fim do switch-case

    }//fim do escolheServico

    //mensagem final:
    public static void mensagemFinal(Cliente cliente1, Servicos servico1){
        if(cliente1.temDesconto()){
            //mensagem final com desconto
            System.out.println("\nVocê é " + cliente1.getDescricao() + " e escolheu: " +
                    servico1.getNome() + " - R$" + servico1.getPreco() +
                    ", com desconto o valor a ser pago será R$" +
                    (servico1.getPreco()/2));
        } else {
            //mensagem final sem desconto
            System.out.println("\nVocê é " + cliente1.getDescricao() + " e escolheu: " +
                    servico1.getNome() +
                    ", o valor a ser pago será R$" +
                    servico1.getPreco());
        }//fim do if-else mensagem final
    }//fim da mensagem final
}
