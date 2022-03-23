using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EFCore_TEST.Dtos
{
    public class GradeDto
    {
        public string GradeName { get; set; }
        public string Section { get; set; }
        public IList<StudentBaseDto> Students { get; set; }
    }
}
