using System;

namespace 상속
{
    class Program
    {
        static void Main(string[] args)
        {
            Student student = new Student("홍길동");
            student.Study();
            // student.HP = 3; // set 블럭은 protected로 막아놔서 안된다.
            student.Walk(); // 기반형식의 멤버를 상속 받아 사용 가능
        }
    }
}
