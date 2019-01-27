package lk.ijse.Repocitory;

import lk.ijse.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface FlightRepo extends JpaRepository<Flight,Integer> {



    @Query(value = "SELECT * FROM flight u WHERE u.fromcity = :fromcity and u.tocity = :tocity",
            nativeQuery = true)
    Flight findByStatusAndNameNamedParamsNative(@Param("fromcity") String fromcity,@Param("tocity") String tocity);
}
