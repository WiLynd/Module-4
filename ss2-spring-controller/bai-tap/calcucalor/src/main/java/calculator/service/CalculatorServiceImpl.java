package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public int calculator(int a,int b,String calculation) {
        int result = 0;
        switch (calculation){
            case "Add":
                result = a + b;
                break;
            case "Sub":
                result = a - b;
                break;
            case "Mul":
                result = a * b;
                break;
            case "Div":
                result = a / b;
                break;
        }
        return result;
    }

}
