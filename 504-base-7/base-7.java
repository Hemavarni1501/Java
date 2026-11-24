class Solution {
    public String convertToBase7(int num) {
        // Handle zero directly
        if (num == 0) return "0";

        // Handle negative numbers
        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder base7 = new StringBuilder();

        // Convert to base 7
        while (num > 0) {
            int remainder = num % 7;
            base7.append(remainder);
            num /= 7;
        }

        // Reverse the result since we built it backwards
        base7.reverse();

        // Add negative sign if needed
        if (isNegative) base7.insert(0, "-");

        return base7.toString();
    }
}