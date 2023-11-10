import java.util.ArrayList;
import java.util.Date;

public class Evento {
	private Disciplina disciplina;
	private Equipo equipos;
	private Date fecha;
	private ArrayList<Atleta> atletlas = new ArrayList<Atleta>();

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

	public void agregarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Evento(Disciplina disciplina, Equipo equipos, Date fecha) {
		throw new UnsupportedOperationException();
	}
}