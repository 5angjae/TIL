using System;

namespace 배열
{
    class Program
    {
        static void Main(string[] args)
        {
            // DemoOne();
            // DemoMany();
            DemoJagged();
        }

        private static void DemoJagged()
        {
            int[][] arr1;
            arr1 = new int[2][];
            arr1[0] = new int[3];
            arr1[1] = new int[8];

            int[][] arr2 = new int[3][];
            int[][] arr3 = new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6, 7, 8 } };
            
            foreach(int[] elarray in arr3)
            {
                foreach(int ele in elarray)
                {
                    Console.Write("{0} ", ele);
                }
                Console.WriteLine();
            }
        }


        /*
        private static void DemoMany()
        {
            // 다차원 배열 선언 - 대괄호에 콤마를 사용하여 선언
            // 원소형식[,,];
            int[,] arr1 = new int[3, 2];
            arr1 = new int[,] { { 1, 2 }, { 4, 5 }, { 10, 20 } };
            int[,,] arr2 = new int[4, 3, 2];
            int[,] arr3 = new int[,] { { 1, 2 }, { 4, 5 }, { 10, 20 } };
            int[,] arr4 = new int[3,2] { { 1, 2 }, { 4, 5 }, { 10, 20 } };

            Console.WriteLine("차수 : {0} , 요소의 개수 : {1}", arr1.Rank, arr1.Length);
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 2; j++)
                {
                    Console.WriteLine(arr1[i, j]);
                }
                Console.WriteLine("......");
            }
        }

        
        private static void DemoOne()
        {
            // 원소형식[] 변수명;
            int[] arr1;
            arr1 = new int[5]; // 크기가 5인 정수형 배열 동적 생성
            
            // 원소형식[] 변수명 = 동적으로 배열 개체 생성
            int[] arr2 = new int[5];

            //원소형식[] 변수명 = 동적으로 배열 개체 생성 ( 초기 원소 값 결정 )
            int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
            int[] arr4 = new int[5] { 1, 2, 3, 4, 5 };

            // 배열의 원소에 접근할 때 - 배열명[원소의 인덱스]
            // 인덱스 : 0 부터 시작
            for(int i = 0; i<arr1.Length; i++)
            {
                arr1[i] = i * i;
            }
            for(int i=0; i<arr1.Length; i++)
            {
                Console.WriteLine(arr1[i]);
            }

            // 배열 - Array 추상 클래스를 기반으로 파생한 형식
            // array의 정적 메서드 Sort 사용
            int[] arr = new int[] { 10, 2, 5, 8, 4, 1, 2, 3 };
            Console.WriteLine("요소의 개수 : {0}", arr.Length);
            foreach(int i in arr)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine("=============================");
            Array.Sort(arr);
            Console.WriteLine("정렬 후");
            foreach (int i in arr)
            {
                Console.WriteLine(i);
            }
        }
        */
    }
}
