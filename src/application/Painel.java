package application;

import sensores.SensorCo2;
import sensores.SensorTemperatura;
import sensores.SensorUmidade;

public class Painel {
  public static void main(String[] args) {

    //! Instanciação dos objetos usados para calcular os sensores
    SensorTemperatura temperatura = new SensorTemperatura();
    SensorUmidade umidade = new SensorUmidade();
    SensorCo2 co2 = new SensorCo2();
    
    //! uso dos objetos instanciados
    temperatura.sensorTemperatura();
    umidade.sensorUmidade();
    co2.sensorCo2();
    
  }
}

