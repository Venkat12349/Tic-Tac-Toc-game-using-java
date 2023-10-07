import java.util.Scanner;
class Demo
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[][] s=new String[3][3];
s[0][0]="_";s[0][1]="_";s[0][2]="_";
s[1][0]="_";s[1][1]="_";s[1][2]="_";
s[2][0]="_";s[2][1]="_";s[2][2]="_";
//int count=0;
while(s[0][0]=="_"|s[0][1]=="_"|s[0][2]=="_"|s[1][0]=="_"|s[1][1]=="_"|s[1][2]=="_"|s[2][0]=="_"|s[2][1]=="_"|s[2][2]=="_"){
for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
{System.out.print(s[i][j]+" ");}System.out.println();
}
System.out.println("player 1 enter no and your's is o:");
int a=sc.nextInt();
switch(a){
case 1:if(s[0][0]=="_"){
s[0][0]="o";}
break;
case 2:if(s[0][1]=="_"){
s[0][1]="o";}
break;
case 3:if(s[0][2]=="_"){
s[0][2]="o";}
break;
case 4:if(s[1][0]=="_"){
s[1][0]="o";}break;
case 5:if(s[1][1]=="_"){s[1][1]="o";}break;
case 6:if(s[1][2]=="_"){s[1][2]="o";}break;
case 7:if(s[2][0]=="_"){s[2][0]="o";}break;
case 8:if(s[2][1]=="_"){s[2][1]="o";}break;
case 9:if(s[2][2]=="_"){s[2][2]="o";}break;
}
//count++;
//if(count==9){
//break; }
System.out.println("player 2 enter no and your's is x:");
int b=sc.nextInt();
switch(b){
case 1:if(s[0][0]=="_"){s[0][0]="x";}break;
case 2:if(s[0][1]=="_"){s[0][1]="x";}break;
case 3:if(s[0][2]=="_"){s[0][2]="x";}break;
case 4:if(s[1][0]=="_"){s[1][0]="x";}break;
case 5:if(s[1][1]=="_"){s[1][1]="x";}break;
case 6:if(s[1][2]=="_"){s[1][2]="x";}break;
case 7:if(s[2][0]=="_"){s[2][0]="x";}break;
case 8:if(s[2][1]=="_"){s[2][1]="x";}break;
case 9:if(s[2][2]=="_"){s[2][2]="x";}break;
}//count++;
}
if((s[0][0]=="o"&s[0][1]=="o"&s[0][2]=="o")|(s[1][0]=="o"&s[1][1]=="o"&s[1][2]=="o")|(s[2][0]=="o"&s[2][1]=="o"&s[2][2]=="o")|(s[0][0]=="o"&s[1][0]=="o"&s[2][0]=="o")|(s[0][1]=="o"&s[1][1]=="o"&s[2][1]=="o")|(s[0][2]=="o"&s[1][2]=="o"&s[2][2]=="o")|(s[0][0]=="o"&s[1][1]=="o"&s[2][2]=="o")|(s[0][2]=="o"&s[1][1]=="o"&s[2][0]=="o")){
System.out.println("player 1 wins");}
else if((s[0][0]=="x"&s[0][1]=="x"&s[0][2]=="x")|(s[1][0]=="x"&s[1][1]=="x"&s[1][2]=="x")|(s[2][0]=="x"&s[2][1]=="x"&s[2][2]=="x")|(s[0][0]=="x"&s[1][0]=="x"&s[2][0]=="x")|(s[0][1]=="x"&s[1][1]=="x"&s[2][1]=="x")|(s[0][2]=="x"&s[1][2]=="x"&s[2][2]=="x")|(s[0][0]=="x"&s[1][1]=="x"&s[2][2]=="x")|(s[0][2]=="x"&s[1][1]=="x"&s[2][0]=="x")){System.out.println("player 2 wins");}
else{
System.out.println("draw");
}
for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
{System.out.print(s[i][j]+" ");}System.out.println();
}}}
