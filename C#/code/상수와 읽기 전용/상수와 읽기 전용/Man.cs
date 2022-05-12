using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 상수와_읽기_전용
{
    class Man
    {
        public const int max_hp = 200; // const 는 묵시적으로 정적멤버
        readonly int num; // 일기 전용
        public Man(int num)
        {
            this.num = num; // 생성과정에서는 읽기 전용의 값을 결정할 수 있다.
        }
        public void Foo()
        {
            num = 3; // 읽기 전용은 생성자 외에 값을 변경할 수 없다.
        }
    }
}
