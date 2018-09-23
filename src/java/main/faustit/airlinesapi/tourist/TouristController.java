package faustit.airlinesapi.tourist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tourists")
public class TouristController {

    private TouristServiceImpl touristService;

    public TouristController(TouristServiceImpl touristService) {
        this.touristService = touristService;
    }

    @GetMapping(path = "")
    public String showAll() {
        return "Magic";
    }
}
