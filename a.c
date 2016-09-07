#include <stdio.h>
int myAtoi(char*);
int main()
{
	char str[]="2147483648";
	int res = myAtoi(str);
	printf("%d\n",res);
	return 0;
}
int myAtoi(char* str) 
{
	//printf("myAtoi begin\n");
	long long   max=2147483647;
	long long  max1=2147483648;
    char flag='+';
    if(*str==0)
        return 0;
    while(*str==' ')
        str++;
    if(*str=='+')
    {
    //	printf("*str=='+'\n");
        flag='+';
        str++;
    }else if(*str=='-')
    {
    //	printf("*str=='+'\n");
        flag='-';
        str++;
    }
    if(*str<'0'||*str>'9') return 0;
    long long res=(*str-'0');
    //printf("long long res=*str-'0';:%lld\n",res);
    str++;
    while(*str!=0){
    //	printf("while enter\n");
        if(*str<'0'||*str>'9')break;
        else 
        {
        res=res*10+*str-'0';
      //  printf("res:%lld\n",res);
      //  printf("str:%s\n",str);
        if(flag=='+'){
            if(res>max)return (int)max;
        }else if(flag=='-'){
            if(res>max1)return (int)(0-max1);
        }
        }
        str++;
    }
    //printf("res:%lld\n",res);
    if(flag=='+')
        return (int)res;
    else return 0-(int)res;
    
}