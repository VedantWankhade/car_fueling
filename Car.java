import  java.util.Scanner;

class Car
{
    static int drive(int[] stops, int tank, int n)
    {
        int stops_no = 0;
        int currStop = 0;
        int i = n-2;
        while (i>=currStop)
        {   
            if ((stops[n-1]-stops[currStop])<=tank)
                return stops_no;
            else if ((stops[i]-stops[currStop])<=tank)
            {   
                if (i == currStop)
                    return -1;
                else 
                {
                    stops_no += 1;
                    currStop = i;
                    i = n-2;
                    continue;
                }
            }
            --i;
        }
        return stops_no;        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int dest = sc.nextInt();
        int tank = sc.nextInt();
        int n = sc.nextInt();
        int stops[] =new int[n+2];
        stops[0] = 0;
        for(int i=1;i<n+1;i++)
            stops[i] = sc.nextInt();
        stops[n+1] = dest;
        int stops_no = drive(stops, tank, n+2);
        sc.close();
        System.out.println(stops_no);
    }
} 