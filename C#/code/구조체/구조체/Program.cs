using System;

namespace 구조체
{
    class Program
    {
        static void Main(string[] args)
        {
            // ExInteger();
            // ExFloat();
            // ExDecimal();
            bool b1 = true;
            bool b2 = false;
        }

        private static void ExDecimal()
        {
            Console.WriteLine("decimal : {0} ~ {1}", decimal.MinValue, decimal.MaxValue);

            Console.ReadLine();
            decimal d = 0.0m;
            while (d != 1.0m) // 계속함. 정확하게 10번으로 풀리는 것이 아니다. 해결 ExDecimal()
            {
                Console.WriteLine(d);
                d = d + 0.1m;
            }
        }

        private static void ExFloat()
        {
            // float - 4바이트
            Console.WriteLine("float : {0} ~ {1}", float.MinValue, float.MaxValue);
            // double - 8바이트
            Console.WriteLine("double : {0} ~ {1}", double.MinValue, double.MaxValue);

            Console.ReadLine();
            double d = 0.0;
            while(d != 1.0) // 계속함. 정확하게 10번으로 풀리는 것이 아니다. 해결 ExDecimal()
            {
                Console.WriteLine(d);
                d = d + 0.1;
            }
        }

        private static void ExInteger()
        {
            // sbyte, byte - 1바이트
            Console.WriteLine("sbyte : {0} ~ {1}", sbyte.MinValue, sbyte.MaxValue);
            Console.WriteLine("byte : {0} ~ {1}", byte.MinValue, byte.MaxValue);
            // short, ushort - 2바이트
            Console.WriteLine("short : {0} ~ {1}", short.MinValue, short.MaxValue);
            Console.WriteLine("ushort : {0} ~ {1}", ushort.MinValue, ushort.MaxValue);
            // int, uint - 4바이트
            Console.WriteLine("int : {0} ~ {1}", int.MinValue, int.MaxValue);
            Console.WriteLine("uint : {0} ~ {1}", uint.MinValue, uint.MaxValue);
            // long, ulong - 8바이트
            Console.WriteLine("long : {0} ~ {1}", long.MinValue, long.MaxValue);
            Console.WriteLine("ulong : {0} ~ {1}", ulong.MinValue, ulong.MaxValue);

            // public static int Parse(string s);
            int i1 = int.Parse("-123");
            Console.WriteLine(i1);
            Console.WriteLine("정수를 입력하세요.");
            string nstr = Console.ReadLine();
            

            // int num = int.Parse(nstr);
            int num = 0;
            if (int.TryParse(nstr, out num))
            {
                Console.WriteLine("입력한 정수는 {0}", num);
            }
            else
            {
                Console.WriteLine("잘못 입력하였습니다.");
            }
        }
    }
}

