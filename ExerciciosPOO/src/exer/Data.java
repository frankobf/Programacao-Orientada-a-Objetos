package exer;

public class Data {
	private int dia, mes, ano;

	//metodos especiais
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
// Metodos Personalizados
	
	public void setData(int _dia, int _mes, int _ano) {
		
		this.setDia(_dia);
		this.setMes(_mes);
		this.setAno(_ano);
	
	}
	
	public static boolean isBissexto(int _ano) {
		if(_ano % 400 == 0 || _ano % 4 == 0 && _ano % 100 != 0) {
			return true;
		}else {
			return false;
		}}
	
	public static boolean isDataValida(int vdia, int vmes, int vano){
		
		if (vano <= 1582) {
			return false;
			}
		if (vmes>12) {
			return false;
		}
		
		if(vmes == 1 || vmes == 3 || vmes == 5 || vmes == 7|| vmes == 10|| vmes == 8 || vmes == 12) {
			if (vdia >= 1 && vdia<= 31) {
				return true;
			} else 
				return false;
			}
		else if(vmes == 4 || vmes == 6 || vmes == 9 || vmes ==12) {
				if(vdia >= 1 && vdia<= 30) {
					return true;
				}else {
					return false;
				}}
		else if(vmes == 2) {if(vdia == 29) {
					if(Data.isBissexto(vano)) {
						return true;
				}else {
					return false;
				}
				}
			}
	
		}
		
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append(this.getDia());
		data.append("/");
		data.append(this.getMes());
		data.append("/");
		data.append(this.getAno());
		return data.toString();
	}
		
	
	
	}
	
	
	



	