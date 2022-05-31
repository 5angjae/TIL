using System;

namespace 인터페이스
{
    interface IStudy
    {
        void Study(); // 접근 한정자를 지정할 수 없음
    }
    interface ISleep
    {
        void Sleep();
    }
    class Man
    {
        public void Think()
        {
            Console.WriteLine("생각하다.");
        }
    }
    class Student : Man, IStudy, ISleep
    {
        public void Sleep()
        {
            Console.WriteLine("잠을 자다.");
        }
        ///
        /// 묵시적 인터페이스 구현 - 접근 한정자를 public 으로 지정
        ///
        //public void Study()
        //{

        //}

        /// <summary>
        /// 명시적 인터페이스 구현 - 접근 한정자를 지정할 수 없음
        /// </summary>
        void IStudy.Study()
        {
            Console.WriteLine("공부하다.");
        }
    }
}
