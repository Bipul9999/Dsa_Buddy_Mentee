class TowerOfHanoi{

public static void main(String args[])
{
int n=3;
towerOfHanoi(n,"source","destination","auxilary");
}
static void towerOfHanoi(int n,String s, String d,String a){

if(n==1){
System.out.println("Move disk 1 from rod "+s+" to rod "+d);
return;
}

towerOfHanoi(n-1,s,a,d);
System.out.println("Move disk "+n+" from rod "+s+ "to rod "+d);
towerOfHanoi(n-1,a,d,s);


}
}