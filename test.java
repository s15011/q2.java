public class test{
  public static void main(String[] args){
    for (int i = 1; i <= 100;){
      if (i % 3 == 0){
        System.out.println("THREE");
      } else if (i % 10 == 3){
        System.out.println("THREE");
      } else if (i >=30 && i <= 39){
        System.out.println("THREE");
      }
        else {
        System.out.println(i);
      }
      i++;
    }
  }
}
