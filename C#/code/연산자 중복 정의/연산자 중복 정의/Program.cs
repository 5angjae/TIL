using System;

namespace 연산자_중복_정의
{
    class Program
    {
        static void Main(string[] args)
        {
            Man man = new Man("홍길동");
            if(man == "홍길동") // 이렇게 비교 연산을 하고 싶다...!
            {
                Console.WriteLine("같다.");
            }
            else
            {
                Console.WriteLine("다르다.");
            }

            // 묵시적 형변환에 대해서 연산자 중복 정의가 필요하다.
            string name = (string)man;
            Console.WriteLine(name);
        }
    }
}
