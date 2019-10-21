import java.util.*;

public class Quora{
	public static void main(String[] args){

		// int ans = removeOneDigit("ab12c", "1zz456");
		// int three = threeCharDistinct("abcdaaae");
		// System.out.println(closestString("babzccc", "bbazzcz"));

		// List<Integer> ans = countingOutRhyme(5,3);
		// for(int n: ans){
		// 	System.out.println(n);
		// }
		String[] a = {"one","two", "three"};
		String[] b = {"one"};
		System.out.println(isPrefix(a,b));
		// System.out.println(three);
	}

	// 1
	public static int threeCharDistinct(String s){
		if(s == null || s.length() < 3) return 0;

		int ans = 0;
		for(int i = 0; i < s.length()-2; i++){
			char first = s.charAt(i);
			char mid = s.charAt(i+1);
			char last = s.charAt(i+2);
			// make sure each pair is distinct
			if(first != mid && first != last && mid != last){
				ans++;
			}
		}

		return ans;
	}

 	// 2
	public static int longestEqualSubarray(int[] a){
		if(a.length == 0) return 0;

		Map<Integer, Integer> map = new HashMap();
		map.put(0,-1);
		int ans = 0, count = 0;
		for(int i = 0; i < a.length; i++){
				a[i] = a[i] == 0? -1: 1;
				count += a[i];
				if(map.containsKey(count)){
						ans = Math.max(ans, i - map.get(count));
				}else{
						map.put(count, i);
				}
		}
		return ans;
	}

	// 3
	public static int removeOneDigit(String s, String t){
		int ans = 0;

		for(int i = 0; i < s.length(); i++){
			StringBuilder sb = new StringBuilder();
			if(Character.isDigit(s.charAt(i))){
				sb.append(s.substring(0,i));
				sb.append(s.substring(i+1));
				if(sb.toString().compareTo(t) < 0){
					ans++;
				}
			}
		}

		for(int i = 0; i < t.length(); i++){
			StringBuilder sb = new StringBuilder();
			if(Character.isDigit(t.charAt(i))){
				sb.append(t.substring(0,i));
				sb.append(t.substring(i+1));
				if(sb.toString().compareTo(s) > 0){
					ans++;
				}
			}
		}
		return ans;
	}

	//4
	public static int[][] rotateOverDiagonals(int[][] m, int k){
		if(m.length == 0 || m == null ){
			return m;
		}
		k = k % 4;
		for(int i = 0; i < k; i++){
			rotate(m);
		}
		return m;
	}

	static int[][] rotate(int[][] m){
		int rows = m.length, cols = m[0].length;

		// transpose
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(i != j && i != cols-1- j){
					int temp = m[i][j];
					m[i][j] = m[j][i];
					m[j][i] = temp;
				}
			}
		}
		// reverse reach row, except the diagonals
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(i != j && i != cols-1- j){
					int temp = m[i][j];
					m[i][j] = m[i][cols -1 -j];
					m[i][cols-1-j] = temp;
				}
			}
		}
		return m;
	}

	// 5
	public static int product_sum(int num){
		int product = 1, sum = 0;
		while(num != 0){
			int digit = num % 10;
			num /= 10;
			product *= digit;
			sum += digit;
		}
		return product - sum;
	}

	// 6
	public static int ribbon(int[] arr, int k){
		int max = 0;
		for(int n : arr){
			max = Math.max(n,max);
		}

		int low = 1, high = max;
		while(low <= high){
			int mid = low + (high - low) / 2;
			int len = helper(arr, mid);
			if(len >= k){
				low = mid+1;
			}else{
				high = mid -1;
			}
		}
		return high;
	}

	static int helper(int[] arr, int len){
		int ans = 0;
		for(int num: arr){
			ans += (num / len);
		}

		return ans;
	}

	// 7
	public static int goodTuple(int[] arr){
		if(arr==null || arr.length < 3){
			return 0;
		}
		int ans = 0;
		for(int i = 0; i < arr.length -2;i++){
			int a = arr[i], b = arr[i+1], c = arr[i+2];
			if((a == b && a != c) && (a == c && a != b) && (b == c && a != b))
				ans++;
		}
		return ans;
	}

	// 8
	public static boolean closestString(String a, String b){
		int[] map_a = new int[26];
		int[] map_b = new int[26];
		Map<Integer, Integer> map_count = new HashMap();
		if(a.length() != b.length()) return false;
		for(int i = 0; i < a.length(); i++){
			map_a[a.charAt(i)-'a']++;
			map_b[b.charAt(i)-'a']++;
		}
		for(int n: map_a){
			if(n > 0)
				map_count.put(n, map_count.getOrDefault(n, 0)+1);
		}

		for(int n: map_b){
			if(n > 0){
				if(map_count.containsKey(n)){
					map_count.put(n, map_count.get(n)-1);
					if(map_count.get(n) == 0){
						map_count.remove(n);
					}
				}
			}
		}
		if(map_count.size() == 0) return true;
		return false;

	}
	public static boolean isPrefix(String[] a, String[] b){
		Set<String> set = new HashSet();
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(i != j){
					set.add(a[i]+a[j]);
				}else{
					set.add(a[i]);
				}
			}
		}

		for(int i = 0; i < b.length; i++){
			if(!set.contains(b[i])){
				return false;
			}
		}
		return true;
	}

	public static int maxArithmeticLength(int[] A){
		int res = 2, n = A.length;
    HashMap<Integer, Integer>[] dp = new HashMap[n];
    for (int j = 0; j < A.length; j++) {
        dp[j] = new HashMap<>();
        for (int i = 0; i < j; i++) {
            int d = A[j] - A[i];
            dp[j].put(d, dp[i].getOrDefault(d, 1) + 1);
            res = Math.max(res, dp[j].get(d));
        }
    }
		return res;
	}

	public static List<Integer> countingOutRhyme(int n, int k){
		List<Integer> list = new LinkedList();
		List<Integer> ans = new ArrayList();
		for(int i = 1; i <= n; i++)	list.add(i);

		int index = 0;
		while(list.size() > 1){
			index = (index + k -1 ) % list.size();
			ans.add(list.remove(index));
		}

		return ans;
	}
}
