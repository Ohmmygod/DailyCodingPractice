#include <unistd.h>

void	ft_putchar(char c)
{
	write(1, &c, 1);
}

int	ft_strlen(char *str)
{
	int	i;

	i = 0;
	while (str[i])
		i++;
	return (i);
}

void	ft_putstr_rev(char *str, int i)
{
	while (i >= 0)
	{
		ft_putchar(str[i]);
		i--;
	}
}

int	main(int argc, char **argv)
{
	if (argc != 2)
	{
		ft_putchar('\n');
		return (0);
	}
	ft_putstr_rev(argv[1], ft_strlen(argv[1]) - 1);
	ft_putchar('\n');
	return (0);
}

