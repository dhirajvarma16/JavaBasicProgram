import java.util.*;
public class Numerology{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    String name=sc.nextLine();
    for(int i=0;i<name.length();i++){
        
        if(Character.isUpperCase(name.charAt(0))==false){
            System.out.println("Invalid name");
            System.exit(0);
        }
    }
    int count=65;
    int flag=0;result=0;
    char a[][]=new char[2][26];
    for(int j=0;j<26;j++)
    {
    if(count<90){
        a[0][j]=(char)count;
        count++;
    }    
    }
    a[1][0]=1;
    a[1][1]=2;
    a[1][2]=3;
    a[1][3]=4;
    a[1][4]=5;
    a[1][5]=8;
    a[1][6]=3;
    a[1][7]=5;
    a[1][8]=1;
    a[1][9]=1;
    a[1][10]=2;
    a[1][11]=3;
    a[1][12]=4;
    a[1][13]=5;
    a[1][14]=7;
    a[1][15]=8;
    a[1][16]=1;
    a[1][17]=2;
    a[1][18]=3;
    a[1][19]=4;
    a[1][20]=6;
    a[1][21]=6;
    a[1][22]=6;
    a[1][23]=5;
    a[1][24]=1;
    a[1][25]=7;
    for(int k=0;k<name.length();k++)
    {
    char n=name.charAt(k);
    int ascii=(int)n;
    if(ascii>=65 && ascii<=90){
        for(int j=0;j<26;j++){
            if(a[0][j]==n){
                result=result+a[1][j];
                }
        }
    }
    else{
        System.out.println("Invalid name");
        flag=1;
        break;
        
    }
        
    }
    if(flag==0){
        System.out.println("Your numerology no is:"+result);
    }
    
    }
}