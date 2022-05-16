using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// 접근한정자의 default는 private이다.
namespace 접근한정자
{
    class Student
    {
        // (1)
        const int max_iq = 200;
        int iq = 100;
        void Study(int scnt)
        {
            if ((iq + scnt) > max_iq)
            {
                iq = max_iq;
            }
            else
            {
                iq += scnt;
            }
        }

        // (2)
        internal const int max_iq = 200;
        internal int iq = 100;
        internal void Study(int scnt)
        {
            if ((iq + scnt) > max_iq)
            {
                iq = max_iq;
            }
            else
            {
                iq += scnt;
            }
        }

        // (3)
        internal const int max_iq = 200;
        int iq = 100;
        internal int IQ
        {
            get
            {
                return iq;
            }
            set
            {
                if (value > max_iq)
                {
                    iq = max_iq;
                }
                iq = value;
            }
        }
        internal void Study(int scnt)
        {
            IQ += scnt;
        }

    }
}
