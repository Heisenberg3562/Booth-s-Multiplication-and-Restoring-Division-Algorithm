package booth;

public class ResDiv{

    public static int getsize(int x){
        int c=2;
        if(x<=1)
        c = 2;
        else if(x < 4)
        c = 2;
        else if(x< 8)
        c = 3;
        else if(x< 16)
        c = 4;
        else if(x< 32)
        c = 5;
        else if(x< 64)
        c = 6;
        else if(x< 128)
        c = 7;
        else if(x< 256)
        c = 8;
        else if(x< 512)
        c = 9;
        return c;
    }

    public static int max(int x,int y){
        if(x< y)
        return(y);
        else
        return(x);
    }

}
