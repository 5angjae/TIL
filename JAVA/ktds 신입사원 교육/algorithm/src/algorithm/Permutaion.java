package chap05;

//순열구하기
public class Permutaion {
	int MAX = 4;
	int MAXCANDIDATES = 3;

	boolean is_a_solution(int k, int n) {
		return (k == n);
	}

	void process_solution(int a[], int k) {
		System.out.print("{");
		for (int i = 1; i <= k; i++)
			System.out.print(a[i]);
		System.out.print("}\n");
	}

	int construct_candidates(int a[], int c[],int k, int n) {
		int in_perm[] = new int[MAX];
		for (int i = 0; i < k; i++){
			in_perm[a[i]] = 1;
		}
		int ncandidates = 0;
		for (int i = 1; i <= n; i++) {
			if (in_perm[i] == 0) {
				c[ncandidates] = i;
				ncandidates++;
			}
		}
		return ncandidates;
	}

	void backtrack(int a[], int k, int input) {
		int c[] = new int[MAXCANDIDATES];
		int ncandidates = 0;
		int i = 0;

		if (is_a_solution(k, input)) {
			process_solution(a, k);
		} else {
			k++;
			ncandidates = construct_candidates(a, c,k, input);
			for (i = 0; i < ncandidates; i++) {
				a[k] = c[i];
				backtrack(a, k, input);
			}
		}
	}

	void generate_permutations(int n) {
		int a[] = new int[MAX];
		backtrack(a, 0, n);
	}

	public static void main(String[] args) {
		Permutaion p = new Permutaion();
		p.generate_permutations(3);
	}
}
