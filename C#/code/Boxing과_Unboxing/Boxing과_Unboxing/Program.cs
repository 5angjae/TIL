using System;

namespace Boxing과_Unboxing
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 0;
            a = 4;
            object o = a; // Boxing
            Console.WriteLine(o.ToString());

            int b = 0;
            b = (int)o; // Unboxing
            Console.WriteLine(b.ToString());
        }
    }
}
