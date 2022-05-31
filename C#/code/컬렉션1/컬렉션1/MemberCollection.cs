using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 컬렉션1
{
    class MemberCollection:IEnumerable
    {
        ArrayList ar = new ArrayList();
        public void AddMember(Member member)
        {
            ar.Add(member);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return ar.GetEnumerator();
        }
    }
}
