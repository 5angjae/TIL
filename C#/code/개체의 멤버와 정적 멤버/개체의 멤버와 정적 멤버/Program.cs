using System;

namespace 개체의_멤버와_정적_멤버
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("LastNum : {0}", Example.lastnum); // 형식 Example 의 정적 멤버 lastnum 출력
            Example ex1 = new Example();
            Console.WriteLine("ex1.SN : {0}", ex1.SN); // ex1 개체 멤버 SN 출력
            Example ex2 = new Example();
            Console.WriteLine("ex2.SN : {0}", ex2.SN); // ex2 개체 멤버 SN 출력
            Console.WriteLine("LastNum : {0}", Example.lastnum); // 형식 Example 의 정적 멤버 lastnum 출력


            // Rule rule = new Rule(); // 정적 형식의 개체 생성 불가
            Console.WriteLine("최대 HP:  {0}", Rule.max_hp);
        }
    }
}
