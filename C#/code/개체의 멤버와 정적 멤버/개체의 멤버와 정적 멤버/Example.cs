using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 개체의_멤버와_정적_멤버
{
    class Example
    {
        public static int lastnum = 0; // 정적 멤버
        public readonly int sn; // 일련번호
        public int SN
        {
            get
            {
                return sn;
            }
        }
        public Example()
        {
            lastnum++;
            sn = lastnum;
        }
        public override string ToString()
        {
            return sn.ToString();
        }
    }
}
