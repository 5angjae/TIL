using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 인덱서
{
    class MyDictionary
    {
        string[] storage = new string[3];
        public string this[int index]
        {
            get
            {
                if (AvailIndex(index))
                {
                    return GetValue(storage[index]);
                }
                return string.Empty;
            }
        }
        public string this[string key]
        {
            get
            {
                string element = FindKey(key);
                return GetValue(element);
            }
        }

        private string FindKey(string key)
        {
            foreach(string s in storage)
            {
                if (s.StartsWith(key))
                {
                    return s;
                }
            }
            return string.Empty;
        }

        private string GetValue(string v)
        {
            int index = v.IndexOf("=");
            return v.Substring(index + 1);
        }

        private bool AvailIndex(int index)
        {
            return (index >= 0) && (index < storage.Length);
        }

        public MyDictionary()
        {
            for(int i = 0; i<storage.Length; i++)
            {
                storage[i] = string.Format("key{0} = value{0}", i);
            }
        }
    }
}
