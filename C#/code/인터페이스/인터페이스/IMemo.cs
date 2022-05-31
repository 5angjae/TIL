using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 인터페이스
{
    interface IMemo
    {
        int MaxCount
        {
            get;
        }
        string this[int index]
        {
            get;
            set;
        }

    }
    class Note : IMemo
    {
        string[] pages = null;
        public string this[int index]
        {
            get
            {
                if (AvailIndex(index))
                {
                    return pages[index];
                }
                return null;
            }
            set
            {
                if (AvailIndex(index))
                {
                    pages[index] = value;
                }
            }
        }

        private bool AvailIndex(int index)
        {
            return (index >= 0) && (index < MaxCount);
        }

        public int MaxCount
        {
            get;
            private set; // 약속하지 않은 것들이 있어도 상관은 없다.
        }
        public Note(int max_memo)
        {
            MaxCount = max_memo;
            pages = new string[max_memo];
        }
    }
    class Note2 : IMemo // 
    {
        List<string> pages = new List<string>();
        public string this[int index]
        {
            get
            {
                if ((index >= 0) && (index < pages.Count))
                {
                    return pages[index];
                }
                return null;
            }
            set
            {
                if (index < pages.Count)
                {
                    pages[index] = value;
                    return;
                }

                // a,0,0,0,0
                while (pages.Count < index)
                {
                    pages.Add(string.Empty);
                }
                // a,0,0,0,0,b
                pages.Add(value);
            }
        }
        
        public int MaxCount
        {
            get
            {
                return pages.Count;
            }
        }
    }
}
