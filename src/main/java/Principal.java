
public class Principal {
    public static void incializar(){
        Equipo equipo1 = new Equipo("Chile", "Judo");
        Equipo equipo2 = new Equipo("Aregentina", "Judo");
        Atleta atleta1 = new Atleta("Alan","Chile",21);
        Atleta atleta2 = new Atleta("Carlos","Chile",20);

        equipo1.agregarAtleta(atleta1);
        equipo1.agregarAtleta();

        equipo2.agregarAtleta(new Atleta("Sebastian","Argentina",24));
        equipo2.agregarAtleta(new Atleta("Pedro","Argentina",23));

        Evento evento = new Evento(new Disciplina("Judo",2,"Oro"), equipo1, 20/11/2023);
        evento.a


        equipo1.mostrarInformacion();
        disciplina1.mostrarInformacion();
        evento1.mostrarInformacion();
    }
}
