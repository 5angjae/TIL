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
            

            for(int i = 1; i <= 5; i++)
            {
                Console.WriteLine("{0}: 다음 두 수의 합은 몇? (총 5문제)", i);
                a = rand.Next(1, 100);
                b = rand.Next(1, 100);

            }
        }
    }
}
