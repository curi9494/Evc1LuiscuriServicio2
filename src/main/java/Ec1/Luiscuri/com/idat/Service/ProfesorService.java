package Ec1.Luiscuri.com.idat.Service;

import java.util.List;

import Ec1.Luiscuri.com.idat.Model.Profesor;

public interface ProfesorService {
	
	void guardarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor> listarProfesor();
	Profesor obtenerProfesorId(Integer id); 

}
