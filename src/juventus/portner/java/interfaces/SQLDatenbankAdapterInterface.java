package juventus.portner.java.interfaces;

public interface SQLDatenbankAdapterInterface extends DatenbankAdapterInterface {

	public String[] select(QueryInterface query);
	
	public int insert(QueryInterface query);
	
	public boolean update(QueryInterface query);	
	
	public boolean delete(QueryInterface query);
	
}
