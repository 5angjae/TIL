using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _055_Check
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
            int a, b;
            int cnt = 0;

            for(int i = 1; i <= 5; i++)
            {
                Console.WriteLine("{0}: 다음 두 수의 합은 몇? (총 5문제)", i);
                a = rand.Next(1, 100);
                b = rand.Next(1, 100);
                Console.WriteLine("{0} + {1} = ??", a, b);
                string c = Console.ReadLine();
                int d = int.Parse(c);
                if (a+b==d)
                {
                    cnt += 1;
                    Console.WriteLine("== 정답 ==");

                }
                else
                {
                    Console.WriteLine("오답(정답은 : {0})", a+b);
                }

            }
            Console.WriteLine("{0} 개 맞았습니다.", cnt);
        }
    }
}
