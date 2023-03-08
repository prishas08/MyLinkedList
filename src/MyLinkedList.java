
public class MyLinkedList {
	
	ListNode head;
	ListNode last;
	private static int size;
	
	private class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int val, ListNode node)
		{
			this.val = val;
			this.next = node;
		}
		
		@Override
		public String toString()
		{
			return "" + this.val;
		}
	}
	
	//correct
	public MyLinkedList()
	{
		head = null;
	}
	
	//correct
	public MyLinkedList(int val)
	{
		head = new ListNode(val, null);
	}
	
	//correct
	public void add(int newVal)
	{
		if(head!=null)
		{
			ListNode temp = this.head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			ListNode list = new ListNode(newVal, null);
			temp.next = list;
		}
		else
		{
			head = new ListNode(newVal, null);
		}
	}
	
	//correct
	public boolean contains(int target)
	{
		ListNode temp = this.head;
		while(temp!=null)
		{
			if(temp.val==target)
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//correct
	public int get(int index)
	{
		int x = 0;
		ListNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			if(counter==index)
			{
				x = temp.val;
			}
			temp = temp.next;
			counter++;
		}
		if(index>counter)
		{
			throw new IndexOutOfBoundsException("Index Argument Is Out Of Bounds");
		}
		return x;
	}
	
	//correct
	public int indexOf(int target)
	{
		ListNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			if(temp.val==target)
			{
				return counter;
			}
			temp = temp.next;
			counter++;
		}
		return -1;	
	}
	
	//correct
	public void set(int newVal, int index)
	{
		ListNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			if(counter==index-1)
			{
				temp.next.val = newVal;
			}
			else
			{
				temp = temp.next;
			}
			counter++;
		}
		if(index>counter)
		{
			throw new IndexOutOfBoundsException("Index Argument Is Out Of Bounds");
		}
	}
	
	//correct
	public int size()
	{
		ListNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			temp = temp.next;
			counter++;
		}
		return counter;	
		
		//return sizeRecursive(this.head);
	}
	
	public int sizeRecursive(MyLinkedList.ListNode n)
	{
		while(n!=null)
		{
			sizeRecursive(n.next);
			size++;
		}
		return size;
	}
	
	

	//correct
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	//correct
	public int remove(int index)
	{
		int x = 0;
		ListNode temp = this.head;
		int counter = 0;
		if(index == 0)
		{
			x = head.val;
			head = head.next;
		}
		while(temp!=null)
		{
			if(counter==index-1)
			{
				ListNode temp2 = temp.next;
				x = temp2.val;
				temp2 = temp2.next;
				temp.next = temp2;
			}
			temp = temp.next;
			counter++;
		}
		if(index>counter)
		{
			throw new IndexOutOfBoundsException("Index Argument Is Out Of Bounds");
		}
		return x;
	}
	
	//correct
	public void add(int newVal, int index)
	{
		ListNode temp = this.head;
		int counter = 1;
		while(temp!=null)
		{
			if(counter==index)
			{
				ListNode temp2 = temp.next;
				temp.next = new ListNode(newVal, temp2);
			}
			temp = temp.next;
			counter++;
		}
		if(index>counter)
		{
			throw new IndexOutOfBoundsException("Index Argument Is Out Of Bounds");
		}
	}
	
	//correct
	public String toString()
	{
		String s = "[";
		if(head!=null)
		{
			ListNode temp = this.head;
			while(temp!=null)
			{
				s+= temp.val + ", ";
				temp = temp.next;
			}
		}
		return s + "]";
	}

}
