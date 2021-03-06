/**
 * Character shifter for a vigenere cipher for CYBR171
 * @author Hayden Andersen
 */

public class VinShifts {
	private VinShifts() {
		char[] phrase = ("WIEVHSMYRSMCVBPROJEFWPCQPQUVHSSEDNEHUPMLRINDUVNPHSSUFJEPFFFKFUIQQDL\n" +
				"CVTIEWIEUKPCMZBVGUJDGUUHGQPVGOEEUFSIDHEHQZBRGEFLERNPWWFRRUPGTDNMG\n" +
				"UDRGDUEFDQRQJSAOFBLNHETCSFWQUNWJLDHYDTRGOFAUHEIPWPAPRNNKSPTGQUCQP\n" +
				"QUVHSNGWXOTNVSGGCYCQBUVRDRCWJCIRWETQNEPWUOEROTTRMIVVQEQSMEVKFGQY\n" +
				"FRPPFNVKBDVRUUTQPFHWIEERNPWWFRPHUWQULTJXTDGVURQBJNILUSEROTTRMIPRSD\n" +
				"GUUOGUBDKFBTGWIEYRSMDUVNPHSSDRPKKVBBQXUAUFMOUHBSORTTXPTCQPQUVHSN\n" +
				"GWXOTNNAPDHETVXOWOEEXHSHCYFCQPFTQDSECOSOIXFWQUNUPWJLVKFLCWFSYRSM\n" +
				"UZFRGRCSEXSEVKJNIVNOTHBSURDICWFDYLUHTHTECUDHKQBCQPQUVHSLCEPRCWPRAI\n" +
				"PRGABMROFAHHXBGQFVQOFNVZPROVXETHEEXHMORHEBAAFRQASEUHBREKFRUZIOYDO\n" +
				"TGGUOODLEORSEGIGIELFNVXTEQIDOOSVTGUGAELMIVLFSVKFYFHWENRQEFDUOYQDRK\n" +
				"HSWQUNWJLDHORWEFWIRQXHHCQFTYRSKUHODKQHOWWJMRRSTCQUAPQPUPFFMGQUS\n" +
				"VKFITGJAIQPSVLDWQUNANVPCQQTTCQULAZFAXHETJUPUIKUHGQFTYRSKDXUTJLT\n").toCharArray();
		int[] shifts = {13, 1, 0, 2};
		applyShifts(phrase, shifts);
	}


	private void applyShifts(char[] phrase, int[] shifts) {
		int counter = 0;
		for (int i = 0; i < phrase.length; i++) {
			if (phrase[i] == '\n') continue;
			System.out.print(phrase[i]);
			phrase[i] = (char)(phrase[i] - shifts[counter]);
			if (phrase[i] < 'A') phrase[i] = (char)('Z' + 1 - ('A' - phrase[i]));
			System.out.println(" " + phrase[i]);
			counter = (counter + 1)%4;
		}
		System.out.println(new String(phrase));
	}


	public static void main(String[] args) {
		new VinShifts();
	}
}
