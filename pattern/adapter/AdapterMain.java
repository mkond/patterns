package pattern.adapter;

public class AdapterMain {
	public static void main(String[] args){
		
		VectorGraphic g1 = new VectorAdapterFromRaster();
		g1.drawLine();
		g1.drawSquare();
	}
}

interface VectorGraphic{
	void drawLine();
	void drawSquare();
}

class RasterGraphic{
	void drawRasterSquare(){
		System.out.println("Raster quare");
	}
	void drawRasterLine(){
		System.out.println("Raster line");
	}
}

class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphic{
	public void drawLine() {
		drawRasterLine();
	}
	public void drawSquare() {
		drawRasterSquare();
	}
}
