
class Solution
 {
    public List<Integer> spiralOrder(int[][] a) {
        ArrayList<Integer> b=new ArrayList<Integer>();
         int i;
         int k=0;
int top=0,down=a.length-1,left=0,right=a[0].length-1;
int dir=0;
while(top<=down && left<=right)
{
if(dir==0)
{
for(i=left;i<=right;i++)
{
    b.add(a[top][i]);
}
top+=1;
}
else if(dir==1)
{
for(i=top;i<=down;i++)
{
    b.add(a[i][right]);
    k+=1;
}
right-=1;
}
else if(dir==2)
{
for(i=right;i>=left;i--)
{
    b.add(a[down][i]);
    k+=1;
}
down-=1;
}
else if(dir==3)
{
for(i=down;i>=top;i--)
{
    b.add(a[i][left]);
    k+=1;
}
left+=1;
}
dir=(dir+1)%4;
}
return b;
    }
}