public class StBuilder {

  public static void main(String[] args) {
    StringBuilder stb = new StringBuilder(); //文字列の連結が多い時に使う メモリを効率的に使える

    stb.append("A");
    stb.append(",");
    stb.append("2500");

    System.out.println(stb.toString()); //String型に変換
  }
}
