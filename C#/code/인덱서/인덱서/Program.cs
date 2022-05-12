using System;

namespace 인덱서
{
    //class Example
    //{
    //    public string this[int index]
    //    {
    //        get
    //        {
    //            return "";
    //        }
    //        set
    //        {
    //        }
    //    }
    //}
    class Program
    {
        static void Main(string[] args)
        {
            //Example ex = new Example();
            //ex[3] = "홍길동";
            //Console.WriteLine(ex[3]);
            MyDictionary md = new MyDictionary();
            Console.WriteLine(md[1]);
            Console.WriteLine(md["key2"]);
        }
    }
}
