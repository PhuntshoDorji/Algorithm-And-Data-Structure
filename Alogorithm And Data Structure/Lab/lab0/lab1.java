// public class lab1{
// 	public static void main(String[] args){
// 		//int[] num={2,3,4,5};
// 		int[] num; //declaring of array variable
// 		num= new int[4]; //declaring the size of array
// 		num[0]=2;
// 		num[1]=3;    //array initialization
// 		num[2]=4;
// 		num[3]=5;
// 		//to print array length
// 		//System.out.print(num.length);
// 		//num[0]=9;//change array element 
// 		//to print all array element
// 		for(int i=0;i<num.length;i++){
// 			System.out.println(num[i]);
// 		}
// 	}
// }
public class lab1{
	static int[] num; 
	public static int[] resize(int length){
		int[]temp = new int[length];
		for(int i=0; i<num.length;i++ ){
			temp[i]= num[i];
		}
		temp[length-1]=6;
		num=temp;
		return num;
	}
	public static void main(String[] args){
		num= new int[3]; //declaring the size of array
		num[0]=2;
		num[1]=3;    //array initialization
		num[2]=4;
		int[] newnum= resize(4);
		for(int i=0; i<newnum.length; i++){
			System.out.println(newnum[i]);
		}
	}
}