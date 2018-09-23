package faustit.airlinesapi.tourist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TouristServiceImpl implements TouristService {

    private TouristRepository touristRepository;

    @Autowired
    public TouristServiceImpl(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @Override
    public Iterable<Tourist> showAll() {
        return this.touristRepository.findAll();
    }

    @Override
    public Tourist create(Tourist tourist) {
        return this.touristRepository.save(tourist);
    }

    @Override
    public void delete(Tourist tourist) {
        this.touristRepository.delete(tourist);
    }

    @Override
    public void edit(Tourist tourist) {

    }
}
