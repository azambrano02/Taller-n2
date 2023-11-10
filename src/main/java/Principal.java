import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        incializar();
    }
    public static void incializar(){
        Disciplina Judo = new Disciplina("Judo",2,"Oro");
        Equipo equipo1 = new Equipo("Chile", Judo);
        Equipo equipo2 = new Equipo("Aregentina", Judo);
        Atleta atleta1 = new Atleta("Alan","Chile",21);
        Atleta atleta2 = new Atleta("Carlos","Chile",20);
        Atleta atleta3 = new Atleta("Sebastian","Argentina",24);
        Atleta atleta4 = new Atleta("Pedro","Argentina",23);

        equipo1.agregarAtleta(atleta1);
        equipo1.agregarAtleta(atleta2);
        equipo2.agregarAtleta(atleta3);
        equipo2.agregarAtleta(atleta4);

        Date fecha = new Date(20/11/2023);
        Evento evento = new Evento(Judo, equipo1, fecha);

        atleta1.toString();
        Judo.toString();
        evento.toString();
    }
}
