import java.util.*;

public class toggle {

    public static List<Integer> getPosDigits(Map<Integer, String> digitMap, String fd) {
        List<Integer> digits = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : digitMap.entrySet()) {
            int mismatch = 0;
            String pattern = entry.getValue();
            for (int i = 0; i < fd.length(); i++) {
                if (fd.charAt(i) != pattern.charAt(i)) {
                    mismatch++;
                }
            }
            if (mismatch <= 1) {
                digits.add(entry.getKey());
            }
        }
        return digits;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        List<String> seg = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            seg.add(sc.nextLine().strip());
        }

        List<String> inp = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            inp.add(sc.nextLine().strip());
        }

        Map<Integer, String> digitMap = new HashMap<>();
        for (int d = 0; d < 10; d++) {
            StringBuilder pat = new StringBuilder();
            for (int r = 0; r < 3; r++) {
                pat.append(seg.get(r).substring(d * 3, (d + 1) * 3));
            }
            digitMap.put(d, pat.toString());
        }

        List<List<Integer>> posNums = new ArrayList<>();
        for (int i = 0; i < inp.get(0).length() / 3; i++) {
            StringBuilder fd = new StringBuilder();
            for (int r = 0; r < 3; r++) {
                fd.append(inp.get(r).substring(i * 3, (i + 1) * 3));
            }
            List<Integer> matches = getPosDigits(digitMap, fd.toString());
            if (matches.isEmpty()) {
                System.out.print("Invalid");
                return;
            }
            posNums.add(matches);
        }

        int total = 0;
        for (List<Integer> comb : getCombinations(posNums)) {
            StringBuilder num = new StringBuilder();
            for (int d : comb) {
                num.append(d);
            }
            total += Integer.parseInt(num.toString());
        }
        System.out.print(total);
    }

    public static List<List<Integer>> getCombinations(List<List<Integer>> posNums) {
        List<List<Integer>> res = new ArrayList<>();
        genComb(posNums, 0, new ArrayList<>(), res);
        return res;
    }

    private static void genComb(List<List<Integer>> posNums, int idx, List<Integer> cur, List<List<Integer>> res) {
        if (idx == posNums.size()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int d : posNums.get(idx)) {
            cur.add(d);
            genComb(posNums, idx + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}