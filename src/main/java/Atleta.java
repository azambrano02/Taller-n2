import java.util.ArrayList;
import java.util.List;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private List<Equipo> equipos;
	private List<Disciplina> disciplinas;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return this.pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Equipo> getEquipos(){
		return this.equipos;
	}
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void agregarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	public void eliminarDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}
	public String toString() {
		return "Nombre: " + nombre +",Pais: " +pais+ ",Edad: " +edad+ ",Equipos: " +equipos+ ",Disciplinas: " + disciplinas;
	}
	public Atleta(String nombre, String pais, int edad) {
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.equipos = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
	}
}