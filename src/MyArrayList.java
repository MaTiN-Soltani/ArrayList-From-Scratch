public class MyArrayList {

    private Object[] items;
    private int actSize = 0;

//=======================================================================================
    public MyArrayList()
    {
        items = new Object[10];
    }
    public MyArrayList(int initialCapacity)
    {
        items = new Object[initialCapacity];
    }
//=======================================================================================
    public Object get(int index)
    {
        return items[index];
    }

    public void add(Object obj)
    {
        if(items.length == actSize)
        {
            grow(1);
        }
            this.items[actSize++] = obj;
    }

    public int size()
    {
        return actSize;
    }

    private void grow(int amount)
    {
        Object[] newarray = new Object[items.length + amount];
        for (int i = 0; i < items.length; i++)
        {
            newarray[i] = items[i];
        }
        items = newarray;
    }
//=======================================================================================

    public void set(int index, Object obj)
    {
        this.items[index] = obj;
    }

    public void append(MyArrayList other)
    {
        for(int i = 0; i < other.size(); i++)
        {
            add(other.get(i));
        }
    }

    public boolean compare(MyArrayList myList2)
    {
        if(this.size() != myList2.size())
        {
            return false;
        }
        for(int i = 0; i < this.size(); i++)
        {
            if(!(items[i].equals(myList2.get(i))))
            {
                return false;
            }
        }
        return true;
    }
  
    public void insert (int index, Object obj)
    {
        if(items.length == actSize)
        {
            grow(1);
        }
        for (int i = this.size(); i > index; i--) 
        {
            this.items[i] = this.items[i-1];
        }
        this.items[index] = obj;
        this.actSize++;
    }

    public void remove(int index)
    {
        Object[] tempList = new Object[items.length];
        for(int i = 0, j = 0; i < this.size(); i++) 
        {
            if(i == index) 
            {
                continue;
            }
            tempList[j++] = this.items[i];
        }
        this.items = tempList;
        this.actSize--;
    }

    public void remove(Object obj)
    {
        Object[] tempList = new Object[items.length];
        for(int i = 0, j = 0; i < this.size(); i++) 
        {
            if(this.items[i].equals(obj)) 
            {
                continue;
            }
            tempList[j++] = this.items[i];
        }
        this.items = tempList;
        this.actSize--;
    } 
//==============================================================
}