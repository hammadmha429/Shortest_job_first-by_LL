package aaa;

public class queue {
	node start;
	public void Enqueue(int n) {
	    node t = new node();
	    t.num = n;
	    if (start == null) {
	        start = t;
	    } else {
	        if (start.num > t.num) {
	            t.next = start;
	            start = t;
	        } else {
	            node h = start;
	            while (h.next != null && h.next.num < t.num) {
	                h = h.next;
	            }
	            t.next = h.next;
	            h.next = t;
	        }
	    }
	}


	public void Dequeue()
	{
		if(start.num-2<=0)
		{
			start=start.next;
		}
		else
		{
			node t = start;
			start=start.next;
			Enqueue(t.num-2);
		}
	}


	public void displayAll()
	{
		if(start==null)
		{
			System.out.println("Stack underflow!");
		}
		else {
		node t=start;
		while(t!=null)
		{
			t.display();
			t=t.next;
		}
		}
	}
}
