package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso");
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos falar com o candidato " + candidato + " na tentativa nº " + tentativasRealizadas);
        else
            System.out.println("Não conseguimos falar com o candidato " + candidato + " após " + tentativasRealizadas + " tentativas");

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]); 
        }

        System.out.println("Forma abreviada de interação each");

        for (String candidato : candidatos) {
            System.out.println("O candidato é " + candidato);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou um salario de " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato " + candidato + " selecionado!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        
    }
}   
