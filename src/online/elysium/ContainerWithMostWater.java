package online.elysium;

class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        //[i, j] area = (j - i) * min(height[i], height[j])
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int w = i - j;
                int h = Math.min(height[i], height[j]);
                int area = w * h;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}