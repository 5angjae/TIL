using System;

namespace 멤버_메서드와_매개_변수_전달_방식
{
    class Program
    {
        // 반환 형식   메서드 이름 (입력 매개 변수 목록)
        //{
        // 수행할 코드
        //}
        static void Main(string[] args)
        {
            //int re = 0;
            //re = Sum(1, 10);
            //Console.WriteLine("합계 : {0}", re);
            //re = Sum(1, 100);
            //Console.WriteLine("합계 : {0}", re);
            int a = 2, b = 2, c = 2;

            Console.WriteLine("a : {0}, b : {1}, c : {2}", a, b, c);
            Foo(a, ref b, out c); // a는 값 방식으로 전달, b와 c는 참조 방식으로 전달
            Console.WriteLine("a : {0}, b : {1}, c : {2}", a, b, c); // 값 방식의 경우에는 현재의 표현만 복사해서 전달, 호출하는 곳에서 전달한 값을 복사해서 전달한거고 

        }

        private static void Foo(int a, ref int b, out int c)
        {
            a = 3;
            b = 3;
            c = 3;

        }

        static int Sum(int start, int end)
        {
            int sum = 0;
            for(int i=start; i<= end; i++)
            {
                sum += i;
            }
            return sum;
        }
        // 
        // 4분 57초 부터
    }
}
