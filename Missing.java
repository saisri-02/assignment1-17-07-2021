class Solution
{
public int firstMissingPositive(int[] nums) {
Set<Integer> s=new HashSet<Integer>();
for(int i:nums)
{
s.add(i);
}
int n=nums.length;
for(int i=0;i<=n;i++)
{
if(s.contains(i)==false)
{
return i;
}
}
return n+1;
}
}

output:

Your input  [1,2,0]
Output      3
Expected    3
