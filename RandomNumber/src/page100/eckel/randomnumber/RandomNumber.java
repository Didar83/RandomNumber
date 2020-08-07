package page100.eckel.randomnumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int i, j, k;
		// j = random number from 0 to 100;
		j = random.nextInt(200)+1;
		System.out.println("j: " + j);
		k = random.nextInt(100)+1;
		System.out.println("k: " + k);
		i = j + k;
		System.out.println("j + k = " + i);
		i = j - k;
		System.out.println("j - k = " + i);
		i = j * k;
		System.out.println("j * k = " + i);
		i = j / k;
		System.out.println("j / k = " + i);
		i = j % k;
		System.out.println("j % k = " + i);
		j %= k;
		System.out.println("j %/ k = " + j);
		
		// float
		float u, v, w;
		v = random.nextFloat();
		System.out.println("v : " + v);
		w = random.nextFloat();
		System.out.println("w : " + w);
		u = v + w;
		System.out.println("v + w : " + u);
		u = v - w;
		System.out.println("v - w : " + u);
		u = v * w;
		System.out.println("v * w : " + u);
		u = v / w;
		System.out.println("v / w : " + u);
		u += v;
		System.out.println("u += v : " + u);
		u -= v;
		System.out.println("u -= v : " + u);
		u *= v;
		System.out.println("u *= v : " + u);
		u /= v;
		System.out.println("u += v : " + u);

//		String d = "beekeeper";
//		d.substring(1, 7);
//		d = "w"+d;
//		System.out.println(d.substring(3, 7));
//		System.out.println(d);
	}

}
