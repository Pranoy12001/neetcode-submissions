/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (Interval i : intervals) {
            if (minHeap.size() == 0) {
                minHeap.add(i.end);
            } else {
                if (minHeap.peek() > i.start) {
                    minHeap.add(i.end);
                } else {
                    minHeap.remove();
                    minHeap.add(i.end);
                }
            }
        }

        return minHeap.size();
    }
}
