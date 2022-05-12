using System;

namespace 생성자
{
    class Example
    {
        //public Example() // 명시적으로 정의 가능
        //{
        //    Console.WriteLine("Example 기본 생성자");
        //}
        public Example(int i) // 입력 매개변수가 있는 생성자
        {
            Console.WriteLine("Example 생성자 : {0}", i);
        }
        static Example() // 정적 생성자 : 접근 한정자를 명시할 수 없다. (public / private 같은) / 입력인자를 전달하지 못한다. 
        {
            Console.WriteLine("정적생성자");
        }

    }
    struct SExample
    {
        //public SExample() // 구조체는 명시적으로 기본 생성자를 정의하는게 불가능하다.
        //{
        //}
        public SExample(int i)
        {
            Console.WriteLine("구조체 생성자 : {0}", i);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("테스트");
            // Example ex = new Example(); // new 로 형식 이름을 명시하고 ex 개체가 만들어지는데, 이 과정을 통해 만들어지는 코드를 생성자라고 한다. 따로 정의한게 없지만 가능한 이유는 default 기본 생성자로 만들어진다.
            Example ex2 = new Example(3);
            SExample se = new SExample(4);
        }
    }
}
