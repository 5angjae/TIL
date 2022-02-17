using System;
/*-----------------------------------------------------------------------------
 * Name: _024_Data_cast
 * DESC: cast연산자(  ) 기초
-----------------------------------------------------------------------------*/
namespace _024_Data_cast
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 100;
            double dNum = (double)num;
            Console.WriteLine("num: {0},  dNum: {1}", num, dNum);

            double dNum2 = 12345678912;
            int num2 = (int)dNum2; //큰데이터형을 작은 데이터형으로 변경시 주의!!!
            Console.WriteLine("dNum2: {0},  num2: {1}", dNum2, num2);
        }
    }
}
