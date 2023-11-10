import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nombre;
	private int numDeParticipantes;
	private String recordMundial;
	private List<Atleta> atletas;
	private Evento evento;
	private Disciplina disciplinaEqupos;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumDeParticipantes() {
		return this.numDeParticipantes;
	}
	public void setNumDeParticipantes(int numDeParticipantes) {
		this.numDeParticipantes = numDeParticipantes;
	}
	public String getRecordMundial() {
		return this.recordMundial;
	}
	public void setRecordMundial(String recordMundial) {
		this.recordMundial = recordMundial;
	}
	public List<Atleta> getAtletas() {
		return this.atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public Disciplina getDisciplinaEquipo() {
		return this.disciplinaEqupos;
	}

	public String toString() {
		return "Nombre: " +nombre+ "Numero de participantes: " + numDeParticipantes + "El record mundial actual: " + recordMundial;
	}
	public Disciplina(String nombre, int numDeParticipantes, String recordMundial) {
		this.nombre = nombre;
		this.numDeParticipantes = numDeParticipantes;
		this.recordMundial = recordMundial;
		this.atletas = new ArrayList<>();
	}
}