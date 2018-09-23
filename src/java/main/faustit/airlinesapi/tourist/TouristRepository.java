package faustit.airlinesapi.tourist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends CrudRepository<Tourist, Integer> {

    Tourist findByFirstName(String name);
}
