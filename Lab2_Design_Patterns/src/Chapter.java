import java.util.ArrayList;
import java.util.List;

public class Chapter 
{
	public String title;
	public Chapter(String title) 
	{
		this.subChapters = new ArrayList<subChapter>();
		this.title=title;
	}
	
	public List<subChapter> subChapters;
	public Book book;
	public int createSubChapter(String subChapterName) 
	{
		subChapter schp = new subChapter(subChapterName);
		subChapters.add(schp);
		return subChapters.indexOf(schp);
	}
	
	public subChapter getSubChapter(int index)
	{
		return subChapters.get(index);
	}
}
