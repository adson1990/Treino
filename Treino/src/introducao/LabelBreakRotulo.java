package introducao;

public class LabelBreakRotulo {

	public static void main(String[] args) {
		
for (int i=0; i<=10; i++) {
			
			System.out.println(i);
			if (i==5) {
				break;//break quebro o laço inteiro apenas o laço a que ele pertence
			}
		}
		
		for (int y=0; y<=10; y++) {
			
			if (y==5) {
				continue;//continue quebra apenas a execução atual do laço n ele como um todo
			}
			System.out.println(y);
		} um:
		for (int z=0; z<=3; z++) {
			dois:
			for (int b=0; b<=10; b++) {
			
			if (b==5) {
				break um;//uso de rotulo para indicar ao break ou continue onde quer q ele quebre
				
			}
			System.out.println(b);
		}
		}
		
		boolean[][] matrix = {
				
				{false, true, false, false, false,},
				{false, false, false, false, false,}
		};
		
		busca:
		for (int a =0; a < matrix.length; a++){
			System.out.print("A ");
			for (int b=0; b < matrix[a].length;b++){
				if(matrix[a][b]){
					System.out.print("TRUE ");
					break busca;
				}
				System.out.print("B ");
			}
		}
	}

}
