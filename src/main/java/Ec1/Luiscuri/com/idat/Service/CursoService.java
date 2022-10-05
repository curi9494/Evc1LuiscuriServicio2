package Ec1.Luiscuri.com.idat.Service;

import java.util.List;

import Ec1.Luiscuri.com.idat.Model.Curso;

public interface CursoService {
	
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCurso();
	Curso obtenerCursoId(Integer id); 

}
