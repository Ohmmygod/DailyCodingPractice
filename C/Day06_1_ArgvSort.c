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

void	ft_swap(char *s1, char *s2)
{
	char	*tmp;
	
	tmp = s1;
	s1 = s2;
	s2 = tmp;
}

int	main(int argc, char **argv)
{
	if (argc < 1)
	{
		ft_putchar('\n');
		return (0);
	}

	int	trial;
	int	arg_idx;
	int	i;

	arg_idx = 1;
	trial = argc - 1;
	while (arg_idx < trial - 1)
	{
		i = arg_idx + 1;
		while (i < trial - 1)
		{
		
		}
	}
	return (0);

}

/*Wed, 25th June 2025 - 00:08 AM, only bubble sort is required */
