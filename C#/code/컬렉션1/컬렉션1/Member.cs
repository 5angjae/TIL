using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 컬렉션1
{
    class Member
    {
        public int Id
        {
            get;
            private set;
        }
        public string Name
        {
            get;
            private set;
        }
        public Member(int id, string name)
        {
            Id = id;
            Name = name;
        }
        public override string ToString()
        {
            return string.Format("아이디 : {0}, 이름 : {1}", Id, Name);
        }
    }
}
