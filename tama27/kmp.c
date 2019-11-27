#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
char str[30], pattern[30];
printf("\nEnter a String:\t");
scanf("%s", str);
printf("\nEnter a Pattern to Match:\t");
scanf("%s", pattern);
kmp_matcher(str,pattern);
}


kmp_matcher(char t[],char p[])
{
int pi[50];
int n=strlen(t);
int m=strlen(p);
int pi=computeprefixfunction(p);
int q=0;
int i;
for(i=1;i<=n;i++)
{while(q>0 && p[q+1]!=t[i])
q=pi[q];
if(p[q+1]==t[i])
q=q+1;
if(q==m)
{printf("pattern occurs with shift %d",(i-m));
q=pi[q];}
}}



computeprefixfunction(char p[])
{
int m=strlen(p);
pi[1]=0;
k=0;
for(q=2;q<=m;q++)
{
while(k>0 && p[k+1]!=p[q])
k=pi[k];
if(p[k+1]==p[q])
k=k+1;
pi[q]=k;}
return pi;
}
