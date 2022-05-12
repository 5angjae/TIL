using System;

namespace 열거형
{
    enum Season
    {
        NonSeason, Spring, Summer, Autumn, Winter
    }
    enum BaseScore
    {
        MinScore,
        Bad = 60,
        Soso = 75,
        Good = 90,
        HighScore = 100
    }
    enum Denomination : long
    {
        Kilo = 1000,
        Mega = 1000000,
        Giga = 1000000000,
        Tera = 1000000000000,
        Peta = 1000000000000000
    }

    [Flags]
    enum MyFlag
    {
        HasCar = 0x01,
        Married = 0x02,
        HasHouse = 0x04
    }
    class Program
    {
        static void Main(string[] args)
        {
            Season season = Season.NonSeason;
            Console.WriteLine("계절을 입력하세요. 봄 : 1, 여름 : 2, 가을 : 3, 겨울 : 4");
            string str = Console.ReadLine();
            season = (Season)int.Parse(str);
            Console.WriteLine("입력한 계절은 {0}입니다.", season);

            MyFlag flag = MyFlag.HasCar | MyFlag.HasHouse;
            Console.WriteLine(flag);
        }
    }
}
