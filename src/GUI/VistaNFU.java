/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
/**
 *
 * @author rjmo_
 */
public class VistaNFU {
    	public int NOfPag, NOfFrames, checkEOStr, lengthOfString;
	int option; static File file; static BufferedReader br;  static boolean value=false;
	public int[] pageString = new int[1024];
	Scanner input = new Scanner(System.in);
        String line;

    //Enter number of pages 
	int getPageValues(){
		if(value){
			System.out.println("Enter number of pages in logical memory: ");
			NOfPag = input.nextInt();
		}
		else{
			try{
				if ((line = br.readLine()) != null) {
					NOfPag=Integer.parseInt(line);
					System.out.println("number of pages in logical memory: "+NOfPag);
				}
			}
			catch(Exception e){
			}
		}
		return NOfPag; 
	}

	//Enter number of frames
	int getFrameValues(){
		if(value){
			System.out.println("Enter number of frames in physical memory: ");
			NOfFrames = input.nextInt();
		}else{
			try{
				if ((line = br.readLine()) != null) {
					NOfFrames=Integer.parseInt(line);
					System.out.println("number of frames in physical memory: "+NOfFrames);
				}
			}
			catch(Exception e){
			}
		}
		return NOfFrames;
	}

	//Read Page String
	int[] getPageString(){
		if(value){
			System.out.println("Enter the page-reference string: (end string with -1)");
			for(int i=0; checkEOStr!=-1; ) {
				pageString[i] = input.nextInt();
				checkEOStr = pageString[i];
				lengthOfString=++i;
			}
		}else{
			String[] strings=new String[1024]; 
			int i=0;
			try{
				line = br.readLine();
				if (line != null && line.length()!=0) {
					System.out.println("The input reference string is: "+line);
					strings=line.split(" ");
					int lengthofstr = strings.length;
					if(Integer.parseInt(strings[lengthofstr-1])==-1){
						for (String str : strings){
							pageString[i++] = Integer.parseInt(str);
							lengthOfString=i;
						}
					}
					else{
						pageString =null;
					}
				}
				else{
					pageString =null;
				}		
			}
			catch(Exception e){
				System.out.println("ERROR: Wrong number format");
				pageString=null;
			}
		}
		return pageString;
	}

	//ValidatePageString
	int validatePageString(){
		for(int i=0; i<lengthOfString && pageString[i]!=-1; i++){
			if (pageString[i] < NOfPag && pageString[i] >= 0){
				//System.out.println("page1="+ pageString[i]+ " ");
			}
			else{
				System.out.println("ERROR: Invalid input");
				lengthOfString = 0;
			}
		}
		return lengthOfString;
	}

	/**
	 * Clase Principal 
	*/
	public static void main(String args[]){
		boolean loop=true;
		int option = 0;
		VistaNFU objMain = new VistaNFU(); 
		String mode;
		if (args.length == 0){
			value = true;
			mode = "interactive";
			System.out.print("Interactive Mode:\n");
		}
		else{
			mode = "batch";
			System.out.print("Reading Inputs from a Batch File:\n");
			VistaNFU.file=new File(args[0]);
			try{
				br = new BufferedReader(new FileReader(file));
			}
			catch(Exception e){
				System.out.print("File Not Found Exception, Exiting..");
			}
		}

		/**
		 * Lectura de numeros de paginas en memoria logica
		 * Lectura de numeros de pagina en memoria fisica
		 * Lectura de la referencia de pagina
		 * Validacion
		 */
		while(loop){
			option = 4;
			if(option == -2){
				System.out.println("End of file");
				break;
			}

			else if(option == 4){	
				System.out.println("\nNFU: ");
				VistaNFU nfuObject = new VistaNFU();
				int pagevalueCheck=nfuObject.getPageValues();
				if(pagevalueCheck==0){
					System.out.println("\nERROR: Invalid Page");
					break;
				}
				int frameValueCheck=nfuObject.getFrameValues();
				if(frameValueCheck==0){
					System.out.println("\nERROR: Invalid Frame");
					break;
				}
				int[] pageStringCheck=nfuObject.getPageString();
				if(pageStringCheck == null){
					System.out.println("\nERROR: Invalid Page String");
					break;
				}
				int validateinput = nfuObject.validatePageString();
				if(validateinput == 0){
					System.out.println("\nERROR: Invalid Input");
					break;
				}

			}

			else{
				System.out.println("ERROR");
			}
			if(mode=="interactive"){
				System.out.println("Do you want to continue? Yes or No:");
				Scanner choice = new Scanner(System.in);
				if((choice.nextLine()).equals("Yes")){
					loop=true;
				}else{
					loop=false;
				}
			}
			System.out.println("***********************************************************************************************************");

		}
	}

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
