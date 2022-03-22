package chap05;

//부분 집합 구하기
public class Powerset {

	int MAX = 4;
	int MAXCANDIDATES = 2;

	boolean is_a_solution(int k, int n) {
		return (k == n);
	}

	void process_solution(int a[], int k) {
		int i;
		System.out.print("{");
		for (i = 1; i <= k; i++) {
			if (a[i] == 1)
				System.out.print(i);
		}
		System.out.print("}\n");
	}

	int construct_candidates(int c[]) {
		c[0] = 1;
		c[1] = 0;
		int ncandidates = 2;
		return ncandidates;
	}

	void backtrack(int a[], int k, int input) {
		int[] c = new int[MAXCANDIDATES];
		int ncandidates = 0;
		int i = 0;

		if (is_a_solution(k, input)) {
			process_solution(a, k);
		} else {
			k++;
			ncandidates = construct_candidates(c);
			for (i = 0; i < ncandidates; i++) {
				a[k] = c[i];
				backtrack(a, k, input);
			}
		}
	}

	void generate_subsets(int n) {
		int a[] = new int[MAX];
		backtrack(a, 0, n);
	}

	public static void main(String[] args) {
		Powerset p = new Powerset();
		p.generate_subsets(3);
	}
}
