public class PairsInArray {
    public static void printPairs(int numbers[]){
        int total_pairs = 0;
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")" + "  ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+total_pairs);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,5,6,8,10};
        printPairs(numbers);
        }
}
