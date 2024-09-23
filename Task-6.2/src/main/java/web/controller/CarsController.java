package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDao;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String show(@RequestParam(name = "count",required = false) Integer count,
            Model model){
        if (count == null) {
            model.addAttribute("cars", carDao.getCarList());
        } else {
            model.addAttribute("cars", carDao.getCarsNumber(count));
        }
        return "cars";
    }
}
