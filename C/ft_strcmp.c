#include <stdio.h>
#include <string.h>

int	main(void)
{
	char *s1 = "Hello";
	char *s2 = "Hell";
	
	char *s3 = "hel";

	printf("testcase1: %d\n", strcmp(s1, s2));
	printf("testcase2: %d\n", strcmp(s1, s3));

	return (0);
}
