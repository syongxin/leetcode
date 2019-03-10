public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] res = new int[2];

        if (nums == null || nums.length == 0) {
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                res[0] = map.get(diff);
                res[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return res;
    }
}