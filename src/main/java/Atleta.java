import java.util.ArrayList;
import java.util.List;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private List<Disciplina> listaDisciplinas;
	private Equipo equipo;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

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

	public List<Disciplina> getListaDisciplinas() {
		throw new UnsupportedOperationException();
	}

	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		throw new UnsupportedOperationException();
	}

	public void agregarDisciplina(Disciplina disciplina) {
		throw new UnsupportedOperationException();
	}

	public void eliminarDisciplina(Disciplina disciplina) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Atleta(String nombre, String pais, int edad) {
		throw new UnsupportedOperationException();
	}
}