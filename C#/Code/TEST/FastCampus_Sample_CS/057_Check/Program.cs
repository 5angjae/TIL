using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _057_Check
{
    class Program
    {
        static void Main(string[] args)
        {
            int max_score, min_score;
            max_score = 0;
            min_score = 100;
            for(int i = 0; i<5; i++)
            {
                Console.Write("학생의 성적을 입력하세요 : ");
                string a = Console.ReadLine();
                int b = int.Parse(a);
                if (b > max_score)
                {
                    max_score = b;
                }
                if (b < min_score)
                {
                    min_score = b;
                }
            }
            Console.WriteLine("최대값 : {0} 최소값 : {1}", max_score, min_score);
        }
    }
}
