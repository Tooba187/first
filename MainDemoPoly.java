class A
{
  void show&()
  {
     System.out.println("As Show");
  }
}
class B extends A
{
  void show()
  {
    System.out.println("Bs Show");
  }
}
class C extends A
{
   void show()
    {
      System.out.println("Cs Show");
     }
}
class MainDemoPoly
{
    public static void main(String[] args);
    A aa=new A();
    B bb=new B();
    C cc=new C();
    aa.show ();
    bb.show ();
    cc.show ();
    A ref;
    ref =new A;
    ref.show ();
    ref =new B;
    ref.show ();
    ref =new C;
    ref.show ();
  }
}