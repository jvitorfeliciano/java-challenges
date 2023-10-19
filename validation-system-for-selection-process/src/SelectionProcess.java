public class SelectionProcess {

    public static void main(String[] args) {
        analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0);
    }

    static void analyzeCandidate(double requestedWage) {
        int baseWage = 2000;

        if (baseWage > requestedWage) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (baseWage == requestedWage)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
