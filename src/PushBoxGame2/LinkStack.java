package PushBoxGame2;

public class LinkStack 
{
	private item base;
    private item top;
     
    class item
    {
        public int data;
        public item next;
    }
     
    /**
     * ��ʼ��ջ
     * */
    void initStack()
    {
        top = new item();
        base = new item();
        top.data=0;
        top.next=base;
        base.data=0;
        base.next=null;
    }
     
    /**
     * ��ջ
     * */
    void push(int data)
    {
        item e = new item();
        e.data = data;
        if(top.next==base)//��һ����ջ����
        {
            e.next=base;
            top.next=e;
        }
        else
        {
            e.next=top.next;
            top.next=e;
        }
         
    }
     
    /**
     * ��ջ
     * */
    int pop()
    {
        if(top.next==base)
        {
            System.out.println("ջ��û��Ԫ�أ�");
            return 0;
        }
        else
        {
        	int redata = top.next.data;
        	top.next = top.next.next;
            return redata;
        }
    }
     
    /**
     * ��ӡջ
     * */
    void print()
    {
        System.out.print("��ӡջ��");
        item temp =top;
        while(temp.next!=base)
        {
            System.out.print(temp.next.data+"\t");
            temp =temp.next;
        }
        System.out.println();
    }
}
