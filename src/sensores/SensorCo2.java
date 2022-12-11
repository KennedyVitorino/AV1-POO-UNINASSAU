package sensores;

import java.util.Date;

import msg.MsgCo2;

public class SensorCo2 {
  
  public int sensorCo2;

  public void sensorCo2() {
    
    MsgCo2 msgCo2 = new MsgCo2();

    int[] vet;
    Date date = new Date();
    int aux = 0;
    vet = new int[16];
    for (int i = 0; i < vet.length; i++) {
      vet[i] = (int) (Math.random() * 30) + 20;
    }
    for (int i = 0; i <= vet.length; i++) {
      for (int j = 0; j < vet.length - 1; j++)
        if (vet[j] >= vet[j + 1]) {
          aux = vet[j];
          vet[j] = vet[j + 1];
          vet[j + 1] = aux;
        }
    }
    System.out.println(msgCo2.getCo2());
    for (int j = 0; j < vet.length; j++) {
      date = new Date(date.getTime() + 30 * 60 * 1000);
      System.out.printf("Dióxido de Carbono: " + vet[j] + " CO²");
      System.out.printf(" - Data/Hora: " + date);
      System.out.println("");
    }
  }

}
