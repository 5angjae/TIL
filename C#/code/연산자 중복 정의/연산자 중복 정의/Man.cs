using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 연산자_중복_정의
{
    class Man
    {
        string name;
        public Man(string name)
        {
            this.name = name;
        }
        // 비교연산을 위한 비교 연산
        public static bool operator ==(Man man, string name)
        {
            return man.name == name;
        }
        public static bool operator !=(Man man, string name)
        {
            return man.name != name;
        }

        //public static implicit operator string(Man man)
        //{
        //    return man.name;
        //}

        public static explicit operator string(Man man)
        {
            return man.name;
        }
    }
}
