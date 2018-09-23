package faustit.airlinesapi.tourist;

public interface TouristService {

    Iterable<Tourist> showAll();
    Tourist create(Tourist tourist);
    void delete(Tourist tourist);
    void edit(Tourist tourist);
}
