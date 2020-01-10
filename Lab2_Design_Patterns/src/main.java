public class main {
	
	public String Author;
	public String Book;
	public String Chapter;
	public String subChapter;
	public int Paragraph;
	public String Image;
	public String Table;
	
	public main() 
	{
		
	}
	
	public main(String A, String B, String C, String sC, int P, String I, String T)
	{
		this.Author = A;
		this.Book = B;
		this.Chapter = C;
		this.subChapter = sC;
		this.Image = I;
		this.Table = T;
	}
	
	public static void main(String [] args)
	{
		Book onEarth = new Book ("On Earth");
		Author pAndrei = new Author ("Porcarin Andrei");
		onEarth.addAuthor(pAndrei);
		int indexOfChapter = onEarth.createChapter("Chapter One");
		Chapter chOne = onEarth.getChapter(indexOfChapter);
		int indexOfSubChapter = chOne.createSubChapter("Chapter One One");
		subChapter chOneOne = chOne.getSubChapter(indexOfSubChapter);
		int indexOfParagraph = chOneOne.createParagraph("Paragraph 1");
		int indexOfImage = chOneOne.createImage("Image 1");
		int indexOfTable = chOneOne.createTable("Table 1");
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}

	public String getBook()
	{
		return Book;
	}

	public void setBook(String book)
	{
		Book = book;
	}

	public String getChapter()
	{
		return Chapter;
	}

	public void setChapter(String chapter)
	{
		Chapter = chapter;
	}

	public String getSubChapter()
	{
		return subChapter;
	}

	public void setSubChapter(String subChapter)
	{
		this.subChapter = subChapter;
	}

	public int getParagraph()
	{
		return Paragraph;
	}

	public void setParagraph(int paragraph)
	{
		Paragraph = paragraph;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getTable()
	{
		return Table;
	}

	public void setTable(String table)
	{
		Table = table;
	}
}
