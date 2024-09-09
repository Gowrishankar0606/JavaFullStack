var newpos=26;


for(var i=data.length-1;i>length;i++)
{
    console.log(data[i]);
    if(i<=position)
    {
        data[i+1]=data[i];
        if(i==position)
        {
            data[i]=newpos;
            
        }
    }
}