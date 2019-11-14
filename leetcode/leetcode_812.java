package leetcode;

public class leetcode_812 {
    class Solution {
        public double largestTriangleArea(int[][] points) {
            double max =0;
            for (int i=0;i<points.length;i++){
                for (int j=i+1;j<points.length;j++){
                    for (int k=j+1;k<points.length;k++){
                        max = Math.max(max,Area(points[i],points[j],points[k]));
                    }
                }
            }
            return max;
        }
        public double Area(int[] R,int[] P,int[] Q){
           // return 0.5*Math.abs(R[0]*P[1]+R[0]*Q[1]+P[0]*Q[1]-R[1]*P[0]-R[1]*Q[0]-P[1]*Q[0]);
            return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]-P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
        }
    }
}
