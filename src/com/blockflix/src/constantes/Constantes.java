package com.blockflix.src.constantes;

public class Constantes {

	public static enum EstadoProducto { ALQUILADO, DISPONIBLE, NO_DISPONIBLE};

	public static enum TipoProducto { PELICULA, SERIE, MUSICA};

	public static enum Soporte { DVD, BLURAY, CD, VINILO};

	public static enum TipoTarifa{
		PELICULAS{
			public String toString(){
				return "Tarifa de Peliculas";
			}
		},SERIES{
			public String toString(){
				return "Tarifa de Series";
			}
		},MUSICA{
			public String toString(){
				return "Tarifa de M�sica";
			}
		},PELICULAS_SERIES{
			public String toString(){
				return "Tarifa de Peliculas y Series";
			}
		},PELICULAS_MUSICA{
			public String toString(){
				return "Tarifa de Peliculas y M�sica";
			}
		},SERIES_MUSICA{
			public String toString(){
				return "Tarifa de Series y M�sica";
			}
		},PREMIUM{
			public String toString(){
				return "Tarifa Premium";
			}
		}
	};


}
