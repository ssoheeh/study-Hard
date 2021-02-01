#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	
	long long n,m;
	scanf("%lld %lld", &n,&m);
	long long re = n > m ? n - m : m - n;
	printf("%lld", re);

	return 0;
}