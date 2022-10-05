package Ec1.Luiscuri.com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ec1.Luiscuri.com.idat.Model.Malla_curicular;

@Repository
public interface Malla_curicularRepository extends JpaRepository<Malla_curicular, Integer> {

}
