package sensores;

import java.util.Date;
import java.util.Random;

import msg.MsgTemperatura;

public class SensorTemperatura {

  public int sensorTemperatura;

  public void sensorTemperatura() {

    MsgTemperatura msgTemperatura = new MsgTemperatura();
    int vet[] = new int[16];
    Date date = new Date();
    Random random = new Random();
    int aux = 0;
  
    for(int i = 0; i < vet.length; i++) {
      vet[i] = random.nextInt(70);
    }

    for(int i = 0; i <= vet.length; i++) {
      for(int j = 0; j < vet.length - 1; j++) {
        if(vet[j] >= vet[j + 1]) {
          aux = vet[j];
          vet[j] = vet[j + 1];
          vet[j + 1] = aux;
        }
    
      }
    }
    System.out.println(msgTemperatura.getTemperatura());
    for(int j = 0; j < vet.length; j++) {
      date = new Date(date.getTime() + 30 * 60 * 1000);
      System.out.println("Temperatura: " + vet[j] + "° Celsius" + " - Data/Hora: " + date);
    }



  }

 

}