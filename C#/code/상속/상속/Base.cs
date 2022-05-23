using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 상속
{
    //// 일반화 관계
    //// 기반형식(Base)와 파생형식 (Derived) 사이의 관계
    //class Base
    //{
    //}
    //class Derived : Base
    //{

    //}
    //struct Derived : Base // 구조체는 인터페이스만 기반으로 정의 가능
    //{

    //}
    //interface IBase
    //{

    //}
    //struct DerivedI : IBase
    //{

    //}
    class Man
    {
        int hp = 100; // default private
        public int HP
        {
            get { return hp; }
            protected set { hp = value; }
        }
        internal void Walk()
        {
            Console.WriteLine("걷다.");
            hp += 2;
        }
        string name;
        protected string Name
        {
            get { return name; }

        }
        internal Man(string name)
        {
            Console.WriteLine("Man 생성자");
            this.name = name;
        }
    }
    // 파생형식에서는 기반 형식의 멤버를 갖는다. = 상속
    class Student : Man
    {
        //internal Student() // 위 기반형식의 생성자에 입력변수가 있어서 오류
        //{
        //    Console.WriteLine("Student 생성자");
        //}
        internal Student(string name) : base(name) // 기반형식 개체 생성 초기화
        {
            Console.WriteLine("Student  생성자");
        }
        internal void Study()
        {
            Console.WriteLine("공부하다");
            //hp -= 2; // 기반형식의 멤버가 private이기 때문에 보호수준때문에 접근 할 수 없다.
            HP -= 2;
        }
    }
    // 기반형식으로 사용을 못하게 하도록 하겠다 하면 sealed
    //sealed class Professor
    //{

    //}
    //class HighProfessor : Professor
    //{

    //}
}
