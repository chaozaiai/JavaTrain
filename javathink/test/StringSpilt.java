package test;

public class StringSpilt {

	static String str = "ANNASUI,ARSOA,ASTALIFT,ATELIERCOLOGN,AUPRES,BIOTHERM,BOBBI BROWN,BOURJOIS,C.BRETON,CK,CLARINS,CLINIQUE,CRABTREE&EVELYN,DAVINES,DR.SEBAGH,ERNO LASZLO,ESTEE LAUDER,ETERNAL,EVELOM,FOREO,GLAMOURFLAGE,GREEN&TASTY,HARNN,JULIQUE,KOSE,LANCOME,MENARD,MUPLANET,NEST,NOEVIR,OPI,ORIGINS,PANASONIC,PERRICONE MD,PHILIPS,PHYTO,PLURECIL,RECLASSIFIED,RE-FA,ROYAL,SHISEIDO,SHO-BI,SHUUEMURA,SONOKO,THANN,V.ROSE,VUDHH,��ӡ,�����,���,�����&������";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = str.split(",");
		for(String item : strArray){
			System.out.println(item);
		}
	}

}
