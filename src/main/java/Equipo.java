import java.util.List;

public class Equipo {
	private String paisEquipo;
	private List<Atleta> atletas;
	private Disciplina disciplinaEquipo;
	private Atleta atleta;

	public void agregarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public String getPaisEquipo() {
		return this.paisEquipo;
	}

	public void setPaisEquipo(String paisEquipo) {
		this.paisEquipo = paisEquipo;
	}

	public List<Atleta> getAtletas() {
		throw new UnsupportedOperationException();
	}

	public void setAtletas(List<Atleta> atletas) {
		throw new UnsupportedOperationException();
	}

	public Disciplina getDisciplinaEquipo() {
		return this.disciplinaEquipo;
	}

	public void setDisciplinaEquipo(Disciplina disciplinaEquipo) {
		this.disciplinaEquipo = disciplinaEquipo;
	}

	public Equipo(String paisEquipo, Disciplina disciplinaEquipo) {
		throw new UnsupportedOperationException();
	}
}