public class ArrayAsArgs/* Call BY Ref. */ {
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {
            99,98,88
        };
        update(marks);

        // print marks
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
