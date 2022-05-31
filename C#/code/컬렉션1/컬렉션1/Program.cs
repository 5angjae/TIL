using System;

namespace 컬렉션1
{
    class Program
    {
        static void Main(string[] args)
        {
            //MemberCollection mc = new MemberCollection();
            //mc.AddMember(new Member(1, "홍길동"));
            //mc.AddMember(new Member(2, "강감찬"));

            //foreach(Member member in mc) // IEnumerable 약속이 없어서 오류 발생
            //{
            //    Console.WriteLine(member);
            //}

            LectureRoom lr = new LectureRoom();
            lr.AddTutee(new Tutee("학1"));
            lr.AddTutee(new Tutee("학2"));
            lr.AddTutee(new Tutee("학3"));
            lr.InTutor(new Tutor("강1"));
            foreach(Object obj in lr)
            {
                Console.WriteLine(obj);
            }
        }
    }
}


