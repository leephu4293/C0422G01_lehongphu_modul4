package web.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService{
    @Override
    public double changeCurrency(double number) {
        return number*23000 ;
    }
}
