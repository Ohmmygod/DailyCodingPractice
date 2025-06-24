#include <unistd.h>

void	ft_putchar(char c)
{
	write(1, &c, 1);
}

void	ft_putstr(char *str)
{
	int	i;

	i = 0;
	while (str[i])
	{
		ft_putchar(str[i]);
		i++;
	}
}

int	ft_strcmp(char *s1, char *s2)
{
	int	i;

	i = 0;
	while (s1[i] || s2[i])
	{
		if (s1[i] != s2[i])
			return (s1[i] - s2[i]);
		i++;
	}
	return (s1[i] - s2[i]);
}

#include <stdio.h>

int	main(void)
{
	//if (argc < 1)
	//{
	//	ft_putchar('\n');
	//	return (0);
	//}
	char	*s1 = "hello";
	char	*s2 = "hell";
	char	*s3 = "hel";

	printf("testcase1: %d\n", ft_strcmp(s2, s1));
	printf("testcase2: %d\n", ft_strcmp(s3, s1));

	return (0);
	
}
