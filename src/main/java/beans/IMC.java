package beans;

import java.io.Serializable;

import javax.ejb.Stateless;

import models.enums.IMCEnum;

@Stateless
public class IMC implements Serializable {
	    public IMCEnum imc(Double altura, Double peso) {
        final Double alturaMetro = (altura/100.0);
        Double resultado = peso / Math.pow(alturaMetro, 2);
        return IMCEnum.of(resultado);
    }

}
