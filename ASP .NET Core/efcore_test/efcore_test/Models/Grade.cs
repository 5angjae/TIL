using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Models
{
    public class Grade
    {
        List<Student> Lst = new List<Student>();
        public int GradeId { get; set; }
        public string GradeName { get; set; }
        public string Section { get; set; }

        public ICollection<Student> Students
        {
            get
            {
                return Lst;
            }
            set
            {
                Lst = (List<Student>)value;
            }
        }
    }
}
