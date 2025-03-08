package mes;

public enum DiaDaSemana {

    SEGUNGA("Segunda", 1),
    TERCA("Terça", 2),
    QUARTA("Quarta", 3),
    QUINTA("Quinta", 4),
    SEXTA("Sexta", 5),
    SABADO("Sábado", 6), 
    DOMINGO("Domingo", 7);
    
          


    private String diaSemana;
    private int diaMes;

    private DiaDaSemana(String diaSemana, int diaMes){
        this.diaSemana = diaSemana;
        this.diaMes = diaMes;
    }

    public String getDiaSemana(){
        return diaSemana;
    }

     public int getDiaMes(){
        return diaMes;
    }

}
