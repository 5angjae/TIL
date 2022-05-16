using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 개체의_멤버와_정적_멤버
{
    // 정적 클래스는
    // 개체 생성 할 수 없음
    // 정적 멤버만 캡슐화 가능
    static class Rule // 정적 클래스
    {
        // int num; // 정적멤버가 아닌 일반멤버 캡슐화 불가
        public const int max_hp = 100; // 정적멤버만 캡슐화 가능


    }
}
