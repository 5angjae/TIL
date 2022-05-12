using System;

namespace 문자열
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1;
            s1 = "hello"; // "문자열" - 리터럴 문자열 상수
            string s2 = "yahoo";

            char[] earr = new char[] { 'a','b','c', 'd' };
            string s3 = new string(earr);

            string s4 = new string(earr, 1, 2);
            string s5 = new string('a', 5);

            string str; // 초기값이 null
            string str1 = string.Empty; // 빈문자열로 초기화 권고
            
            Console.WriteLine(s1 == s2);
            string s6 = s1 + s2;
            Console.WriteLine(s6);

            int diff = s1.CompareTo(s2);
            Console.WriteLine(diff); // 사전식 비교

            string name = "홍길동";
            int age = 20;
            string s7 = string.Format("이름 : {0} 나이 : {1}", name, age);
            Console.WriteLine(s7);

            string s10 = "   ab  cde";
            Console.WriteLine(s10.Insert(3, "ehpub"));

            Console.WriteLine(s10);
            Console.WriteLine(s10.PadLeft(20));
            Console.WriteLine(s10.PadLeft(20, '*'));

            Console.WriteLine(s10.PadRight(20, '*'));

            string s11 = "1234567890";
            Console.WriteLine(s11.Remove(2));
            Console.WriteLine(s11.Remove(2, 3));

            string s12 = "  Hello World  123     ";
            Console.WriteLine(s12.ToUpper());
            Console.WriteLine(s12.Trim());

            string source = "I am a boy. You are a girl.";
            Console.WriteLine(source.Contains("girl"));
            Console.WriteLine(source.EndsWith("a girl."));
            Console.WriteLine(source.StartsWith("I"));
            Console.WriteLine(source.IndexOf("You"));
            Console.WriteLine(source.LastIndexOf("a"));
        }
    }
}
