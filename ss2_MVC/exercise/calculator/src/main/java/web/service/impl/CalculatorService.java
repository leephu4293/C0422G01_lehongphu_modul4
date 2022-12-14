package web.service.impl;

import org.springframework.stereotype.Service;
import web.service.ICalculatorService;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public String calculator(double number1, double number2,String select) {
       String  result="" ;
        switch (select){
            case "Addition":
                result = String.valueOf(number1+number2);
                break;
            case "Subtraction":
                result = String.valueOf(number1-number2);
                break;
            case "Multiplication":
                result = String.valueOf(number1*number2);
                break;
            case "Division":
                if (number2 == 0 ){
                    result="denominator other than 0";
                }else {
                    result = String.valueOf(number1/number2);
                }
                break;
        }
        return result;
    }

}
