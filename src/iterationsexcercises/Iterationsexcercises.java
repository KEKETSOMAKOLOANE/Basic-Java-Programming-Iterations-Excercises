/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterationsexcercises;

/**
 *
 * @author Reverside
 */
public class Iterationsexcercises {

    //-----------------------------------F start------------------------------------------------
    public int findLargestNumber(int numbers[]){
    int largestNumber = numbers[0];
    
    for(int c=0; c<numbers.length;c++){
    if(numbers[c]>largestNumber)
        largestNumber=numbers[c];
    }
    return largestNumber;
    }
    //-----------------------------------F start------------------------------------------------
    public int findSecondLargestNumber(int numbers[]){
    int largestNumber = numbers[0];
    int secondLargestNumber = numbers[0];
    
    for(int c=0; c<numbers.length;c++){
    if(largestNumber==secondLargestNumber)
        if(numbers[c]<secondLargestNumber)
        secondLargestNumber = numbers[c]; 
    if(numbers[c]>=largestNumber)
        secondLargestNumber = largestNumber;
        largestNumber=numbers[c];
    if(numbers[c]<largestNumber && numbers[c]>secondLargestNumber)
        secondLargestNumber = numbers[c];
        
    }
    return secondLargestNumber;
    }
    //-----------------------------------F start------------------------------------------------
    public boolean findNumberInArray(int numbers[],int n){
    boolean status = false ;
    
    for(int c=0; c<numbers.length;c++){ 
    if(numbers[c]==n){
    status = true;
    //System.out.println(n + ": is available in the given array");
    break;
    }
    else if(numbers[c]!=n&&c==numbers.length ) 
        status = false;
        //System.out.println(n + ": is not available in the given array");
    //return status;
    
    }
    
    return status;
    }
    //-----------------------------------F start------------------------------------------------
    public int findNumberOfOccurances(int numbers[],int n){
    int occurance=0;
    
    for(int c=0; c<numbers.length;c++){ 
    if(numbers[c]==n)
    occurance++; //occurance = occurance++;
    }
     return occurance;//   System.out.println(n + ": has "+ occurance+ " in the given array!");
    }
    //-----------------------------------F start------------------------------------------------
    public int findNMaxOccurance(int num[]){
    int reversedNumber=0;
    int max = 0;
    for (int i = 0; i < num.length; i++) {
       int count = 0;
       for (int j = 0; j < num.length; j++) {
         if (num[i]==num[j])
             count++;
    }
    if (count >= max)
      max = count;
    }
    return max;
    }
    //-----------------------------------F start------------------------------------------------
    public int findSpaceOccurances(String sentence){
    int spaceOccurance=0;
    //String sentenceHolderArray[] = {sentence};
    
    for(int c=0; c<sentence.length();c++){
        char sh = sentence.charAt(c);
    if(sh==' ')
    spaceOccurance++; //occurance = occurance++;
    }
        
    return spaceOccurance;//System.out.println("Space has "+ spaceOccurance+ "occurances in the given sentence!");
    }
    //-----------------------------------F start------------------------------------------------
    public int countWords(String sentence){
    int wordCounts=1;
    //String sentenceHolderArray[] = {sentence};
    
    for(int c=0; c<sentence.length()-1;c++){
    if((sentence.charAt(c)==' ')&&(sentence.charAt(c+1)!=' '))
    wordCounts++; //occurance = occurance++;
    }
     return wordCounts;//   System.out.println("There are "+ wordCounts+ " words in the given sentence!");
    }
    //-----------------------------------F start------------------------------------------------
    public int[] sortArrayAsc(int numbers[]){
int temp;
for(int c=0;c<numbers.length;c++){
	for(int i=0;i<numbers.length;i++){
	if(numbers[c]>numbers[i]){
	temp=numbers[c];
	numbers[c]=numbers[i];
	numbers[i]=temp;
	}
}
}
int sortedArr[]=numbers;
for(int c=0;c<numbers.length;c++){
    sortedArr[c] = numbers[c];
 }
return sortedArr;//System.out.println(sortedArr);
}
    //-----------------------------------F start------------------------------------------------
    public int[] findEvenNumbers(int numbers[]){
    //int n = numbers.length;
    int evenNumbers[]=new int[numbers.length];
    
    for(int c=0;c<numbers.length; c++){
    if(numbers[c]%2==0){
    evenNumbers[c] = numbers[c];
    }
    }
return evenNumbers;
}
    //-----------------------------------F start------------------------------------------------
    static int n1=1, n2=2, n3=0;

