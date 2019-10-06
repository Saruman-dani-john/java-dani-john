public class PracticeProblems {

    //https://javaconceptoftheday.com/java-inheritance-practice-coding-questions/


    //Problem 1:

    //What will be the output of this program?
    //
    //class A {
    //    int i = 10;
    //}
    //
    //class B extends A {
    //    int i = 20;
    //}
    //
    //public class MainClass
    //{
    //    public static void main(String[] args){
    //        A a = new B();
    //
    //        System.out.println(a.i);
    //    }
    //}
    //Answer: 10

    //Problem 2:

    //What will be the output of the below program?

    //    class A
    //    {
    //        {
    //            System.out.println(1);
    //        }
    //    }
    //
    //    class B extends A
    //    {
    //        {
    //            System.out.println(2);
    //        }
    //    }
    //
    //    class C extends B
    //    {
    //        {
    //            System.out.println(3);
    //        }
    //    }
    //
    //    public class MainClass
    //    {
    //        public static void main(String[] args)
    //        {
    //            C c = new C();
    //        }
    //    }

    //Answer: 1
    //        2
    //        3


    //Problem 3;

    //What will be the output of the following program?

    //    class X
    //    {
    //        static void staticMethod()
    //        {
    //            System.out.println("Class X");
    //        }
    //    }
    //
    //    class Y extends X
    //    {
    //        static void staticMethod()
    //        {
    //            System.out.println("Class Y");
    //        }
    //    }
    //
    //    public class MainClass
    //    {
    //        public static void main(String[] args)
    //        {
    //            Y.staticMethod();
    //        }
    //    }

    //Answer: Class Y

    //Problem 4

    //Can you find out the error in the below code?

    //    public class A
    //    {
    //        public A()
    //        {
    //            super();
    //
    //            this(10);
    //        }
    //
    //        public A(int i)
    //        {
    //            System.out.println(i);
    //        }
    //    }

    //Answer: A constructor can have either super() or this() but not both.

    //Problem 5

    // Why Line 10 in the below code is showing compilation error?

    //class X
    //{
    //    private int m = 48;
    //}
    //
    //class Y extends X
    //{
    //    void methodOfY()
    //    {
    //        System.out.println(m);
    //    }
    //}

    //Answer: int 'm' is labeled as private so it is not
    // visible to Class Y


}
