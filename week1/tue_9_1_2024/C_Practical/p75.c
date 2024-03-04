#include<stdio.h>
#include <stdlib.h>
int main(){
	int number;
	int *ptr;
	printf("Enter the number of elements : ");
	scanf("%d",&number);
	
	ptr=(int*)malloc(number*sizeof(int));
	if(ptr == NULL){
		printf("Memory is not allocated");
		exit(0);
	}
	else{
		printf("Memory allocated succefully");
	}
	realloc(ptr,0);
	
	return 0;
}