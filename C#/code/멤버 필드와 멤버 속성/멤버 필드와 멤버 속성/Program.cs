using System;

namespace 멤버_필드와_멤버_속성
{
    class Man
    {
        // 멤버 필드
        string name;
        int hp = 0;
        // 멤버 속성
        public string Name
        {
            get
            {
                return name;
            }
        }
        public int Hp
        {
            get //가져오기
            {
                return hp;
            }
            private set // 설정하기
            {
                hp = value;
            }
        }
        public Man(string name)
        {
            this.name = name;
            Hp = 100;
        }
        public void Work()
        {
            hp += 5;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Man man = new Man("홍길동");
            Console.WriteLine("이름 : {0}", man.Name);
            man.Work();
            Console.WriteLine("체력 : {0}", man.Hp);
            
        }
    }
}