    static int printFibonacci(int n){
        if(n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            printFibonacci(n-1);
        }
        return n3;
    }
    //-----------------------------------F start------------------------------------------------
    static String reverseString(String originalString){
        String reversedString="";
        for(int c=originalString.length()-1;c>=0;c--){
            reversedString=reversedString + originalString.charAt(c); 
        }
      
        return reversedString;
    }
    //-----------------------------------F start------------------------------------------------
    static int convertString(String numberString){
        int number=Integer.parseInt(numberString);
        return number;
    }

    //-----------------------------------F start------------------------------------------------
    public int findMaxDiff(int arr[]){
        int maximumDiff=arr[1]-arr[0];
        for(int c=0;c<arr.length;c++){
            for(int i=c+1;i<arr.length;i++){
            if(arr[i]-arr[c]>maximumDiff)
                maximumDiff= arr[i]-arr[c];
            }
        }
    return maximumDiff;
    }
    //-----------------------------------F start------------------------------------------------
    public int countDigits(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
    return count;
    }
    //-----------------------------------F start------------------------------------------------
    public int calculateDigitsSum(int num){
        int n,sum=0;
        while(num>0){
            n=num%10;
            sum=sum+n;
            num=num/10;
        }
    return sum;
    }
    //-----------------------------------F start------------------------------------------------
    public int calculateOddsSum(int num){
        int sum=0;
        for(int c=1;c<=num;c++){
            if(c%2!=0){
            sum=sum+c;
            }
            }
        
    return sum;
    }
    //-----------------------------------F start------------------------------------------------
    public  int swapNumbers(int num) {
        String inputString = String.valueOf(num);
        String outputString;
        if(inputString.length() == 1) {
            outputString = inputString;
        } 
        else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String remaining = inputString.substring(1, inputString.length() - 1);
            outputString = lastChar + remaining + firstChar;
        }
        int swappedNumber = Integer.parseInt(outputString);
        return swappedNumber;
    }
    //-----------------------------------F start------------------------------------------------
    public void checkAlphabets(char alphabet){
    boolean isVowel=false;
    boolean consonant=false;
    switch(alphabet)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println(alphabet+" is  a Vowel");
	}
	else {
	   if((alphabet>='a'&&alphabet<='z')||(alphabet>='A'&&alphabet<='Z'))
		System.out.println(alphabet+" is a consonant");
	   else
		System.out.println("Input is not an alphabet");		
        }
   }
    //-----------------------------------F start------------------------------------------------
    public int reverseNumber(int num){
    int reversedNumber=0;
    while(num!=0){
    reversedNumber=reversedNumber*10;
    reversedNumber=reversedNumber +num%10;
    num = num/10;
    }
    return reversedNumber;
   }

    //-----------------------------------F start------------------------------------------------
    
    //-----------------------------------F start------------------------------------------------
    
    //-----------------------------------F start------------------------------------------------
    public static void main(String[] args) {
        // TODO code application logic here
        Iterationsexcercises testProgram = new Iterationsexcercises();
        String solutionsDivisionLine ="--------------------------------------------------------";
        //---------------------Testing methods/functions----------------
        System.out.println(solutionsDivisionLine+"FIND LARGEST NUMBER"+solutionsDivisionLine);
        int nums[]={1123,678,9900,654};
        System.out.println(testProgram.findLargestNumber(nums));
        
        System.out.println(solutionsDivisionLine+"FIND SECOND NUMBER"+solutionsDivisionLine);
        int nums2[]={123,678,9900,654};
        System.out.println(testProgram.findSecondLargestNumber(nums2));
        
        System.out.println(solutionsDivisionLine+"FIND IF NUMBER IS AVAILABLE"+solutionsDivisionLine);
        int nums3[]={123,678,12433,9900,654};
        int numberToFind = 12433;
        System.out.println(testProgram.findNumberInArray(nums3,numberToFind));
        
        System.out.println(solutionsDivisionLine+"FIND NUMBER's OCCURANCES"+solutionsDivisionLine);
        int nums4[]={123,12433,678,12433,9900,654,12433};
        int numberToFind2 = 129433;
        System.out.println(testProgram.findNumberOfOccurances(nums4,numberToFind2));
        
        System.out.println(solutionsDivisionLine+"FIND MAX OCCURANCES"+solutionsDivisionLine);
        int nums5[]={123,12433,678,12433,9900,654,12433};
        System.out.println(testProgram.findNMaxOccurance(nums4));
        
        System.out.println(solutionsDivisionLine+"FIND NUMBER OF SPACES"+solutionsDivisionLine);
        String sentence ="I am leaving later today";
        System.out.println(testProgram.findSpaceOccurances(sentence));
        
        System.out.println(solutionsDivisionLine+"FIND NUMBER OF WORDS"+solutionsDivisionLine);
        String sentence2 ="I am leaving later today";
        System.out.println(testProgram.countWords(sentence2));
        
        System.out.println(solutionsDivisionLine+"SORT ARRAY NUMBERS"+solutionsDivisionLine);
        int  arrayNumbers[] ={12,83,89,894,940};
        System.out.println(testProgram.sortArrayAsc(arrayNumbers));
        
        System.out.println(solutionsDivisionLine+"FIND EVEN NUMBERS"+solutionsDivisionLine);
        int  arrayNumbers2[] ={12,83,89,894,940};
        System.out.println(testProgram.findEvenNumbers(arrayNumbers2));
        
        System.out.println(solutionsDivisionLine+"GENERATE FIBONACCI SERIES FOR N"+solutionsDivisionLine);
        int  Numbers2 =9;
        System.out.println(testProgram.printFibonacci(Numbers2));
        
        System.out.println(solutionsDivisionLine+"REVERSE THE STRING"+solutionsDivisionLine);
        String sentence3 ="I am leaving later today";
        System.out.println(testProgram.reverseString(sentence3));
        
        System.out.println(solutionsDivisionLine+"CONVERT STRING TO INT"+solutionsDivisionLine);
        String sentence4 ="4532";
        System.out.println(testProgram.convertString(sentence4));
        
        System.out.println(solutionsDivisionLine+"FIND MAX DIFFERENCE"+solutionsDivisionLine);
        int numbersString[] ={4532,23,100,234};
        System.out.println(testProgram.findMaxDiff(numbersString));
        
        System.out.println(solutionsDivisionLine+"COUNT DIGITS IN A NUMBER"+solutionsDivisionLine);
        int numbers =45333;
        System.out.println(testProgram.countDigits(numbers));
        
        System.out.println(solutionsDivisionLine+"CALCULATE INT DIGITS SUM"+solutionsDivisionLine);
        int numbers2 =45333;
        System.out.println(testProgram.calculateDigitsSum(numbers2));
        
        System.out.println(solutionsDivisionLine+"CALCULATE ODDs SUM"+solutionsDivisionLine);
        int numbers3 =6;
        System.out.println(testProgram.calculateOddsSum(numbers3));
        
        System.out.println(solutionsDivisionLine+"SWAP FIRST & LAST NUMBERS"+solutionsDivisionLine);
        int numbers4 =1235;
        System.out.println(testProgram.swapNumbers(numbers4));
        
        System.out.println(solutionsDivisionLine+"CHECK ALPHABETS"+solutionsDivisionLine);
        char Ach ='A';
        testProgram.checkAlphabets(Ach);
        
        System.out.println(solutionsDivisionLine+"SWAP FIRST & LAST NUMBERS"+solutionsDivisionLine);
        int numbers5 =1235;
        System.out.println(testProgram.reverseNumber(numbers5));
    }
    
}
