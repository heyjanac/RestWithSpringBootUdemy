package br.com.heyjanac.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.heyjanac.exception.UnsuportedMathOperationException;
import br.com.heyjanac.math.SimpleMath;
import br.com.heyjanac.request.converters.NumberConverters;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();

	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable ("numberOne") String numberOne, @PathVariable ("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.sum(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable ("numberOne") String numberOne, @PathVariable ("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.subtraction(NumberConverters.convertToDouble(numberOne) , NumberConverters.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable ("numberOne") String numberOne, @PathVariable ("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.multiplication(NumberConverters.convertToDouble(numberOne) , NumberConverters.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable ("numberOne") String numberOne, @PathVariable ("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.division(NumberConverters.convertToDouble(numberOne) , NumberConverters.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable ("numberOne") String numberOne, @PathVariable ("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.mean(NumberConverters.convertToDouble(numberOne) , NumberConverters.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable ("number") String number) throws Exception {
		if(!NumberConverters.isNumeric(number)){
			throw new UnsuportedMathOperationException("Por favor, defina um valor numerico!");
		}
		return math.squareRoot(NumberConverters.convertToDouble(number));
	}

	

}