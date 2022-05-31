using System;

namespace 인터페이스
{
    class Program
    {
        static void Main(string[] args)
        {
            Note note = new Note(3);
            Console.WriteLine("최대 {0}개의 메모를 남길 수 있음", note.MaxCount);
            note[0] = "김상재";
            note[1] = "sangjea5@naver.com";
            Console.WriteLine("메모 목록");
            for(int i=0; i < note.MaxCount; i++)
            {
                Console.WriteLine("{0}", note[i]);
            }

            Console.WriteLine("=====================================");
            ////
            Note2 note2 = new Note2();
            Console.WriteLine("메모장 용량 제한 없음");
            note2[0] = "Hello";
            note2[2] = "하이"; // 집어넣은 순서로 들어간다. Add를 사용해서
            note2[1] = "야호";
            Console.WriteLine("메모 목록");
            for (int i = 0; i < note2.MaxCount; i++)
            {
                Console.WriteLine("{0}", note2[i]);
            }
        }
    }
}
