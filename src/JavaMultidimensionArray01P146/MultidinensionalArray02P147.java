package JavaMultidimensionArray01P146;

public class MultidinensionalArray02P147 {
    public static void main(String[] args) {
        int a [] [] = new int[2][3];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;

        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;


        //System.out.println(a[1][0]); // print 3
        /*
        int b [][] = { {2,3,5}, {3,4,7}, {5,2,1}};
        System.out.println(b[2][1]); // print 2 */

        for (int i = 0; i < 2 ; i++) { // outer loop for row

            for (int j = 0; j < 3 ; j++) {
                // inner loop for column
                System.out.println(a[i][j]);

            }

        }

    }
}

/*
2 4 5
3 4 7


 */
/*
public static void main(String[] args) {
    // 2 সারি (row) এবং 3 কলাম (column) বিশিষ্ট একটি 2D অ্যারে (array) তৈরি করা হচ্ছে
    int a [][] = new int[2][3];

    // প্রথম সারির প্রথম কলামে 2 রাখা হচ্ছে
    a[0][0] = 2;
    // প্রথম সারির দ্বিতীয় কলামে 4 রাখা হচ্ছে
    a[0][1] = 4;
    // প্রথম সারির তৃতীয় কলামে 5 রাখা হচ্ছে
    a[0][2] = 5;

    // দ্বিতীয় সারির প্রথম কলামে 3 রাখা হচ্ছে
    a[1][0] = 3;
    // দ্বিতীয় সারির দ্বিতীয় কলামে 4 রাখা হচ্ছে
    a[1][1] = 4;
    // দ্বিতীয় সারির তৃতীয় কলামে 7 রাখা হচ্ছে
    a[1][2] = 7;

    // নিচের কোডটি কমেন্ট আউট করা হয়েছে, তাই এটি চলবে না
    //System.out.println(a[1][0]); // print 3

    // একটি নতুন 2D অ্যারে তৈরি করা হচ্ছে যেখানে 3টি সারি এবং 3টি কলাম আছে
    int b [][] = { {2,3,5}, {3,4,7}, {5,2,1}};
    // তৃতীয় সারির দ্বিতীয় কলামের মান প্রিন্ট করা হচ্ছে (এই মানটি 2)
    System.out.println(b[2][1]); // print 2

// বাহিরের লুপটি প্রতিটি সারির জন্য কাজ করছে
    for (int i = 0; i < 2 ; i++) { // outer loop for row

        // ভিতরের লুপটি প্রতিটি কলামের জন্য কাজ করছে
        for (int j = 0; j < 3 ; j++) { // inner loop for column
        // বর্তমান সারি ও কলামের মান প্রিন্ট করা হচ্ছে
        System.out.println(a[i][j]);

        }
                }
                }
এখন, প্রতিটি লাইন ব্যাখ্যা করা হলো:

public static void main(String[] args) {

    এটি প্রোগ্রামের প্রধান অংশ, যেখানে কোড চালানো শুরু হয়।
    int a [][] = new int[2][3];

    a নামের একটি 2D অ্যারে তৈরি করা হচ্ছে, যেখানে 2 সারি এবং 3 কলাম আছে।
    a[0][0] = 2;

    প্রথম সারির প্রথম কলামে 2 রাখা হচ্ছে।
    a[0][1] = 4;

    প্রথম সারির দ্বিতীয় কলামে 4 রাখা হচ্ছে।
    a[0][2] = 5;

    প্রথম সারির তৃতীয় কলামে 5 রাখা হচ্ছে।
    a[1][0] = 3;

    দ্বিতীয় সারির প্রথম কলামে 3 রাখা হচ্ছে।
    a[1][1] = 4;

    দ্বিতীয় সারির দ্বিতীয় কলামে 4 রাখা হচ্ছে।
    a[1][2] = 7;

    দ্বিতীয় সারির তৃতীয় কলামে 7 রাখা হচ্ছে।
//System.out.println(a[1][0]); // print 3

    এই লাইনটি কমেন্ট আউট করা হয়েছে, তাই এটি চলবে না।


নিচের কোড ব্লকটি কমেন্ট আউট করা হয়েছে।
int b [][] = { {2,3,5}, {3,4,7}, {5,2,1}};

b নামের একটি নতুন 2D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে।
System.out.println(b[2][1]); // print 2

    এই লাইনটি কমেন্ট আউট করা হয়েছে, তাই এটি চলবে না।
    for (int i = 0; i < 2 ; i++) { // outer loop for row

        এই বাহিরের লুপটি 2 বার চলবে, প্রথমে i = 0 এবং তারপর i = 1।
        for (int j = 0; j < 3 ; j++) { // inner loop for column

            এই ভিতরের লুপটি 3 বার চলবে, প্রথমে j = 0, তারপর j = 1, এবং শেষে j = 2।
            System.out.println(a[i][j]);

            ভিতরের লুপটি প্রতিবার চলার সময়, a অ্যারের বর্তমান সারি (i) এবং কলাম (j) এর মান প্রিন্ট করা হচ্ছে।
            আশা করি তুমি কোডটি এখন ভালভাবে বুঝতে পেরেছো!

 */