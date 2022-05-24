using System;

namespace 다형성
{
    class Program
    {
        static void Main(string[] args)
        {
            //Man man = null;
            //man = new Stu(); // 기반형식 변수로, 파생형식 개체 참조 가능
            //// 상향 캐스팅 (기반형식 변수 = 파생형식 개체)
            //// Stu stu = man; // 하향 캐스팅 (파생형식 변수 = 기반형식 개체)
            //// 하향 캐스팅은 문법적으로 가능하지 않다.
            //man.Walk();

            //Stu stu = null;
            //stu = man as Stu; // man 변수의 stu 형식 개체를 참조하여라. (하향 캐스팅)
            //if (stu != null)
            //{
            //    stu.Study();
            //    stu.Work(); // 새롭게 정의한 work를 호출
            //}
            //else
            //{
            //    Console.WriteLine("학생 개체가 아닙니다.");
            //}

            //// is 연산은 값 형식과 참조 형식 모두에서 사용 가능
            //// as 연산은 참조 형식에서만 사용 가능
            //if(man is Stu)
            //{
            //    Stu stu2 = (Stu)man;
            //    stu2.Study();
            //}
            //else
            //{
            //    Console.WriteLine("학생 개체가 아닙니다.");
            //}

            //man.Work();
            //man.Work2();
            Stu student = new Stu();
            student.Work();

            Man man = new Stu();
            man.Work();

        }
    }
}
