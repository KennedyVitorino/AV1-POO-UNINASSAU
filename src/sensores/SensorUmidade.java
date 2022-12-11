package sensores;

import java.util.Date;

import msg.MsgUmidade;

public class SensorUmidade {

  public int sensorUmidade;

  public void sensorUmidade() {

    MsgUmidade msgUmidade = new MsgUmidade();

    int[] vet;
    Date date = new Date();
    int aux = 0;
    vet = new int[16];

    for (int i = 0; i < vet.length; i++) {
      vet[i] = (int)(Math.random() * 40) + 10;
    }
    
    for (int i = 0; i <= vet.length; i++) {
      for (int j = 0; j < vet.length - 1; j++) {
        if (vet[j] <= vet[j + 1]) {
          aux = vet[j];
          vet[j] = vet[j + 1];
          vet[j + 1] = aux;
        }
      }
    }
    
    System.out.println(msgUmidade.getUmidade());
    for (int j = 0; j < vet.length; j++) {
      date = new Date(date.getTime() + 30 * 60 * 1000);
      System.out.printf("Umidade: "+vet[j]+"%%");
      System.out.printf(" - Data/Hora: " + date);
      System.out.println("");
    }

  }
}