#include <stdio.h>
#include <string.h>

int	main(void)
{
	char *s1 = "Hello";
	char *s2 = "Hell";
	
	char *s3 = "hel";

	printf("testcase1: %d\n", strcmp(s2, s1));
	printf("testcase2: %d\n", strcmp(s3, s1));

	return (0);
}
