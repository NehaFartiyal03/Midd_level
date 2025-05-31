class IntToRom {
    public String intToRoman(int num) {
        List<Integer> values = Arrays.asList(1000, 900, 500, 400, 100, 90, 50 , 40, 10 ,9 , 5, 4, 1);
        List<String> symbols = Arrays.asList("M" , "CM" , "D" , "CD" , "C", "XC" , "L", "XL", "X", "IX" , "V", "IV", "I");
        StringBuilder result = new StringBuilder();
        for(int i =0; i< values.size(); i++) {
            while (num >= values.get(i)) {
                
                result.append(symbols.get(i));
                num -= values.get(i);
            }
        }
        return result.toString();
        
    }
}
