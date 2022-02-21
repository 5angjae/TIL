using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _056_Check
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
            
            int a, b;
            int cnt = 1;
            a = rand.Next(1, 100);
            // Console.WriteLine("{0}", a);
            do
            {
                Console.Write("0~99 사이 어떤 숫자일까요 (단, 0은 나가기)");
                string c = Console.ReadLine();
                b = int.Parse(c);
                
                if (b == 0)
                {
                    Console.WriteLine("중단되었습니다.");
                    break;
                }
                else if (b > a)
                {
                    Console.WriteLine("입력한 수는 커요");
                }
                else if (a > b)
                {
                    Console.WriteLine("입력한 수는 작아요");
                }
                else
                {
                    Console.WriteLine("=== 정답 입니다. ==");
                    Console.WriteLine("총 {0}번 시도", cnt);
                    break;
                }
                cnt += 1;
                
            } while (b != a) ;
        }
    }
}
