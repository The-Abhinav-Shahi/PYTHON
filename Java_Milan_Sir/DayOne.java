class DayOne {
    public static void main(String[] args) {
        int i = 8, j = 5, k;
        float x = 0.005f, y = -0.01f, z;
        char a, b, c = 'c', d = 'd';
        z = x = i;
        z = (x >= 0) ? x : 0;
        z = (y >= 0) ? y : 0;
        k = (int) (z = x);
        a = (c < d) ? c : d;
        System.out.println("(3 * i - 2 * j ) % ( 2 * d - c ) is " + (3 * i - 2 * j ) % ( 2 * d - c ));
        System.out.println("2 * ( ( i / 5) + ( 4 * ( j - 3 ) ) % ( i + j - 2 ) ) is " + 2 * ( ( i / 5) + ( 4 * ( j - 3 ) ) % ( i + j - 2 ) ));
        System.out.println("(i - 3 * j ) % ( c + 2 * d ) / ( x - y ) is " + (i - 3 * j ) % ( c + 2 * d ) / ( x - y ));
        System.out.println("-(i + j ) is " + -(i + j ));
        System.out.println("++i is " + (++i));
        System.out.println("i++ is " + (i++));
        System.out.println("--j is " + (--j));
        System.out.println("++x is " + (++x));
        System.out.println("y-- is " + (y--));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("c > d is " + (c > d));
        System.out.println("x >= 0 is " + (x >= 0));
        System.out.println("x < y is " + (x < y));
        System.out.println("j != 6 is " + (j != 6));
        System.out.println("c == 99 is " + (c == 99));
        System.out.println("5 * (i + j ) > 'c' is " + (5 * (i + j ) > 'c'));
        System.out.println("(2 * x + y ) == 0 is " + ((2 * x + y ) == 0));
        // System.out.println("2 * x + ( y == 0) is " + (2 * x + (y == 0)));
        System.out.println("2 * x + y == 0 is " + (2 * x + y == 0));
        System.out.println("!(i <= j ) is " + (!(i <= j )));
        System.out.println("!(c == 99) is " + (!(c == 99)));
        System.out.println("!(x > 0) is " + (!(x > 0)));
        System.out.println("(i > 0) & (j < 5) is " + ((i > 0) & (j < 5)));
        System.out.println("(i > 0) | (j < 5) is " + ((i > 0) | (j < 5)));
        System.out.println("(x > y) & (i > 0) | ( j < 5) is " + ((x > y) & (i > 0) | ( j < 5)));
        System.out.println("(x > y) & (i > 0) & ( j < 5 ) is " + ((x > y) & (i > 0) & ( j < 5 )));
        System.out.println("k = (i + j ) is " + (k = (i + j )));
        System.out.println("y -= x is " + (y -= x));
        System.out.println("z = (x + y) is " + (z = (x + y)));
        System.out.println("x *= 2 is " + (x *= 2));
        System.out.println("i = j is " + (i = j));
        // System.out.println("k = (x + y) is " + (k = (x + y)));
        System.out.println("i %= j is " + (i %= j));
        System.out.println("i+= (j - 2) is " + (i+= (j - 2)));
        System.out.println("z = i / j is " + (z = i / j));
        System.out.println("k = (j = = 5 ) ? i : j is " + (k = (j == 5 ) ? i : j));
        System.out.println("a = b = d is " + (a = b = d));
        System.out.println("k = (j > 5) ? i : j is " + (k = (j > 5) ? i : j));
        System.out.println("i= j = 1.1 is " + (i = j = (int) 1.1));
        System.out.println("z = (x >= 0) ? x : 0 is " + (z));
        System.out.println("z = k = x is " + (z = x = i));
        System.out.println("z = (y >= 0) ? y : 0 is " + (z));
        System.out.println("k = z = x is " + (k));
        System.out.println("a = (c < d) ? c : d is " + (a));
        System.out.println("i += 2 is " + (i += 2));
        System.out.println("i -= (j > 0) ? j : 0 is " + (i -= (j > 0) ? j : 0));
    }
}