import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String paisEquipo;
	private List<Atleta> atletas;
	private String disciplinaEquipo;

	public String getPaisEquipo() {
		return this.paisEquipo;
	}
	public void setPaisEquipo(String paisEquipo) {
		this.paisEquipo = paisEquipo;
	}
	public List<Atleta> getAtletas() {
		return this.atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public Disciplina getDisciplinaEquipo() {
		return this.disciplinaEquipo;
	}
	public void setDisciplinaEquipo(Disciplina disciplinaEquipo) {
		this.disciplinaEquipo = disciplinaEquipo;
	}

	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}
	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
	}
	public String toString() {
		return "Pais del equipo: " + paisEquipo+ "Disciplina: " + disciplinaEquipo + "Los atletas que conforman el equipo: " +atletas;
	}

	public Equipo(String paisEquipo, String disciplinaEquipo) {
		this.paisEquipo = paisEquipo;
		this.disciplinaEquipo = disciplinaEquipo;
		this.atletas = new ArrayList<>();
	}
}