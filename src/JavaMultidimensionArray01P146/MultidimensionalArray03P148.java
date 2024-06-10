package JavaMultidimensionArray01P146;

public class MultidimensionalArray03P148 {
    public static void main(String[] args) {

int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
        int minimumNumber = abc[0][0];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < minimumNumber) //2
                {
                    minimumNumber = abc[i][j];
                }

            }
        }
        System.out.println(minimumNumber);
        }
    }

/*

2 4 5
3 4 7
1 2 9
 */
/*
public static void main(String[] args) {

    // 3 সারি (row) এবং 3 কলাম (column) বিশিষ্ট একটি 2D অ্যারে (array) তৈরি করা হচ্ছে এবং সরাসরি মান দিয়ে পূরণ করা হচ্ছে
    int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};

    // minimumNumber নামে একটি ভ্যারিয়েবল তৈরি করা হচ্ছে এবং প্রথম সারির প্রথম কলামের মান (2) দিয়ে শুরু করা হচ্ছে
    int minimumNumber = abc[0][0];

    // বাহিরের লুপটি প্রতিটি সারির জন্য কাজ করছে (3টি সারি)
    for (int i = 0; i < 3; i++) {

        // ভিতরের লুপটি প্রতিটি কলামের জন্য কাজ করছে (3টি কলাম)
        for (int j = 0; j < 3; j++) {

            // বর্তমান কলামের মান যদি minimumNumber এর চেয়ে ছোট হয়
            if (abc[i][j] < minimumNumber) { // 2

                // তাহলে minimumNumber আপডেট করা হচ্ছে বর্তমান মান দিয়ে
                minimumNumber = abc[i][j];
            }

        }
    }

    // সব সারি এবং কলাম চেক করার পর, সর্বনিম্ন মান প্রিন্ট করা হচ্ছে
    System.out.println(minimumNumber); // প্রিন্ট করবে 1
}
এখন, প্রতিটি লাইন ব্যাখ্যা করা হলো:

public static void main(String[] args) {

এটি প্রোগ্রামের প্রধান অংশ, যেখানে কোড চালানো শুরু হয়।
int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};

abc নামের একটি 2D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে। এই অ্যারেটির 3টি সারি এবং 3টি কলাম আছে।
int minimumNumber = abc[0][0];

minimumNumber নামে একটি ভ্যারিয়েবল তৈরি করা হচ্ছে এবং প্রথম সারির প্রথম কলামের মান (2) দিয়ে শুরু করা হচ্ছে।
for (int i = 0; i < 3; i++) {

বাহিরের লুপটি 3 বার চলবে, প্রথমে i = 0, তারপর i = 1, এবং শেষে i = 2। এটি প্রতিটি সারির জন্য কাজ করছে।
for (int j = 0; j < 3; j++) {

ভিতরের লুপটি 3 বার চলবে, প্রথমে j = 0, তারপর j = 1, এবং শেষে j = 2। এটি প্রতিটি কলামের জন্য কাজ করছে।
if (abc[i][j] < minimumNumber) {

যদি বর্তমান কলামের মান minimumNumber এর চেয়ে ছোট হয়, তাহলে এই শর্ত সত্য হবে।
minimumNumber = abc[i][j];

যদি উপরের শর্ত সত্য হয়, তাহলে minimumNumber আপডেট করা হবে বর্তমান কলামের মান দিয়ে।
System.out.println(minimumNumber);

সব সারি এবং কলাম চেক করার পর, সর্বনিম্ন মান minimumNumber প্রিন্ট করা হচ্ছে। এখানে 1 প্রিন্ট হবে কারণ এটি অ্যারেটির মধ্যে সর্বনিম্ন মান।
আশা করি তুমি কোডটি এখন ভালভাবে বুঝতে পেরেছো!







 */