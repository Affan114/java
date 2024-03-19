class HelloWorld {
    public static void main(String[] args) {
      //heap area outside string constant pool

      String s1 = new String("Only the dead have seen the end of war");
      String s2 = new String("Only the dead have seen the end of war");

      
      System.out.println(s1==s2);
    }
}
