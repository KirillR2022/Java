package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;  // Т.к. АГРЕГАЦИЯ
        this.poligons = new ArrayList<>();  // КОМПОЗИЦИЯ (выделяем часть свойств объекта в отдельную сущность)
    }
}