package donapp.dao;
import java.util.ArrayList;
import donapp.model.Categoria;

public interface CategoriaDao {

	//OPERAZIONI CRUD
	public boolean insertCategoria(Categoria a);
	public boolean updateCategoria(Categoria a);
	public boolean deleteCategoria(int idCategoria);
	
	//METODI
	public ArrayList <Categoria> getAllCategorie();
	public Categoria getCategoria(int idCategoria);
	
}
