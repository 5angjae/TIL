using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 컬렉션1
{
    class LectureRoom:IEnumerable, IEnumerator
    {
        Tutor tutor = null;
        ArrayList Tutees = new ArrayList();

        

        public void AddTutee(Tutee tutee)
        {
            Tutees.Add(tutee);
        }
        public bool InTutor(Tutor tutor)
        {
            if(this.tutor == null)
            {
                this.tutor = tutor;
                return true;
            }
            return false;
        }
        IEnumerator IEnumerable.GetEnumerator()
        {
            return this;
        }

        int now = -1;
        bool IEnumerator.MoveNext()
        {
            now++;
            if(tutor == null)
            {
                if(now < Tutees.Count)
                {
                    return true;
                }
                IEnumerator et = this as IEnumerator;
                et.Reset();
                return false;
            }
            if (now <= Tutees.Count)
            {
                return true;
            }
            IEnumerator iet = this as IEnumerator;
            iet.Reset();
            return false;
        }

        void IEnumerator.Reset()
        {
            now = -1;
        }

        object IEnumerator.Current
        {
            get
            {
                if(tutor == null)
                {
                    return Tutees[now];
                }
                if (now == 0) 
                {
                    return tutor;
                }
                return Tutees[now - 1];
            }
        }
    }
}
