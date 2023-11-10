import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
	private Disciplina disciplina;
	private Equipo equipos;
	private Date fecha;
	private List<Atleta> atletas;

	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Equipo getEquipos() {
		return this.equipos;
	}
	public void setEquipos(Equipo equipos) {
		this.equipos = equipos;
	}
	public Date getFecha() {
		return this.fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}
	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
	}
	public String toString() {
		return "Disciplina: " +disciplina+ "Equipos: " + equipos+ "La fecha del evento sera: " + fecha;
	}

	public Evento(Disciplina disciplina, Equipo equipos, Date fecha) {
		this.disciplina = disciplina;
		this.equipos = equipos;
		this.fecha = fecha;
		this.atletas = new ArrayList<>();
	}
}