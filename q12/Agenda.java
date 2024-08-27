enum DiasDaSemana {
    DOMINGO,
    SEGUNDA,
    TERÇA,
    QUARTA,
    QUINTA,
    SEXTA,
    SÁBADO
}

class Agenda {
    private final String[] compromissos;

    public Agenda() {
        // vetor de compromissos com o tamanho igual ao número de dias na semana
        compromissos = new String[DiasDaSemana.values().length];
        
        // inicializando todos os compromissos como strings vazias
        for (int i = 0; i < compromissos.length; i++) {
            compromissos[i] = "";
        }
    }

    public void marcarCompromisso(DiasDaSemana dia, String compromisso) {
        compromissos[dia.ordinal()] = compromisso;
    }

    public void exibirCompromissos() {
        for (DiasDaSemana dia : DiasDaSemana.values()) {
            String compromisso = compromissos[dia.ordinal()];
            System.out.println(dia + ": " + 
                  (compromisso.isEmpty() ? "Nenhum compromisso" : compromisso));
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.marcarCompromisso(DiasDaSemana.SEGUNDA, "Reunião");
        agenda.marcarCompromisso(DiasDaSemana.QUARTA, "Dentista");
        agenda.marcarCompromisso(DiasDaSemana.SEXTA, "Medico");

        agenda.exibirCompromissos();
    }
}
