class HelloWorld {
  static int x ;
  public static void main(String[] args) {

    String s1 = "Affan Shariff";
    String s2 = " ";
    String Sarr[] = s1.split(" ");
    for(int i =  Sarr.length - 1; i>= 0 ; i--) {
      s2 += Sarr[i];
    }
    System.out.println(s2);
  }

}

