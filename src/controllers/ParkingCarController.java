package controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import businesslogic.ParkingCarBL;
import javabeans.ParkingCar;

@Controller
public class ParkingCarController {
	@RequestMapping("/Parking")
	public String Paking() {
		return "Parking";
	}
	
	@RequestMapping("/adminparkingcar")
	public String parkingcar(Model model) {
		List<ParkingCar> dspc =  ParkingCarBL.docTatCa(); 
		model.addAttribute("dspc", dspc); 
		return "adminparkingcar";
	}
	

}
