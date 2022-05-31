using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 컬렉션1
{
    class Tutee
    {
        public string Name
        {
            get;
            private set;
        }
        public Tutee(string name)
        {
            Name = name;
        }
        public override string ToString()
        {
            return string.Format("수강생 이름 : {0}", Name);
        }
    }
    class Tutor
    {
        public string Name
        {
            get;
            private set;
        }
        public Tutor(string name)
        {
            Name = name;
        }
        public override string ToString()
        {
            return string.Format("강사 이름 : {0}", Name);
        }
    }
}
