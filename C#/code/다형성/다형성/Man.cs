using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 다형성
{
    abstract class Man
    {
        internal void Walk()
        {
            Console.WriteLine("걷다.");
        }
        internal void Work()
        {
            Console.WriteLine("일을 하다.");
        }
        internal virtual void Work2() // 가상으로 정의
        {
            Console.WriteLine("일2");
        }
        internal abstract void Work3(); // 추상 메서드 (사용을 위해서는 class 도 abstract로)
        
    }
    class Stu : Man
    {
        internal override void Work3() // 추상 메서드를 재정의 해야 개체를 생성 가능
        {
            Console.WriteLine("학생 공3");
        }
        internal override void Work2()
        {
            Console.WriteLine("학생 공2");
        }
        internal void Study()
        {
            Console.WriteLine("공부하다.");
        }
        internal new void Work() // 기반 형식 Work 메서드를 무효화
        {
            // base.Work(); // base 키워드를 사용하여 무효화 상태의 메서드 호출
            Console.WriteLine("열심히 공부하다.");
        }
    }
}
