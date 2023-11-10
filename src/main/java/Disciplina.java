import java.util.List;

public class Disciplina {
	private String nombre;
	private int numDeParticipantes;
	private String recordMundial;
	private List<Atleta> atletas;
	private Evento evento;

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

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public List<Atleta> getAtletas() {
		throw new UnsupportedOperationException();
	}

	public void setAtletas(List<Atleta> atletas) {
		throw new UnsupportedOperationException();
	}

	public Disciplina getDisciplinaEquipo() {
		throw new UnsupportedOperationException();
	}

	public Disciplina(String nombre, int numDeParticipantes, String recordMundial) {
		throw new UnsupportedOperationException();
	}
}