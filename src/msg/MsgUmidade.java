package msg;

public class MsgUmidade {

  String umidade;

  public MsgUmidade() {}

  public String getUmidade() {
    return " - - - - - - - - - - - - - - - Umidade - - - - - - - - - - - - - - -";
  }

  @Override
  public String toString() {
    return  getUmidade();
  }
}
