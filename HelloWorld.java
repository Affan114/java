class HelloWorld {
    public static void main(String[] args) {
      //heap area outside string constant pool

      String s1 = new String("War Zone");
      String s2 = new String("war zone");

      // comparison by ignoring cases
      System.out.println(s1.equalsIgnoreCase(s2));
    }
}


