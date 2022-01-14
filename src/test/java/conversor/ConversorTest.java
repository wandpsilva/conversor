package conversor;

import conversor.enums.TimeConversorUnit;
import conversor.time.TimeConversor;
import conversor.weight.Mass;
import conversor.wheather.Temperature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.logging.Logger;

public class ConversorTest {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void deveConverterCelsiusParaFahrenheit() {
        //cenario
        double graus = 17;

        //acao
        double resultado = Temperature.toFahrenheit(graus);

        //verificacao
        Assert.assertEquals(resultado, 62.6, 0.1);
    }

    @Test
    public void deveConverterFahrenheitParaCelsius() {
        //cenario
        double graus = 62.6;

        //acao
        double resultado = Temperature.toCelsius(graus);

        //verificacao
        Assert.assertEquals(resultado, 17, 0.1);
    }

    @Test
    public void deveConverterGramasParaMiligramas(){
        //cenario
        double grams = 200;

        //acao
        double resultado = Mass.toMiligrams(grams);
        logger.info("resultado: " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 200000.0, 0.1);
    }

    @Test
    public void deveConverterMiligramasParaGramas(){
        //cenario
        double miligramas = 200;

        //acao
        double resultado = Mass.toGrams(miligramas);
        logger.info("resultado: " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 0.2000000, 0.1);
    }

    @Test
    public void deveConverterHorasEmMinutos(){
        //cenario
        double horas = 2;

        //acao
        double resultado = TimeConversor.toMinutes(horas, TimeConversorUnit.HOURS);
        logger.info("Resultado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 120.0, 0.1);
    }

    @Test
    public void deveConverterSegundosEmMinutos(){
        //cenario
        double segundos = 60;

        //acao
        double resultado = TimeConversor.toMinutes(segundos, TimeConversorUnit.SECONDS);
        logger.info("Resuktado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 1.0, 0.1);
    }

    @Test
    public void deveConverterMinutosEmSegundos(){
        //cenario
        double minutos = 1;

        //acao
        double resultado = TimeConversor.toSeconds(minutos, TimeConversorUnit.MINUTES);
        logger.info("Resultado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 60.0, 0.1);
    }

    @Test
    public void deveConverterHorasEmSegundos(){
        //cenario
        double horas = 1;

        //acao
        double resultado = TimeConversor.toSeconds(horas, TimeConversorUnit.HOURS);
        logger.info("Resultado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 3600.0, 0.3);
    }

    @Test
    public void deveConverterSegundosEmHoras(){
        //cenario
        double segundos = 60;

        //acao
        double resultado = TimeConversor.toHours(segundos, TimeConversorUnit.SECONDS);
        logger.info("Resultado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 0.1, 0.1);
    }

    @Test
    public void deveConverterMinutosEmHoras(){
        //cenario
        double minutos = 60;

        //acao
        double resultado = TimeConversor.toHours(minutos, TimeConversorUnit.MINUTES);
        logger.info("Resultado " + resultado);

        //verificacao
        Assert.assertEquals(resultado, 1.0, 0.1);
    }
    
}
