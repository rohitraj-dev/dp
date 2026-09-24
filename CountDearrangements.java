class CountDearrangements
{
    static int Dearrangements(int n)
    {
        if(n<=3)
            return n-1;
        return (n-1)*(Dearrangements(n-1)+Dearrangements(n-2));
    }
}