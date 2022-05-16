using System;

namespace 접근한정자
{
    class Program
    {
        static void Main(string[] args)
        {
            // (1)
            Student student = new Student();
            student.Study(3); // (1) 보호수준 때문에 접근 할 수 없다. default가 private이라서.

            // (2)
            Student student = new Student();
            Console.WriteLine("아이큐 : {0}", student.iq);
            Console.WriteLine("공부할 시간을 입력하세요.");
            string str = Console.ReadLine();
            int scnt = int.Parse(str);
            student.Study(scnt);
            Console.WriteLine("아이큐 : {0}", student.iq);

            // (3)
            Student student = new Student();
            Console.WriteLine("아이큐 : {0}", student.IQ);
            Console.WriteLine("공부할 시간을 입력하세요.");
            string str = Console.ReadLine();
            int scnt = int.Parse(str);
            //student.iq += scnt; // 클래스를 사용하지 않아 max_iq를 넘어간다.
            student.Study(scnt);
            Console.WriteLine("아이큐 : {0}", student.IQ);
            // 이런 실수를 하지 않기 위해서 member의 iq값에 접근하지 못하게 했더라면
            // 
        }
    }
}
